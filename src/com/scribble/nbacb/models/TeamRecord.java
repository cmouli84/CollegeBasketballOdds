package com.scribble.nbacb.models;

import java.util.List;

public class TeamRecord {
	private Double currentRanking;
	private List<TeamEvent> events;
	/**
	 * @return the currentRanking
	 */
	public Double getCurrentRanking() {
		return currentRanking;
	}
	/**
	 * @param currentRanking the currentRanking to set
	 */
	public void setCurrentRanking(Double currentRanking) {
		this.currentRanking = currentRanking;
	}
	/**
	 * @return the events
	 */
	public List<TeamEvent> getEvents() {
		return events;
	}
	/**
	 * @param events the events to set
	 */
	public void setEvents(List<TeamEvent> events) {
		this.events = events;
	}
}
