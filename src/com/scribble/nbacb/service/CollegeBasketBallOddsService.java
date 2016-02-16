package com.scribble.nbacb.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scribble.nbacb.models.NbacbPick;
import com.scribble.nbacb.models.PowerRanking;
import com.scribble.nbacb.repository.CollegeBasketBallOddsRepository;

@Service
public class CollegeBasketBallOddsService {

	@Autowired
	private CollegeBasketBallOddsRepository nbacbRepository;

	public List<String> getNbacbOdds() throws IOException
	{
		List<NbacbPick> nbacbOdds = nbacbRepository.getNbacbOdds();
	
		List<PowerRanking> sonnyMoorePowerRanking = nbacbRepository.getSonnyMoorePowerRaking();

		ArrayList<String> teamNames = new ArrayList<String>(); 
		
		for (NbacbPick pick : nbacbOdds)
		{
			getMatchingTeamName(sonnyMoorePowerRanking, pick.getHomeTeamName(), pick.getHomeWins(), pick.getHomeLosses());

			getMatchingTeamName(sonnyMoorePowerRanking, pick.getAwayTeamName(), pick.getAwayWins(), pick.getAwayLosses());
			
			teamNames.add(pick.getHomeTeamName());
			teamNames.add(pick.getAwayTeamName());
		}
		
		return teamNames;
	}

	private void getMatchingTeamName(List<PowerRanking> sonnyMoorePowerRanking, String teamName, Long wins, Long loses) {
		ArrayList<String> matches;
		ArrayList<String> secondMatch;
		Boolean matchFound;
		System.out.println("TeamName : " + teamName);
		matches = new ArrayList<String>();
		secondMatch = new ArrayList<String>();
		matchFound = false;
		
		for (PowerRanking powerRanking : sonnyMoorePowerRanking)
		{
			if (teamName.trim().toUpperCase().equals(powerRanking.getTeamName().trim().toUpperCase()))
			{
				System.out.println("MATCH : " + powerRanking.getTeamName());
				matchFound = true;
				break;
			}

			if (powerRanking.getTeamName().trim().replace('-', ' ').toUpperCase()
					.startsWith(teamName.trim().replace('-', ' ').toUpperCase()))
			{
				secondMatch.add(powerRanking.getTeamName());
			}

			if (wins == powerRanking.getWins().longValue() 
					|| loses == powerRanking.getLoses().longValue())
			{
				matches.add(powerRanking.getTeamName());
			}
		}

		if (!matchFound)
		{
			if (secondMatch.size() == 1)
			{
				System.out.println("MATCH : " + secondMatch.get(0));
			}
			else
			{
				String matchName = TryFindMatch(teamName, matches, "FW");
				if (!matchName.equals(""))
				{
					System.out.println(matchName);
				}
				else
				{
					for (String team: matches)
					{
						System.out.println(team);
					}
				}
			}
		}
	}
	
	private String TryFindMatch(String teamName, ArrayList<String> matches, String pattern)
	{
		teamName = teamName.replace('-', ' ').trim().toUpperCase();
		ArrayList<String> secondMatch = new ArrayList<String>();
		if (pattern.equals("FW"))
		{
			for (String matchName: matches)
			{
				if (matchName.trim().toUpperCase().replace('-', ' ').split(" ")[0]
						.equals(teamName.split(" ")[0]))
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
			for (String matchName: matches)
			{
				String[] matchArray = matchName.trim().toUpperCase().replace('-', ' ').split(" ");
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
		
		
		return "";
	}
}
