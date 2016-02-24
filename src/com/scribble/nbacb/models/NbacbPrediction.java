package com.scribble.nbacb.models;

public class NbacbPrediction implements Comparable<NbacbPrediction> {

	private String homeTeamName;
	private String awayTeamName;
	private Integer homeWins;
	private Integer homeLoses;
	private Integer awayWins;
	private Integer awayLoses;
	private Double westgateCurrentPointSpread;
	private Double westgateOpeningPointSpread;
	private Double sonnyMoorePointSpread;
	private String gameDate;
	private Integer homeScore;
	private Integer awayScore;
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
        return gameDate.compareTo(o.getGameDate());
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

	
}
