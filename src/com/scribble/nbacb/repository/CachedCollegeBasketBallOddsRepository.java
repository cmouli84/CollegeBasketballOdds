package com.scribble.nbacb.repository;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Repository;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.scribble.nbacb.models.EventPowerRanking;
import com.scribble.nbacb.models.PowerRanking;
import com.scribble.nbacb.models.events.Event;
import com.scribble.nbacb.models.standings.Standing;


@Repository("Cached")
public class CachedCollegeBasketBallOddsRepository extends CollegeBasketBallOddsRepository {

	private Cache<String, List<Event>> eventsCache;
	
	private Cache<String, List<PowerRanking>> powerRankingsCache;
	
	public CachedCollegeBasketBallOddsRepository() {
		// TODO Auto-generated constructor stub
		eventsCache = CacheBuilder.newBuilder()
			    .concurrencyLevel(4)
			    .weakKeys()
			    .maximumSize(10000)
			    .expireAfterWrite(15, TimeUnit.MINUTES)
			    .build();

		powerRankingsCache = CacheBuilder.newBuilder()
			    .concurrencyLevel(4)
			    .weakKeys()
			    .maximumSize(10000)
			    .expireAfterWrite(60, TimeUnit.MINUTES)
			    .build();
	}
	
	@Override
	public List<Event> getEventsByDate(Date eventDate) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		String formattedDate = new SimpleDateFormat("yyyy-MM-dd z").format(eventDate);
		List<Event> events = eventsCache.getIfPresent(formattedDate);
		
		if (events == null)
		{
			events = super.getEventsByDate(eventDate);
			eventsCache.put(formattedDate, events);
		}
		
		return events;
	}

	@Override
	public List<Standing> getTeamStandings() throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		return super.getTeamStandings();
	}

	@Override
	public List<PowerRanking> getSonnyMoorePowerRaking() throws MalformedURLException, IOException {
		List<PowerRanking> powerRankings = powerRankingsCache.getIfPresent("S");
		
		if (powerRankings == null)
		{
			powerRankings = super.getSonnyMoorePowerRaking();
			powerRankingsCache.put("S", powerRankings);
		}
		
		// TODO Auto-generated method stub
		return powerRankings;
	}

	@Override
	public List<EventPowerRanking> getSonnyMooreEventsByDate(List<Event> events)
			throws ParseException, UnknownHostException {
		// TODO Auto-generated method stub
		return super.getSonnyMooreEventsByDate(events);
	}

	@Override
	public Map<String, String> getScoreApiAndSonnyMooreTeamMapping() {
		// TODO Auto-generated method stub
		return super.getScoreApiAndSonnyMooreTeamMapping();
	}

}
