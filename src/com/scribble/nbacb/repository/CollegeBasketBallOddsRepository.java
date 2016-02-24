package com.scribble.nbacb.repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Repository;

import com.scribble.nbacb.models.PowerRanking;
import com.scribble.nbacb.models.events.Event;
import com.scribble.nbacb.models.schedule.Current_season;
import com.scribble.nbacb.models.schedule.Season;

@Repository
public class CollegeBasketBallOddsRepository {

	public List<Event> getEventsByDate(Date eventDate) throws MalformedURLException, IOException
	{
		List<Event> matches = new ArrayList<>();
		Calendar toDateCalendar = Calendar.getInstance();
		toDateCalendar.setTime(eventDate);
		toDateCalendar.add(Calendar.HOUR, 24);
		List<Event> eventDayMatches = getMatchesByDate(new SimpleDateFormat("yyyy-MM-dd").format(eventDate));
		List<Event> nexttEventDayMatches = getMatchesByDate(new SimpleDateFormat("yyyy-MM-dd").format(toDateCalendar.getTime()));
		
		for (Event event: eventDayMatches)
		{
			matches.add(event);
		}
		for (Event event: nexttEventDayMatches)
		{
			matches.add(event);
		}

		return matches;
	}	
	
	public ArrayList<PowerRanking> getSonnyMoorePowerRaking() throws MalformedURLException, IOException
	{
		String url = "http://sonnymoorepowerratings.com/m-basket.htm";
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		int responseCode = con.getResponseCode();
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String content;
		StringBuffer response = new StringBuffer();

		ArrayList<PowerRanking> powerRankings = new ArrayList<PowerRanking>();
		Boolean contentStarted = false;
		while ((content = in.readLine()) != null) {
			response.append(content);

			if (contentStarted)
			{
				content = content.trim();

				if (contentStarted && content.equals("<BR>"))
				{
					break;
				}
				
				for (String inputLine : content.split("\n"))
				{
					int firstIndexOfSpace = inputLine.indexOf(' ');
					String teamName = inputLine.substring(firstIndexOfSpace, inputLine.indexOf("    ", firstIndexOfSpace));
					inputLine = inputLine.substring(inputLine.indexOf("    ", firstIndexOfSpace)).trim();
					firstIndexOfSpace = inputLine.indexOf(' ');
					int wins = Integer.parseInt(inputLine.substring(0, firstIndexOfSpace).trim());
					inputLine = inputLine.substring(firstIndexOfSpace).trim();
					firstIndexOfSpace = inputLine.indexOf(' ');
					int loses = Integer.parseInt(inputLine.substring(0, firstIndexOfSpace).trim());
					inputLine = inputLine.substring(firstIndexOfSpace).trim();
					firstIndexOfSpace = inputLine.indexOf(' ');
					int ties = Integer.parseInt(inputLine.substring(0, firstIndexOfSpace).trim());
					inputLine = inputLine.substring(firstIndexOfSpace).trim();
					firstIndexOfSpace = inputLine.indexOf(' ');
					double sos = Double.parseDouble(inputLine.substring(0, firstIndexOfSpace).trim());
					inputLine = inputLine.substring(firstIndexOfSpace).trim();
					double powerRanking = Double.parseDouble(inputLine);
					
					powerRankings.add(new PowerRanking()
							{{
								setTeamName(GetTeamName(teamName));
								setWins(wins);
								setLoses(loses);
								setTies(ties);
								setSOS(sos);
								setPowerRanking(powerRanking);
							}});
				}							
			}

			if (content.startsWith("<B>"))
			{
				contentStarted = true;
			}
			
		}
		in.close();
		
		System.out.println("Power Ranking Count " + powerRankings.size());
		
		return powerRankings;
	}
	
	private List<Event> getMatchesByDate(String matchDate) throws MalformedURLException, IOException
	{
		String scheduleUrl = "http://api.thescore.com/ncaab/schedule";
		String eventsUrlFormat = "http://api.thescore.com/ncaab/events?id.in=%s";
		List<Event> matches = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		
		String scheduleResponse = getWebResponse(scheduleUrl);
		Season season = mapper.readValue(scheduleResponse, Season.class);

		Current_season matchSeason = null;
		for (Current_season currSeason: season.getCurrent_season())
		{
			if (currSeason.getId().equals(matchDate))
			{
				matchSeason = currSeason;
				break;
			}
		}
		
		if (matchSeason != null)
		{
			String eventIds = String.join(",", Arrays.toString(matchSeason.getEvent_ids().toArray()));
			String eventsUrl = String.format(eventsUrlFormat, URLEncoder.encode(eventIds, "utf-8"));
			
			String eventsResponse = getWebResponse(eventsUrl);
			matches = Arrays.asList(mapper.readValue(eventsResponse, Event[].class));
		}
		
		return matches;
	}	

	private String getWebResponse(String url) throws MalformedURLException, IOException, ProtocolException {
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header
		//con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		return response.toString();
	}
	
	private String GetTeamName(String teamName)
	{
		String formattedTeamName = teamName.trim().toUpperCase();
		
		return formattedTeamName;
	}
	
}
