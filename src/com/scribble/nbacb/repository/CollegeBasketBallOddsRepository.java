package com.scribble.nbacb.repository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Repository;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;
import com.amazonaws.services.dynamodbv2.document.ScanOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.ScanSpec;
import com.scribble.nbacb.models.EventPowerRanking;
import com.scribble.nbacb.models.PowerRanking;
import com.scribble.nbacb.models.TeamEvent;
import com.scribble.nbacb.models.TeamRecord;
import com.scribble.nbacb.models.events.Event;
import com.scribble.nbacb.models.schedule.Current_season;
import com.scribble.nbacb.models.schedule.Season;
import com.scribble.nbacb.models.standings.Standing;

@Repository("Realtime")
public class CollegeBasketBallOddsRepository implements ICollegeBasketBallOddsRepository {

	public Season getSchedule() throws MalformedURLException, IOException {
		String scheduleUrl = "http://api.thescore.com/nfl/schedule";
		ObjectMapper mapper = new ObjectMapper();
		
		String scheduleResponse = getWebResponse(scheduleUrl);
		return mapper.readValue(scheduleResponse, Season.class);
	}

	
	public List<Event> getEventsByDate(Date eventDate, Season season) throws MalformedURLException, IOException
	{
		List<Event> matches = new ArrayList<>();
		Calendar toDateCalendar = Calendar.getInstance();
		toDateCalendar.setTime(eventDate);
		toDateCalendar.add(Calendar.HOUR, 24);
		List<Event> eventDayMatches = getMatchesByDate(new SimpleDateFormat("yyyy-MM-dd").format(eventDate),
				new SimpleDateFormat("yyyy-MM-dd").format(toDateCalendar.getTime()), season);
		
		for (Event event: eventDayMatches)
		{
			matches.add(event);
		}

		return matches;
	}	
	
	public List<Standing> getTeamStandings() throws MalformedURLException, IOException
	{
		String standingsUrl = "http://api.thescore.com/ncaab/standings";
		ObjectMapper mapper = new ObjectMapper();
		
		String standingsResponse = getWebResponse(standingsUrl);
		List<Standing> standings = Arrays.asList(mapper.readValue(standingsResponse, Standing[].class));

		return standings;
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
								setTeamName(getFormattedTeamName(teamName));
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

	public List<EventPowerRanking> getSonnyMooreEventsByDate(Date matchDate, List<Event> events) throws ParseException, UnknownHostException {
		
		List<EventPowerRanking> eventPowerRankings = new ArrayList<>();

		DynamoDB dynamoDb = getDynamoDbInstance();

        Table teams = dynamoDb.getTable("Events");

    	System.out.println("Event Count : " + events.size());

    	for (Event event: events)
        {        	
        	PrimaryKey primaryKey = new PrimaryKey();
			primaryKey.addComponent("EventId", event.getId());
        
        	Item item = teams.getItem(primaryKey);
        	
        	if (item == null)
        	{
        		continue;
        	}
        	
        	eventPowerRankings.add(new EventPowerRanking() {{
        		setEventId(item.getInt("EventId"));
        		setHomeTeamName(item.getString("HomeTeamName"));
        		setHomeTeamRanking(item.getDouble("HomeTeamRanking"));
        		setAwayTeamName(item.getString("AwayTeamName"));
        		setAwayTeamRanking(item.getDouble("AwayTeamRanking"));
        		setEventDate(new SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.ENGLISH).parse(item.getString("EventDate")));
        	}});
        }
		
		return eventPowerRankings;
	}

	private DynamoDB getDynamoDbInstance() throws UnknownHostException {
		ClientConfiguration clientConfiguration = new ClientConfiguration();
		if (InetAddress.getLocalHost().getHostName().toUpperCase().equals("V00972473"))
		{
			clientConfiguration.setProxyHost("webproxysea.nordstrom.net");
			clientConfiguration.setProxyPort(8181);
		}
		
		AmazonDynamoDB amazonDynamoDb = new AmazonDynamoDBClient(clientConfiguration).<AmazonDynamoDBClient>withRegion(Regions.US_WEST_2);
		
        DynamoDB dynamoDb = new DynamoDB(amazonDynamoDb);
		return dynamoDb;
	}
	
