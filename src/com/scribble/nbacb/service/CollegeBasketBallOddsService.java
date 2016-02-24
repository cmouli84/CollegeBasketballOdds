package com.scribble.nbacb.service;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scribble.nbacb.models.NbacbPrediction;
import com.scribble.nbacb.models.PowerRanking;
import com.scribble.nbacb.models.events.Event;
import com.scribble.nbacb.repository.CollegeBasketBallOddsRepository;

@Service
public class CollegeBasketBallOddsService {

	@Autowired
	private CollegeBasketBallOddsRepository nbacbRepository;

	public List<NbacbPrediction> getMatchesByDate(Date matchDate) throws IOException, ParseException
	{
		List<NbacbPrediction> nbacbPredictions = new ArrayList<>();
		
		List<Event> events = nbacbRepository.getEventsByDate(matchDate); 
		
		for (Event event: events)
		{
			DateFormat format = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
			Date eventDate = format.parse(event.getGame_date());
			
			if (!new SimpleDateFormat("yyyy-MM-dd z").format(matchDate).equals(new SimpleDateFormat("yyyy-MM-dd z").format(eventDate)))
			{
				continue;
			}

			nbacbPredictions.add(new NbacbPrediction() {{
				setHomeTeamName(event.getHome_team().getFull_name());
				setAwayTeamName(event.getAway_team().getFull_name());
				setGameDate(new SimpleDateFormat("EEE MM/dd hh:mm a z").format(eventDate));
				setWestgateCurrentPointSpread(event.getOdd() == null || event.getOdd().getHome_odd().startsWith("T")  || event.getOdd().getHome_odd().startsWith("pk") 
						? 0 : Double.parseDouble(event.getOdd().getHome_odd()));
			}});
		}
		
		return nbacbPredictions;
	}
	
	private PowerRanking getMatchingTeamName(List<PowerRanking> sonnyMoorePowerRanking, String teamName, Long wins, Long loses) {
		System.out.println("TeamName : " + teamName);
		
		for (PowerRanking powerRanking : sonnyMoorePowerRanking)
		{
			if (teamName.equals(powerRanking.getTeamName()))
			{
				System.out.println("MATCH : " + powerRanking.getTeamName());
				return powerRanking;
			}
		}
		
		return null;
	}
	
}
