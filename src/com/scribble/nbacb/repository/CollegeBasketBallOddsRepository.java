package com.scribble.nbacb.repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Repository;

import com.scribble.nbacb.models.NbacbPick;
import com.scribble.nbacb.models.PowerRanking;

@Repository
public class CollegeBasketBallOddsRepository {

	public List<NbacbPick> getNbacbOdds() throws MalformedURLException, IOException
	{
		String url = "http://www.sportsline.com/sportsline-web/service/v1/oddsPicks?league=ncaab";
		
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

		ObjectMapper mapper = new ObjectMapper();
		
		List<NbacbPick> nbacbPicks = Arrays.asList(mapper.readValue(response.toString(), NbacbPick[].class));
		
		return nbacbPicks;
	}
	
	public List<PowerRanking> getSonnyMoorePowerRaking() throws MalformedURLException, IOException
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

		List<PowerRanking> powerRankings = new ArrayList<PowerRanking>();
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
					
					System.out.println(teamName);
					
					powerRankings.add(new PowerRanking()
							{{
								setTeamName(teamName);
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
	
}