	public Map<String, String> getScoreApiAndSonnyMooreTeamMapping()
	{
		Map<String, String> dictionary = new HashMap<>();
		
		dictionary.put("North Carolina Central","NORTH CAROLINA CENTRAL");
		dictionary.put("Portland","PORTLAND");
		dictionary.put("Idaho","IDAHO");
		dictionary.put("Stephen F. Austin","S. F. AUSTIN");
		dictionary.put("Lipscomb","LIPSCOMB");
		dictionary.put("Florida Gulf Coast","FLORIDA GULF COAST");
		dictionary.put("South Florida","SOUTH FLORIDA");
		dictionary.put("Appalachian State","APPALACHIAN ST.");
		dictionary.put("NJIT","N.J. TECH");
		dictionary.put("Delaware","DELAWARE");
		dictionary.put("North Dakota State","NORTH DAKOTA ST.");
		dictionary.put("Missouri","MISSOURI");
		dictionary.put("Utah","UTAH");
		dictionary.put("Saint Mary's","ST. MARY'S CA.");
		dictionary.put("UC Riverside","CALIFORNIA RIVERSIDE");
		dictionary.put("Bryant","BRYANT");
		dictionary.put("Siena","SIENA");
		dictionary.put("Fordham","FORDHAM");
		dictionary.put("Mercer","MERCER");
		dictionary.put("Clemson","CLEMSON");
		dictionary.put("New Hampshire","NEW HAMPSHIRE");
		dictionary.put("VCU","VCU");
		dictionary.put("Oakland","OAKLAND MI");
		dictionary.put("Central Arkansas","CENTRAL ARKANSAS");
		dictionary.put("Holy Cross","HOLY CROSS");
		dictionary.put("IUPUI","IUPUI");
		dictionary.put("Jackson State","JACKSON ST.");
		dictionary.put("North Carolina A&T","NORTH CAROLINA A&T");
		dictionary.put("Charleston Southern","CHARLESTON SOUTHERN");
		dictionary.put("Southern Illinois","SOUTHERN ILLINOIS");
		dictionary.put("Nevada","NEVADA");
		dictionary.put("Connecticut","CONNECTICUT");
		dictionary.put("Albany","ALBANY");
		dictionary.put("Oregon","OREGON");
		dictionary.put("Rio Grande","TEXAS RIO GRANDE VALLEY");
		dictionary.put("Delaware State","DELAWARE ST.");
		dictionary.put("Northern Kentucky","NORTHERN KENTUCKY");
		dictionary.put("Notre Dame","NOTRE DAME");
		dictionary.put("Penn State","PENN ST.");
		dictionary.put("Seattle","SEATTLE");
		dictionary.put("Evansville","EVANSVILLE");
		dictionary.put("Fairfield","FAIRFIELD");
		dictionary.put("Saint Francis U","ST. FRANCIS PA.");
		dictionary.put("UC Davis","CALIFORNIA DAVIS");
		dictionary.put("Wagner","WAGNER");
		dictionary.put("North Florida","NORTH FLORIDA");
		dictionary.put("Northern Iowa","NORTHERN IOWA");
		dictionary.put("SIUE","SIU EDWARDSVILLE");
		dictionary.put("Oklahoma State","OKLAHOMA ST.");
		dictionary.put("Grambling State","GRAMBLING ST.");
		dictionary.put("Buffalo","BUFFALO");
		dictionary.put("North Dakota","NORTH DAKOTA");
		dictionary.put("Drake","DRAKE");
		dictionary.put("Iowa State","IOWA ST.");
		dictionary.put("Cal State Northridge","CAL STATE NORTHRIDGE");
		dictionary.put("Georgia","GEORGIA");
		dictionary.put("Tennessee","TENNESSEE");
		dictionary.put("Hampton","HAMPTON");
		dictionary.put("South Dakota State","SOUTH DAKOTA ST.");
		dictionary.put("Troy","TROY ST.");
		dictionary.put("Ohio State","OHIO ST.");
		dictionary.put("Texas A&M-Corpus Christi","TEXAS A&M-CORPUS CHRISTI");
		dictionary.put("VMI","VMI");
		dictionary.put("St. Francis Brooklyn","ST. FRANCIS BROOKLYN");
		dictionary.put("UC Santa Barbara","CALIFORNIA SANTA BARBARA");
		dictionary.put("Jacksonville State","JACKSONVILLE ST.");
		dictionary.put("Georgia Tech","GEORGIA TECH");
		dictionary.put("Tulane","TULANE");
		dictionary.put("North Texas","NORTH TEXAS");
		dictionary.put("Eastern Illinois","EASTERN ILLINOIS");
		dictionary.put("Utah Valley","UTAH VALLEY ST.");
		dictionary.put("UNC Asheville","NORTH CAROLINA ASHEVILLE");
		dictionary.put("Michigan State","MICHIGAN ST.");
		dictionary.put("Loyola Marymount","LOYOLA MARYMOUNT");
		dictionary.put("Old Dominion","OLD DOMINION");
		dictionary.put("Morehead State","MOREHEAD ST.");
		dictionary.put("Columbia","COLUMBIA");
		dictionary.put("Saint Joseph's","ST. JOSEPH'S PA.");
		dictionary.put("Western Kentucky","WESTERN KENTUCKY");
		dictionary.put("UNCW","NORTH CAROLINA WILMINGTON");
		dictionary.put("Oregon State","OREGON ST.");
		dictionary.put("Abilene Christian","ABILENE CHRISTIAN");
		dictionary.put("South Dakota","SOUTH DAKOTA");
		dictionary.put("Yale","YALE");
		dictionary.put("New Mexico","NEW MEXICO");
		dictionary.put("Hartford","HARTFORD");
		dictionary.put("Vanderbilt","VANDERBILT");
		dictionary.put("Long Beach State","LONG BEACH ST.");
		dictionary.put("Rutgers","RUTGERS");
		dictionary.put("Binghamton","BINGHAMTON");
		dictionary.put("USC Upstate","SOUTH CAROLINA UPSTATE");
		dictionary.put("UT Martin","TENNESSEE MARTIN");
		dictionary.put("Colorado State","COLORADO ST.");
		dictionary.put("BYU","BYU");
		dictionary.put("Auburn","AUBURN");
		dictionary.put("Boise State","BOISE ST.");
		dictionary.put("Stetson","STETSON");
		dictionary.put("UL-Lafayette","LOUISIANA-LAFAYETTE");
		dictionary.put("Furman","FURMAN");
		dictionary.put("Eastern Kentucky","EASTERN KENTUCKY");
		dictionary.put("Cleveland State","CLEVELAND ST.");
		dictionary.put("Texas A&M","TEXAS A&M");
		dictionary.put("Wyoming","WYOMING");
		dictionary.put("Richmond","RICHMOND");
		dictionary.put("Pacific","PACIFIC");
		dictionary.put("Virginia","VIRGINIA");
		dictionary.put("Belmont","BELMONT");
		dictionary.put("Georgia State","GEORGIA ST.");
		dictionary.put("Rice","RICE");
		dictionary.put("Liberty","LIBERTY");
		dictionary.put("Texas State","TEXAS ST.");
		dictionary.put("Ohio","OHIO UNIVERSITY");
		dictionary.put("Maryland Eastern Shore","MARYLAND EASTERN SHORE");
		dictionary.put("Prairie View A&M","PRAIRIE VIEW");
		dictionary.put("Maryland","MARYLAND");
		dictionary.put("Lehigh","LEHIGH");
		dictionary.put("Green Bay","WISCONSIN GREEN BAY");
		dictionary.put("Northwestern","NORTHWESTERN");
		dictionary.put("Fairleigh Dickinson","FAIRLEIGH DICKINSON");
		dictionary.put("Eastern Michigan","EASTERN MICHIGAN");
		dictionary.put("Miami (FL)","MIAMI FLORIDA");
		dictionary.put("Virginia Tech","VIRGINIA TECH");
		dictionary.put("San Diego State","SAN DIEGO ST.");
		dictionary.put("Middle Tennessee","MIDDLE TENNESSEE ST.");
		dictionary.put("Wichita State","WICHITA ST.");
		dictionary.put("Alabama","ALABAMA");
		dictionary.put("New Mexico State","NEW MEXICO ST.");
		dictionary.put("Vermont","VERMONT");
		dictionary.put("Northwestern State","NORTHWESTERN ST.");
		dictionary.put("Texas","TEXAS");
		dictionary.put("Manhattan","MANHATTAN");
		dictionary.put("Colgate","COLGATE");
		dictionary.put("Canisius","CANISIUS");
		dictionary.put("TCU","TCU");
		dictionary.put("Loyola Chicago","LOYOLA ILLINOIS");
		dictionary.put("Miami (OH)","MIAMI OHIO");
		dictionary.put("Weber State","WEBER ST.");
		dictionary.put("Missouri State","MISSOURI ST.");
		dictionary.put("Akron","AKRON");
		dictionary.put("Montana","MONTANA");
		dictionary.put("Navy","NAVY");
		dictionary.put("Coastal Carolina","COASTAL CAROLINA");
		dictionary.put("Incarnate Word","INCARNATE WORD");
		dictionary.put("Loyola Maryland","LOYOLA MARYLAND");
		dictionary.put("Pepperdine","PEPPERDINE");
		dictionary.put("Howard","HOWARD");
		dictionary.put("Milwaukee","WISCONSIN MILWAUKEE");
		dictionary.put("Arkansas State","ARKANSAS ST.");
		dictionary.put("Nebraska","NEBRASKA");
		dictionary.put("Northeastern","NORTHEASTERN");
		dictionary.put("IPFW","IUPU FT. WAYNE");
		dictionary.put("Cal Poly","CAL POLY");
		dictionary.put("St. John's","ST. JOHN'S");
		dictionary.put("South Alabama","SOUTH ALABAMA");
		dictionary.put("Florida A&M","FLORIDA A&M");
		dictionary.put("La Salle","LA SALLE");
		dictionary.put("Sam Houston State","SAM HOUSTON ST.");
		dictionary.put("Ball State","BALL ST.");
		dictionary.put("Western Illinois","WESTERN ILLINOIS");
		dictionary.put("Sacramento State","SACRAMENTO ST.");
		dictionary.put("Southeastern Louisiana","SE LOUISIANA");
		dictionary.put("Central Connecticut State","CENTRAL CONNECTICUT ST.");
		dictionary.put("California","CALIFORNIA");
		dictionary.put("South Carolina","SOUTH CAROLINA");
		dictionary.put("Boston University","BOSTON UNIVERSITY");
		dictionary.put("Charleston","COLLEGE OF CHARLESTON");
		dictionary.put("William & Mary","WILLIAM & MARY");
		dictionary.put("Lamar","LAMAR");
		dictionary.put("Marist","MARIST");
		dictionary.put("Pittsburgh","PITTSBURGH");
		dictionary.put("Niagara","NIAGARA");
		dictionary.put("Providence","PROVIDENCE");
		dictionary.put("Arizona","ARIZONA");
		dictionary.put("Seton Hall","SETON HALL");
		dictionary.put("Santa Clara","SANTA CLARA");
		dictionary.put("Montana State","MONTANA ST.");
		dictionary.put("Indiana State","INDIANA ST.");
		dictionary.put("George Mason","GEORGE MASON");
		dictionary.put("FIU","FLORIDA INTERNATIONAL");
		dictionary.put("Southern University","SOUTHERN");
		dictionary.put("Arkansas","ARKANSAS");
		dictionary.put("Tulsa","TULSA");
		dictionary.put("Savannah State","SAVANNAH ST.");
		dictionary.put("Denver","DENVER");
		dictionary.put("Xavier","XAVIER");
		dictionary.put("Southern Utah","SOUTHERN UTAH");
		dictionary.put("McNeese State","McNEESE ST.");
		dictionary.put("Winthrop","WINTHROP");
		dictionary.put("American University","AMERICAN");
		dictionary.put("Mount St. Mary's","MT. ST. MARY'S MD.");
		dictionary.put("Hawaii","HAWAII");
		dictionary.put("Cal State Fullerton","CAL STATE FULLERTON");
		dictionary.put("UNCG","NORTH CAROLINA GREENSBORO");
		dictionary.put("East Tennessee State","EAST TENNESSEE ST.");
		dictionary.put("Grand Canyon","GRAND CANYON");
		dictionary.put("UTSA","TEXAS SAN ANTONIO");
		dictionary.put("Penn","PENNSYLVANIA");
		dictionary.put("Gonzaga","GONZAGA");
		dictionary.put("Dartmouth","DARTMOUTH");
		dictionary.put("Campbell","CAMPBELL");
		dictionary.put("DePaul","DEPAUL");
		dictionary.put("Longwood","LONGWOOD");
		dictionary.put("Hofstra","HOFSTRA");
		dictionary.put("Stony Brook","STONY BROOK");
		dictionary.put("UC Irvine","CALIFORNIA IRVINE");
		dictionary.put("San Jose State","SAN JOSE ST.");
		dictionary.put("LIU Brooklyn","LONG ISLAND UNIVERSITY");
		dictionary.put("Wofford","WOFFORD");
		dictionary.put("Saint Louis","ST. LOUIS");
		dictionary.put("Minnesota","MINNESOTA");
		dictionary.put("Villanova","VILLANOVA");
		dictionary.put("Army","ARMY");
		dictionary.put("Kansas State","KANSAS ST.");
		dictionary.put("Michigan","MICHIGAN");
		dictionary.put("Fresno State","FRESNO ST.");
		dictionary.put("UAB","ALABAMA BIRMINGHAM");
		dictionary.put("Portland State","PORTLAND ST.");
		dictionary.put("Purdue","PURDUE");
		dictionary.put("UMKC","MISSOURI KANSAS CITY");
		dictionary.put("Presbyterian","PRESBYTERIAN COLLEGE");
		dictionary.put("Dayton","DAYTON");
		dictionary.put("Louisiana-Monroe","LOUISIANA MONROE");
		dictionary.put("Cincinnati","CINCINNATI");
		dictionary.put("Northern Colorado","NORTHERN COLORADO");
		dictionary.put("Morgan State","MORGAN ST.");
		dictionary.put("Charlotte","NORTH CAROLINA CHARLOTTE");
		dictionary.put("UMBC","MARYLAND BALTIMORE COUNTY");
		dictionary.put("Florida","FLORIDA");
		dictionary.put("Robert Morris","ROBERT MORRIS");
		dictionary.put("Little Rock","ARKANSAS LITTLE ROCK");
		dictionary.put("Marquette","MARQUETTE");
		dictionary.put("Quinnipiac","QUINNIPIAC");
		dictionary.put("Temple","TEMPLE");
		dictionary.put("UCF","CENTRAL FLORIDA");
		dictionary.put("Massachusetts","MASSACHUSETTS");
		dictionary.put("Gardner-Webb","GARDNER-WEBB");
		dictionary.put("Florida Atlantic","FLORIDA ATLANTIC");
		dictionary.put("Tennessee State","TENNESSEE ST.");
		dictionary.put("Lafayette","LAFAYETTE");
		dictionary.put("Central Michigan","CENTRAL MICHIGAN");
		dictionary.put("East Carolina","EAST CAROLINA");
		dictionary.put("Nicholls","NICHOLLS ST.");
		dictionary.put("Kennesaw State","KENNESAW ST.");
		dictionary.put("Ole Miss","MISSISSIPPI");
		dictionary.put("Western Carolina","WESTERN CAROLINA");
		dictionary.put("Samford","SAMFORD");
		dictionary.put("Maine","MAINE");
		dictionary.put("LSU","LSU");
		dictionary.put("Houston Baptist","HOUSTON BAPTIST");
		dictionary.put("Jacksonville","JACKSONVILLE");
		dictionary.put("Alcorn State","ALCORN ST.");
		dictionary.put("Tennessee Tech","TENNESSEE TECH");
		dictionary.put("Murray State","MURRAY ST.");
		dictionary.put("Washington","WASHINGTON");
		dictionary.put("CSU Bakersfield","CAL STATE BAKERSFIELD");
		dictionary.put("Sacred Heart","SACRED HEART");
		dictionary.put("USC","SOUTHERN CAL");
		dictionary.put("Harvard","HARVARD");
		dictionary.put("Air Force","AIR FORCE");
		dictionary.put("George Washington","GEORGE WASHINGTON");
		dictionary.put("New Orleans","NEW ORLEANS");
		dictionary.put("Butler","BUTLER");
		dictionary.put("Southeast Missouri State","SE MISSOURI ST.");
		dictionary.put("Wright State","WRIGHT ST.");
		dictionary.put("Georgia Southern","GEORGIA SOUTHERN");
		dictionary.put("Detroit","DETROIT");
		dictionary.put("Syracuse","SYRACUSE");
		dictionary.put("Houston","HOUSTON");
		dictionary.put("Nebraska Omaha","NEBRASKA OMAHA");
		dictionary.put("Iona","IONA");
		dictionary.put("UT Arlington","TEXAS ARLINGTON");
		dictionary.put("Duquesne","DUQUESNE");
		dictionary.put("Alabama State","ALABAMA ST.");
		dictionary.put("N.C. State","NORTH CAROLINA ST.");
		dictionary.put("James Madison","JAMES MADISON");
		dictionary.put("Wisconsin","WISCONSIN");
		dictionary.put("Kent State","KENT ST.");
		dictionary.put("Bethune-Cookman","BETHUNE-COOKMAN");
		dictionary.put("Colorado","COLORADO");
		dictionary.put("Idaho State","IDAHO ST.");
		dictionary.put("Bradley","BRADLEY");
		dictionary.put("San Francisco","SAN FRANCISCO");
		dictionary.put("Baylor","BAYLOR");
		dictionary.put("Monmouth","MONMOUTH NJ");
		dictionary.put("Saint Peter's","ST. PETER'S");
		dictionary.put("Norfolk State","NORFOLK ST.");
		dictionary.put("Northern Illinois","NORTHERN ILLINOIS");
		dictionary.put("Boston College","BOSTON COLLEGE");
		dictionary.put("Southern Miss","SOUTHERN MISSISSIPPI");
		dictionary.put("UCLA","UCLA");
		dictionary.put("Austin Peay","AUSTIN PEAY");
		dictionary.put("Texas Southern","TEXAS SOUTHERN");
		dictionary.put("Davidson","DAVIDSON");
		dictionary.put("Citadel","CITADEL");
		dictionary.put("Kentucky","KENTUCKY");
		dictionary.put("Stanford","STANFORD");
		dictionary.put("Western Michigan","WESTERN MICHIGAN");
		dictionary.put("Kansas","KANSAS");
		dictionary.put("Utah State","UTAH ST.");
		dictionary.put("Oral Roberts","ORAL ROBERTS");
		dictionary.put("UIC","ILLINOIS CHICAGO");
		dictionary.put("Louisville","LOUISVILLE");
		dictionary.put("Oklahoma","OKLAHOMA");
		dictionary.put("Iowa","IOWA");
		dictionary.put("High Point","HIGH POINT");
		dictionary.put("Valparaiso","VALPARAISO");
		dictionary.put("Mississippi Valley State","MISSISSIPPI VALLEY ST.");
		dictionary.put("Louisiana Tech","LOUISIANA TECH");
		dictionary.put("Elon","ELON");
		dictionary.put("Towson","TOWSON ST.");
		dictionary.put("Texas Tech","TEXAS TECH");
		dictionary.put("Mississippi State","MISSISSIPPI ST.");
		dictionary.put("Georgetown","GEORGETOWN");
		dictionary.put("Cornell","CORNELL");
		dictionary.put("Chicago State","CHICAGO ST.");
		dictionary.put("Youngstown State","YOUNGSTOWN ST.");
		dictionary.put("Coppin State","COPPIN ST.");
		dictionary.put("Florida State","FLORIDA ST.");
		dictionary.put("North Carolina","NORTH CAROLINA");
		dictionary.put("Bowling Green","BOWLING GREEN");
		dictionary.put("UTEP","TEXAS EL PASO");
		dictionary.put("Marshall","MARSHALL");
		dictionary.put("Alabama A&M","ALABAMA A&M");
		dictionary.put("Creighton","CREIGHTON");
		dictionary.put("Brown","BROWN");
		dictionary.put("Northern Arizona","NORTHERN ARIZONA");
		dictionary.put("Rhode Island","RHODE ISLAND");
		dictionary.put("Bucknell","BUCKNELL");
		dictionary.put("Drexel","DREXEL");
		dictionary.put("UAPB","ARKANSAS-PINE BLUFF");
		dictionary.put("Indiana","INDIANA");
		dictionary.put("Toledo","TOLEDO");
		dictionary.put("SMU","SMU");
		dictionary.put("Wake Forest","WAKE FOREST");
		dictionary.put("Washington State","WASHINGTON ST.");
		dictionary.put("Illinois State","ILLINOIS ST.");
		dictionary.put("Chattanooga","TENNESSEE CHATTANOOGA");
		dictionary.put("Memphis","MEMPHIS");
		dictionary.put("South Carolina State","SOUTH CAROLINA ST.");
		dictionary.put("San Diego","SAN DIEGO");
		dictionary.put("Arizona State","ARIZONA ST.");
		dictionary.put("Illinois","ILLINOIS");
		dictionary.put("Princeton","PRINCETON");
		dictionary.put("West Virginia","WEST VIRGINIA");
		dictionary.put("St. Bonaventure","ST. BONAVENTURE");
		dictionary.put("Radford","RADFORD");
		dictionary.put("Eastern Washington","EASTERN WASHINGTON");
		dictionary.put("Duke","DUKE");
		dictionary.put("Rider","RIDER");
		dictionary.put("Massachusetts-Lowell","MASS-LOWELL");
		dictionary.put("UNLV","NEVADA LAS VEGAS");

		return dictionary;
	}
	
