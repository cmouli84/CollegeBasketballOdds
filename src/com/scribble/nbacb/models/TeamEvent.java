package com.scribble.nbacb.models;

public class TeamEvent {
	private String opponentTeamName;
	private Boolean eventAtHome;
	private Double homeOdds;
	private Integer homeScore;
	private Integer awayScore;
	/**
	 * @return the opponentTeamName
	 */
	public String getOpponentTeamName() {
		return opponentTeamName;
	}
	/**
	 * @param opponentTeamName the opponentTeamName to set
	 */
	public void setOpponentTeamName(String opponentTeamName) {
		this.opponentTeamName = opponentTeamName;
	}
	/**
	 * @return the eventAtHome
	 */
	public Boolean getEventAtHome() {
		return eventAtHome;
	}
	/**
	 * @param eventAtHome the eventAtHome to set
	 */
	public void setEventAtHome(Boolean eventAtHome) {
		this.eventAtHome = eventAtHome;
	}
	/**
	 * @return the homeOdds
	 */
	public Double getHomeOdds() {
		return homeOdds;
	}
	/**
	 * @param homeOdds the homeOdds to set
	 */
	public void setHomeOdds(Double homeOdds) {
		this.homeOdds = homeOdds;
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
