package com.scribble.nbacb.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scribble.nbacb.models.NbacbPick;
import com.scribble.nbacb.models.NbacbPrediction;
import com.scribble.nbacb.models.Odd;
import com.scribble.nbacb.models.PowerRanking;
import com.scribble.nbacb.models.events.Event;
import com.scribble.nbacb.repository.CollegeBasketBallOddsRepository;

@Service
public class CollegeBasketBallOddsService {

	@Autowired
	private CollegeBasketBallOddsRepository nbacbRepository;

	public List<NbacbPrediction> getNbacbOdds() throws IOException
	{
		List<NbacbPrediction> nbacbPredictions = new ArrayList<NbacbPrediction>();
		
		List<NbacbPick> nbacbOdds = nbacbRepository.getNbacbOdds();
	
		ArrayList<PowerRanking> sonnyMoorePowerRanking = nbacbRepository.getSonnyMoorePowerRaking();

		for (NbacbPick pick : nbacbOdds)
		{
			PowerRanking homeTeam = getMatchingTeamName(sonnyMoorePowerRanking, pick.getHomeTeamName(), pick.getHomeWins(), pick.getHomeLosses());

			PowerRanking awayTeam = getMatchingTeamName(sonnyMoorePowerRanking, pick.getAwayTeamName(), pick.getAwayWins(), pick.getAwayLosses());
			
			if (homeTeam == null || awayTeam == null)
			{
				nbacbPredictions.add(new NbacbPrediction(){{
					setHomeTeamName(pick.getHomeTeamName());
					setAwayTeamName(pick.getAwayTeamName());
				}});
				continue;
			}
			
			Odd westgate = null;
			for(Odd odd: pick.getOdds())
			{
				if (odd.getSportsbookName().toUpperCase().trim().equals("WESTGATE"))
				{
					westgate = odd;
					if (westgate.getCurrentPointSpreadHomeHandicap() == null)
					{
						westgate.setCurrentPointSpreadHomeHandicap(westgate.getOpeningPointSpreadHomeHandicap());
					}
					break;
				}
			}
			final Odd finalWestgate = westgate;
						
			nbacbPredictions.add(new NbacbPrediction(){{
				setHomeTeamName(pick.getHomeTeamName());
				setAwayTeamName(pick.getAwayTeamName());
				setGameDate(pick.getGamedate().toUpperCase());
				setHomeWins(homeTeam.getWins());
				setHomeLoses(homeTeam.getLoses());
				setAwayWins(awayTeam.getWins());
				setAwayLoses(awayTeam.getLoses());
				
				setWestgateCurrentPointSpread((finalWestgate == null || finalWestgate.getCurrentPointSpreadHomeHandicap() == null || finalWestgate.getCurrentPointSpreadHomeHandicap().equals("PK")) ? 0
						: Double.parseDouble(finalWestgate.getCurrentPointSpreadHomeHandicap()));
				setWestgateOpeningPointSpread((finalWestgate == null || finalWestgate.getOpeningPointSpreadHomeHandicap() == null || finalWestgate.getOpeningPointSpreadHomeHandicap().equals("PK")) ? 0
						: Double.parseDouble(finalWestgate.getOpeningPointSpreadHomeHandicap()));
				
				setSonnyMoorePointSpread((Math.round((awayTeam.getPowerRanking() - homeTeam.getPowerRanking() - 3.25) * 100.0) / 100.0));
			}});
		}
		
		return nbacbPredictions;
	}

	public List<Event> getMatchesByDate(String matchDate) throws IOException
	{
		return nbacbRepository.getMatchesByDate(matchDate);
	}
	
	private PowerRanking getMatchingTeamName(ArrayList<PowerRanking> sonnyMoorePowerRanking, String teamName, Long wins, Long loses) {
		ArrayList<PowerRanking> matches = new ArrayList<PowerRanking>();
		ArrayList<PowerRanking> secondMatch = new ArrayList<PowerRanking>();
		System.out.println("TeamName : " + teamName);
		
		for (PowerRanking powerRanking : sonnyMoorePowerRanking)
		{
			if (teamName.equals(powerRanking.getTeamName()))
			{
				System.out.println("MATCH : " + powerRanking.getTeamName());
				return powerRanking;
			}

			if (powerRanking.getTeamName().startsWith(teamName))
			{
				secondMatch.add(powerRanking);
			}

			if (wins == powerRanking.getWins().longValue() 
					|| loses == powerRanking.getLoses().longValue())
			{
				matches.add(powerRanking);
			}
		}
		
		PowerRanking hardMatch = TryFindMatch(teamName, sonnyMoorePowerRanking, "HC");
		if (hardMatch != null)
		{
			System.out.println(hardMatch.getTeamName());
			return hardMatch;
		}

		if (secondMatch.size() == 1)
		{
			System.out.println("MATCH : " + secondMatch.get(0).getTeamName());
			return secondMatch.get(0);
		}
		else
		{
			PowerRanking matchTeam = TryFindMatch(teamName, matches, "FW");
			if (matchTeam != null)
			{
				System.out.println(matchTeam.getTeamName());
				return matchTeam;
			}
			else
			{
				for (PowerRanking team: matches)
				{
					System.out.println(team.getTeamName());
				}
			}
		}
		
		return null;
	}
	
	private PowerRanking TryFindMatch(String teamName, ArrayList<PowerRanking> matches, String pattern)
	{
		ArrayList<PowerRanking> secondMatch = new ArrayList<>();
		if (pattern.equals("HC"))
		{
			String matchingTeamName = "";
			switch (teamName)
			{
				case "UNLV":
					matchingTeamName = "NEVADA LAS VEGAS";
					break;
				case "TEXAS CHRISTIAN":
					matchingTeamName = "TCU";
					break;
				case "INDIANA   PURDUE":
					matchingTeamName = "IUPUI";
					break;
				case "SOUTHERN CALIFORNIA":
					matchingTeamName = "SOUTHERN CAL";
					break;
				case "LOUISIANA STATE":
					matchingTeamName = "LSU";
					break;
				case "LOYOLA CHICAGO":
					matchingTeamName = "LOYOLA ILLINOIS";
					break;
				case "BRIGHAM YOUNG":
					matchingTeamName = "BYU";
					break;
				case "CAL POLY SLO":
					matchingTeamName = "CAL POLY";
					break;
				case "SOUTHERN METHODIST":
					matchingTeamName = "SMU";
					break;
				case "CHARLESTON":
					matchingTeamName = "COLLEGE OF CHARLESTON";
					break;
			}
			
			for (PowerRanking team : matches)
			{
				if (team.getTeamName().equals(matchingTeamName))
				{
					return team;
				}
			}
			return null;
		}
		if (pattern.equals("FW"))
		{
			for (PowerRanking matchName: matches)
			{
				if (matchName.getTeamName().split(" ")[0].equals(teamName.split(" ")[0]))
				{
					secondMatch.add(matchName);
				}
			}
			
			if (secondMatch.size() == 1)
			{
				return secondMatch.get(0);
			}
			return TryFindMatch(teamName, matches, "LW");
		}
		if (pattern.equals("LW"))
		{
			for (PowerRanking matchName: matches)
			{
				String[] matchArray = matchName.getTeamName().split(" ");
				String[] teamNameArray = teamName.split(" ");
				if (matchArray[matchArray.length - 1].equals(teamNameArray[teamNameArray.length - 1]))
				{
					secondMatch.add(matchName);
				}
			}
			
			if (secondMatch.size() == 1)
			{
				return secondMatch.get(0);
			}
		}
		
		return null;
	}
}
