package com.scribble.nbacb.models;

public class PowerRanking {

	private String teamName;
	private Integer wins;
	private Integer loses;
	private Integer ties;
	private double sos;
	private double powerRanking;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public Integer getWins() {
		return wins;
	}
	
	public void setWins(Integer wins) {
		this.wins = wins;
	}
	
	public Integer getLoses() {
		return loses;
	}
	
	public void setLoses(Integer loses) {
		this.loses = loses;
	}
	
	public Integer getTies() {
		return ties;
	}
	
	public void setTies(Integer ties) {
		this.ties = ties;
	}
	
	public double getSOS() {
		return sos;
	}
	
	public void setSOS(double sos) {
		this.sos = sos;
	}
	
	public double getPowerRanking() {
		return powerRanking;
	}
	
	public void setPowerRanking(double powerRanking) {
		this.powerRanking = powerRanking;
	}
	
}