	private List<Event> getMatchesByDate(String matchDate, String matchNextDate, Season season) throws MalformedURLException, IOException
	{
		String eventsUrlFormat = "http://api.thescore.com/nfl/events?id.in=%s";
		List<Event> matches = new ArrayList<>();
		ObjectMapper mapper = new ObjectMapper();
		List<Integer> eventIdList = new ArrayList<>();
		
		for (Current_season currSeason: season.getCurrent_season())
		{
			if (currSeason.getId().equals(matchDate) || currSeason.getId().equals(matchNextDate))
			{
				eventIdList.addAll(currSeason.getEvent_ids());
			}
		}
		
		if ((eventIdList != null) && (eventIdList.size() > 0))
		{
			String eventIds;
			if (eventIdList.size() != 1)
			{
				eventIds = String.join(",", Arrays.toString(eventIdList.toArray()));
			}
			else
			{
				eventIds = eventIdList.get(0).toString();
			}
			
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
		System.out.println("Request Url : " + url);
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
	
	private String getFormattedTeamName(String teamName)
	{
		String formattedTeamName = teamName.trim().toUpperCase();
		
		return formattedTeamName;
	}

	public Map<String, TeamRecord> getTeamRecords(Date matchDate, List<Event> events) throws UnknownHostException
	{
		Map<String, TeamRecord> teamRecords = new HashMap<>();

		DynamoDB dynamoDb = getDynamoDbInstance();
        Table eventsTable = dynamoDb.getTable("Events");

        ScanSpec spec = new ScanSpec();

		for (Event event: events)
		{
			teamRecords.put(event.getHome_team().getFull_name(), new TeamRecord() {{ setEvents(new ArrayList<>());}});
			teamRecords.put(event.getAway_team().getFull_name(), new TeamRecord() {{ setEvents(new ArrayList<>());}});
		}
		
        ItemCollection<ScanOutcome> outcome = eventsTable.scan(spec);
        
        for (Item item: outcome)
        {
        	String teamName = item.getString("HomeTeamName");
    		TeamRecord teamRecord = teamRecords.get(teamName);
        	if (teamRecord != null)
        	{
        		teamRecord.getEvents().add(new TeamEvent() {{
        			setOpponentTeamName(item.getString("AwayTeamName"));
        			setEventAtHome(true);
        			setHomeOdds(item.get("HomeOdds") == null ? -999999 : item.getDouble("HomeOdds"));
        			setHomeScore(item.get("HomeScore") == null ? -999999 : item.getInt("HomeScore"));
        			setAwayScore(item.get("AwayScore") == null ? -999999 : item.getInt("AwayScore"));
        		}});
        	}
        	
        	teamName = item.getString("AwayTeamName");
    		teamRecord = teamRecords.get(teamName);
        	if (teamRecord != null)
        	{
        		teamRecord.getEvents().add(new TeamEvent() {{
        			setOpponentTeamName(item.getString("HomeTeamName"));
        			setEventAtHome(false);
        			setHomeOdds(item.get("HomeOdds") == null ? -999999 : item.getDouble("HomeOdds"));
        			setHomeScore(item.get("HomeScore") == null ? -999999 : item.getInt("HomeScore"));
        			setAwayScore(item.get("AwayScore") == null ? -999999 : item.getInt("AwayScore"));
        		}});
        	}
        	
        	
        }
        
		// TODO Auto-generated method stub
		return teamRecords;
	}
	
}
