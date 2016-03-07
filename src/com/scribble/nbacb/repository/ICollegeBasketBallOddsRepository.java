package com.scribble.nbacb.repository;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.scribble.nbacb.models.EventPowerRanking;
import com.scribble.nbacb.models.PowerRanking;
import com.scribble.nbacb.models.TeamRecord;
import com.scribble.nbacb.models.events.Event;
import com.scribble.nbacb.models.schedule.Season;
import com.scribble.nbacb.models.standings.Standing;

public interface ICollegeBasketBallOddsRepository {
	Season getSchedule() throws MalformedURLException, IOException;

	List<Event> getEventsByDate(Date eventDate, Season season) throws MalformedURLException, IOException;

	List<Standing> getTeamStandings() throws MalformedURLException, IOException;
	
	List<PowerRanking> getSonnyMoorePowerRaking() throws MalformedURLException, IOException;
	
	List<EventPowerRanking> getSonnyMooreEventsByDate(Date matchDate, List<Event> events) throws ParseException, UnknownHostException;
	
	Map<String, String> getScoreApiAndSonnyMooreTeamMapping();

	Map<String, TeamRecord> getTeamRecords(Date matchDate, List<Event> events) throws UnknownHostException;
}
