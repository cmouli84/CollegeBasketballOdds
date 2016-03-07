package com.scribble.nbacb.repository;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Repository;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.scribble.nbacb.models.EventPowerRanking;
import com.scribble.nbacb.models.PowerRanking;
import com.scribble.nbacb.models.TeamRecord;
import com.scribble.nbacb.models.events.Event;
import com.scribble.nbacb.models.schedule.Season;
import com.scribble.nbacb.models.standings.Standing;
import com.scribble.nbacb.utilities.Utility;


@Repository("Cached")
public class CachedCollegeBasketBallOddsRepository extends CollegeBasketBallOddsRepository {

	private Cache<String, List<Event>> eventsCache;
	
	private Cache<String, List<Event>> eventsCachePermanent;
	
	private Cache<String, List<PowerRanking>> powerRankingsCache;
	
	private Cache<String, List<EventPowerRanking>> eventPowerRankingsCache;
	
	private Cache<String, Map<String, TeamRecord>> teamHistoryCache;

	private Cache<String, Season> seasonCache;
	
	private Map<String, String> eventsCacheKeys = new HashMap<String, String>();
	
	private Map<String, String> eventsPowerRankingsCacheKeys = new HashMap<String, String>();	
	
	public CachedCollegeBasketBallOddsRepository() {
		// TODO Auto-generated constructor stub
		eventsCache = CacheBuilder.newBuilder()
			    .concurrencyLevel(4)
			    .weakKeys()
			    .maximumSize(10000)
			    .expireAfterWrite(15, TimeUnit.MINUTES)
			    .build();

		eventsCachePermanent = CacheBuilder.newBuilder()
			    .concurrencyLevel(4)
			    .weakKeys()
			    .maximumSize(10000)
			    .expireAfterWrite(7, TimeUnit.DAYS)
			    .build();

		powerRankingsCache = CacheBuilder.newBuilder()
			    .concurrencyLevel(4)
			    .weakKeys()
			    .maximumSize(10000)
			    .expireAfterWrite(60, TimeUnit.MINUTES)
			    .build();

		eventPowerRankingsCache = CacheBuilder.newBuilder()
			    .concurrencyLevel(4)
			    .weakKeys()
			    .maximumSize(10000)
			    .expireAfterWrite(7, TimeUnit.DAYS)
			    .build();

		teamHistoryCache = CacheBuilder.newBuilder()
			    .concurrencyLevel(4)
			    .weakKeys()
			    .maximumSize(10000)
			    .expireAfterWrite(1, TimeUnit.DAYS)
			    .build();

		seasonCache = CacheBuilder.newBuilder()
			    .concurrencyLevel(4)
			    .weakKeys()
			    .maximumSize(10000)
			    .expireAfterWrite(6, TimeUnit.HOURS)
			    .build();
	}
	
	@Override
	public Season getSchedule() throws MalformedURLException, IOException {
		Season season = seasonCache.getIfPresent("SCHEDULE");
		
		if (season == null)
		{
			season = super.getSchedule();
			seasonCache.put("SCHEDULE", season);
		}
		
		// TODO Auto-generated method stub
		return season;
	}
	
	@Override
	public List<Event> getEventsByDate(Date eventDate, Season season) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		String formattedDate = new SimpleDateFormat("yyyyMMddz").format(eventDate);
		if (!eventsCacheKeys.containsKey(formattedDate))
		{
			eventsCacheKeys.put(formattedDate, formattedDate);
		}
		String cacheKey = eventsCacheKeys.get(formattedDate);
		
		Cache<String, List<Event>> cache = Utility.isPastDate(eventDate) ? eventsCachePermanent : eventsCache;
		List<Event> events = cache.getIfPresent(cacheKey);
		
		System.out.println(cacheKey);
		if (events == null)
		{
			events = super.getEventsByDate(eventDate, season);
			cache.put(cacheKey, events);
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
	public List<EventPowerRanking> getSonnyMooreEventsByDate(Date matchDate, List<Event> events)
			throws ParseException, UnknownHostException {
		// TODO Auto-generated method stub
		String formattedDate = new SimpleDateFormat("yyyyMMddz").format(matchDate);
		if (!eventsPowerRankingsCacheKeys.containsKey(formattedDate))
		{
			eventsPowerRankingsCacheKeys.put(formattedDate, formattedDate);
		}
		String cacheKey = eventsPowerRankingsCacheKeys.get(formattedDate);
		List<EventPowerRanking> eventsPowerRankings = eventPowerRankingsCache.getIfPresent(cacheKey);
		
		System.out.println(cacheKey);
		if (eventsPowerRankings == null)
		{
			eventsPowerRankings = super.getSonnyMooreEventsByDate(matchDate, events);
			eventPowerRankingsCache.put(cacheKey, eventsPowerRankings);
		}

		return eventsPowerRankings;
	}

	@Override
	public Map<String, String> getScoreApiAndSonnyMooreTeamMapping() {
		// TODO Auto-generated method stub
		return super.getScoreApiAndSonnyMooreTeamMapping();
	}
	
	@Override
	public Map<String, TeamRecord> getTeamRecords(Date matchDate, List<Event> events) throws UnknownHostException
	{
		if (!Utility.isToday(matchDate))
		{
			return null;
		}

		String formattedDate = new SimpleDateFormat("yyyyMMddz").format(matchDate);
		if (!eventsCacheKeys.containsKey(formattedDate))
		{
			eventsCacheKeys.put(formattedDate, formattedDate);
		}
		String cacheKey = eventsCacheKeys.get(formattedDate);
		
		Map<String, TeamRecord> teamHistory = teamHistoryCache.getIfPresent(cacheKey);
		
		System.out.println(cacheKey);
		if (teamHistory == null)
		{
			teamHistory = super.getTeamRecords(matchDate, events);
			teamHistoryCache.put(cacheKey, teamHistory);
		}
		
		return teamHistory;
	}

}
