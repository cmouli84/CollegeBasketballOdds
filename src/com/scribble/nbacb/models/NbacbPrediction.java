package com.scribble.nbacb.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class NbacbPrediction implements Comparable<NbacbPrediction> {

	private String homeTeamName;
	private String awayTeamName;
	private Integer homeWins;
	private Integer homeLoses;
	private Integer awayWins;
	private Integer awayLoses;
	private Double westgateCurrentPointSpread;
	private Double westgateOpeningPointSpread;
	private Double homeTeamSonnyMoorePowerRanking;
	private Double awayTeamSonnyMoorePowerRanking;
	private Double sonnyMoorePointSpread;
	private String gameDate;
	private Integer homeScore;
	private Integer awayScore;
	private TeamRecord homeRecord;
	private TeamRecord awayRecord;
	/**
	 * @return the homeTeamName
	 */
	public String getHomeTeamName() {
		return homeTeamName;
	}
	/**
	 * @param homeTeamName the homeTeamName to set
	 */
	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}
	/**
	 * @return the awayTeamName
	 */
	public String getAwayTeamName() {
		return awayTeamName;
	}
	/**
	 * @param awayTeamName the awayTeamName to set
	 */
	public void setAwayTeamName(String awayTeamName) {
		this.awayTeamName = awayTeamName;
	}
	/**
	 * @return the homeWins
	 */
	public Integer getHomeWins() {
		return homeWins;
	}
	/**
	 * @param homeWins the homeWins to set
	 */
	public void setHomeWins(Integer homeWins) {
		this.homeWins = homeWins;
	}
	/**
	 * @return the homeLoses
	 */
	public Integer getHomeLoses() {
		return homeLoses;
	}
	/**
	 * @param homeLoses the homeLoses to set
	 */
	public void setHomeLoses(Integer homeLoses) {
		this.homeLoses = homeLoses;
	}
	/**
	 * @return the awayWins
	 */
	public Integer getAwayWins() {
		return awayWins;
	}
	/**
	 * @param awayWins the awayWins to set
	 */
	public void setAwayWins(Integer awayWins) {
		this.awayWins = awayWins;
	}
	/**
	 * @return the awayLoses
	 */
	public Integer getAwayLoses() {
		return awayLoses;
	}
	/**
	 * @param awayLoses the awayLoses to set
	 */
	public void setAwayLoses(Integer awayLoses) {
		this.awayLoses = awayLoses;
	}
	/**
	 * @return the westgateCurrentPointSpread
	 */
	public Double getWestgateCurrentPointSpread() {
		return westgateCurrentPointSpread;
	}
	/**
	 * @param westgateCurrentPointSpread the westgateCurrentPointSpread to set
	 */
	public void setWestgateCurrentPointSpread(Double westgateCurrentPointSpread) {
		this.westgateCurrentPointSpread = westgateCurrentPointSpread;
	}
	/**
	 * @return the westgateOpeningPointSpread
	 */
	public Double getWestgateOpeningPointSpread() {
		return westgateOpeningPointSpread;
	}
	/**
	 * @param westgateOpeningPointSpread the westgateOpeningPointSpread to set
	 */
	public void setWestgateOpeningPointSpread(Double westgateOpeningPointSpread) {
		this.westgateOpeningPointSpread = westgateOpeningPointSpread;
	}
	/**
	 * @return the sunnyMoorePointSpread
	 */
	public Double getSonnyMoorePointSpread() {
		return sonnyMoorePointSpread;
	}
	/**
	 * @param sunnyMoorePointSpread the sunnyMoorePointSpread to set
	 */
	public void setSonnyMoorePointSpread(Double sonnyMoorePointSpread) {
		this.sonnyMoorePointSpread = sonnyMoorePointSpread;
	}
	/**
	 * @return the gameDate
	 */
	public String getGameDate() {
		return gameDate;
	}
	/**
	 * @param gameDate the gameDate to set
	 */
	public void setGameDate(String gameDate) {
		this.gameDate = gameDate;
	}
    
	@Override
	public int compareTo(NbacbPrediction o) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("EEE MM/dd hh:mm a z", Locale.ENGLISH);
        try {
			return dateFormat.parse(gameDate).compareTo(dateFormat.parse(o.getGameDate()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return 0;
	}
	/**
	 * @return the homeScore
	 */
	public Integer getHomeScore() {
		return homeScore;
	}
	/**
	 * @param homeScore the homeScore to set
	 */
	public void setHomeScore(Integer homeScore) {
		this.homeScore = homeScore;
	}
	/**
	 * @return the awayScore
	 */
	public Integer getAwayScore() {
		return awayScore;
	}
	/**
	 * @param awayScore the awayScore to set
	 */
	public void setAwayScore(Integer awayScore) {
		this.awayScore = awayScore;
	}
	/**
	 * @return the homeRecord
	 */
	public TeamRecord getHomeRecord() {
		return homeRecord;
	}
	/**
	 * @param homeRecord the homeRecord to set
	 */
	public void setHomeRecord(TeamRecord homeRecord) {
		this.homeRecord = homeRecord;
	}
	/**
	 * @return the awayRecord
	 */
	public TeamRecord getAwayRecord() {
		return awayRecord;
	}
	/**
	 * @param awayRecord the awayRecord to set
	 */
	public void setAwayRecord(TeamRecord awayRecord) {
		this.awayRecord = awayRecord;
	}
	/**
	 * @return the homeTeamSonnyMoorePowerRanking
	 */
	public Double getHomeTeamSonnyMoorePowerRanking() {
		return homeTeamSonnyMoorePowerRanking;
	}
	/**
	 * @param homeTeamSonnyMoorePowerRanking the homeTeamSonnyMoorePowerRanking to set
	 */
	public void setHomeTeamSonnyMoorePowerRanking(Double homeTeamSonnyMoorePowerRanking) {
		this.homeTeamSonnyMoorePowerRanking = homeTeamSonnyMoorePowerRanking;
	}
	/**
	 * @return the awayTeamSonnyMoorePowerRanking
	 */
	public Double getAwayTeamSonnyMoorePowerRanking() {
		return awayTeamSonnyMoorePowerRanking;
	}
	/**
	 * @param awayTeamSonnyMoorePowerRanking the awayTeamSonnyMoorePowerRanking to set
	 */
	public void setAwayTeamSonnyMoorePowerRanking(Double awayTeamSonnyMoorePowerRanking) {
		this.awayTeamSonnyMoorePowerRanking = awayTeamSonnyMoorePowerRanking;
	}

	
}
