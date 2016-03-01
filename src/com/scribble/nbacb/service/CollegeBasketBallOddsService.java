package com.scribble.nbacb.service;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.scribble.nbacb.models.EventPowerRanking;
import com.scribble.nbacb.models.NbacbPrediction;
import com.scribble.nbacb.models.PowerRanking;
import com.scribble.nbacb.models.events.Event;
import com.scribble.nbacb.repository.ICollegeBasketBallOddsRepository;

@Service
public class CollegeBasketBallOddsService {

	@Autowired
	@Qualifier("Cached")
	private ICollegeBasketBallOddsRepository nbacbRepository;

	public List<NbacbPrediction> getMatchesByDate(Date matchDate) throws IOException, ParseException
	{
		Date currentDate = new Date();
		
		List<NbacbPrediction> nbacbPredictions = new ArrayList<>();
		
		Boolean isPastEventDate = getIsPastDate(matchDate);
		
		List<Event> events = nbacbRepository.getEventsByDate(matchDate, isPastEventDate); 
		
		//List<Standing> standings = nbacbRepository.getTeamStandings();
		
		List<PowerRanking> powerRankings = nbacbRepository.getSonnyMoorePowerRaking();
		List<EventPowerRanking> eventPowerRankings = null;
		
		if (isPastEventDate)
		{
			eventPowerRankings = nbacbRepository.getSonnyMooreEventsByDate(matchDate, events);
		}
		
		Map<String, String> teamMappings = nbacbRepository.getScoreApiAndSonnyMooreTeamMapping();
		
		for (Event event: events)
		{
			DateFormat format = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
			Date eventDate = format.parse(event.getGame_date());
			
			if (!new SimpleDateFormat("yyyy-MM-dd z").format(matchDate)
					.equals(new SimpleDateFormat("yyyy-MM-dd z").format(eventDate)))
			{
				continue;
			}
			
			String scoreApiHomeTeamName = event.getHome_team().getFull_name();
			String scoreApiAwayTeamName = event.getAway_team().getFull_name();
			
			//Standing homeTeamStanding = getTeamStanding(scoreApiHomeTeamName, standings);
			//Standing awayTeamStanding = getTeamStanding(scoreApiAwayTeamName, standings);
			
			PowerRanking homeTeamRanking = teamMappings.get(scoreApiHomeTeamName) == null 
					? null : getMatchingTeamName(powerRankings, teamMappings.get(scoreApiHomeTeamName));
			PowerRanking awayTeamRanking = teamMappings.get(scoreApiAwayTeamName) == null 
					? null : getMatchingTeamName(powerRankings, teamMappings.get(scoreApiAwayTeamName));
			Double sonnyMooreOdds;
			if (isPastEventDate)
			{
				EventPowerRanking eventPowerRanking = getEventPowerRankingById(eventPowerRankings, event.getId());
				sonnyMooreOdds = (eventPowerRanking == null || eventPowerRanking.getHomeTeamRanking() == 0 || eventPowerRanking.getAwayTeamRanking() == 0) 
						? -999999
						: Math.round((eventPowerRanking.getAwayTeamRanking() - eventPowerRanking.getHomeTeamRanking() - 3.25) * 100.0) / 100.0;
			}
			else
			{	
				sonnyMooreOdds = (homeTeamRanking == null || awayTeamRanking == null || homeTeamRanking.getPowerRanking() == 0 || awayTeamRanking.getPowerRanking() == 0) 
						? -999999
						: Math.round((awayTeamRanking.getPowerRanking() - homeTeamRanking.getPowerRanking() - 3.25) * 100.0) / 100.0;
			}
			
			Double currentOdd = event.getOdd() == null || event.getOdd().getHome_odd().startsWith("pk") || event.getOdd().getHome_odd().startsWith("N") 
					? -999999 
					: event.getOdd().getHome_odd().startsWith("T") 
						? (-1) * Double.parseDouble(event.getOdd().getAway_odd()) 
						: Double.parseDouble(event.getOdd().getHome_odd());
			
			nbacbPredictions.add(new NbacbPrediction() {{
				setHomeTeamName(scoreApiHomeTeamName);
				setAwayTeamName(scoreApiAwayTeamName);
				setHomeWins(homeTeamRanking == null ? 0 : homeTeamRanking.getWins());
				setHomeLoses(homeTeamRanking == null ? 0 : homeTeamRanking.getLoses());
				setAwayWins(awayTeamRanking == null ? 0 : awayTeamRanking.getWins());
				setAwayLoses(awayTeamRanking == null ? 0 : awayTeamRanking.getLoses());
				setGameDate(new SimpleDateFormat("EEE MM/dd hh:mm a z").format(eventDate));
				setWestgateCurrentPointSpread(currentOdd);
				setSonnyMoorePointSpread(sonnyMooreOdds);
				setHomeScore(((eventDate.getTime() > currentDate.getTime()) || (event.getBox_score() == null) || (event.getBox_score().getScore() == null)) 
						? -999999 : event.getBox_score().getScore().getHome().getScore());
				setAwayScore(((eventDate.getTime() > currentDate.getTime()) || (event.getBox_score() == null) || (event.getBox_score().getScore() == null)) 
						? -999999 : event.getBox_score().getScore().getAway().getScore());
			}});
		}
		
		Collections.sort(nbacbPredictions);
		
		return nbacbPredictions;
	}

	private Boolean getIsPastDate(Date matchDate) {
		Calendar matchDateCalendar = Calendar.getInstance();
		matchDateCalendar.setTime(matchDate);
		Calendar currentDateCalendar = Calendar.getInstance();
		return (matchDateCalendar.get(Calendar.YEAR) < currentDateCalendar.get(Calendar.YEAR))
				|| (matchDateCalendar.get(Calendar.YEAR) == currentDateCalendar.get(Calendar.YEAR) && matchDateCalendar.get(Calendar.MONTH) < currentDateCalendar.get(Calendar.MONTH))
				|| (matchDateCalendar.get(Calendar.YEAR) == currentDateCalendar.get(Calendar.YEAR) 
					&& matchDateCalendar.get(Calendar.MONTH) == currentDateCalendar.get(Calendar.MONTH) && matchDateCalendar.get(Calendar.DATE) < currentDateCalendar.get(Calendar.DATE));
	}
	
	/*private Standing getTeamStanding(String teamName, List<Standing> standings)
	{
		for (Standing standing: standings)
		{
			if (standing.getTeam().getFull_name().equals(teamName))
			{
				return standing;
			}
		}
		return null;
	}*/
	
	private PowerRanking getMatchingTeamName(List<PowerRanking> sonnyMoorePowerRanking, String teamName) {
		for (PowerRanking powerRanking : sonnyMoorePowerRanking)
		{
			if (teamName.equals(powerRanking.getTeamName()))
			{
				return powerRanking;
			}
		}
		return null;
	}
	
	private EventPowerRanking getEventPowerRankingById(List<EventPowerRanking> eventPowerRankings, Integer eventId) {
		for (EventPowerRanking eventPowerRanking : eventPowerRankings)
		{
			if (eventPowerRanking.getEventId().equals(eventId))
			{
				return eventPowerRanking;
			}
		}
		return null;
	}
}
