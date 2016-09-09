
package com.scribble.nbacb.models.events;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Box_score {

    private Integer id;
    private Boolean has_statistics;
    private Progress progress;
    private String updated_at;
    private String api_uri;
    private Score score;
    private Object minutes;
    private Integer segment_number;
    private Object down;
    private Object formatted_distance;
    private Object yards_from_goal;
    private Object home_timeouts_left;
    private Object away_timeouts_left;
    private Boolean under_review;
    private Object team_in_possession;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The has_statistics
     */
    public Boolean getHas_statistics() {
        return has_statistics;
    }

    /**
     * 
     * @param has_statistics
     *     The has_statistics
     */
    public void setHas_statistics(Boolean has_statistics) {
        this.has_statistics = has_statistics;
    }

    /**
     * 
     * @return
     *     The progress
     */
    public Progress getProgress() {
        return progress;
    }

    /**
     * 
     * @param progress
     *     The progress
     */
    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    /**
     * 
     * @return
     *     The updated_at
     */
    public String getUpdated_at() {
        return updated_at;
    }

    /**
     * 
     * @param updated_at
     *     The updated_at
     */
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    /**
     * 
     * @return
     *     The api_uri
     */
    public String getApi_uri() {
        return api_uri;
    }

    /**
     * 
     * @param api_uri
     *     The api_uri
     */
    public void setApi_uri(String api_uri) {
        this.api_uri = api_uri;
    }

    /**
     * 
     * @return
     *     The score
     */
    public Score getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    public void setScore(Score score) {
        this.score = score;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	/**
	 * @return the segment_number
	 */
	public Integer getSegment_number() {
		return segment_number;
	}

	/**
	 * @param segment_number the segment_number to set
	 */
	public void setSegment_number(Integer segment_number) {
		this.segment_number = segment_number;
	}

	/**
	 * @return the minutes
	 */
	public Object getMinutes() {
		return minutes;
	}

	/**
	 * @param minutes the minutes to set
	 */
	public void setMinutes(Object minutes) {
		this.minutes = minutes;
	}

	/**
	 * @return the down
	 */
	public Object getDown() {
		return down;
	}

	/**
	 * @param down the down to set
	 */
	public void setDown(Object down) {
		this.down = down;
	}

	/**
	 * @return the formatted_distance
	 */
	public Object getFormatted_distance() {
		return formatted_distance;
	}

	/**
	 * @param formatted_distance the formatted_distance to set
	 */
	public void setFormatted_distance(Object formatted_distance) {
		this.formatted_distance = formatted_distance;
	}

	/**
	 * @return the yards_from_goal
	 */
	public Object getYards_from_goal() {
		return yards_from_goal;
	}

	/**
	 * @param yards_from_goal the yards_from_goal to set
	 */
	public void setYards_from_goal(Object yards_from_goal) {
		this.yards_from_goal = yards_from_goal;
	}

	/**
	 * @return the home_timeouts_left
	 */
	public Object getHome_timeouts_left() {
		return home_timeouts_left;
	}

	/**
	 * @param home_timeouts_left the home_timeouts_left to set
	 */
	public void setHome_timeouts_left(Object home_timeouts_left) {
		this.home_timeouts_left = home_timeouts_left;
	}

	/**
	 * @return the away_timeouts_left
	 */
	public Object getAway_timeouts_left() {
		return away_timeouts_left;
	}

	/**
	 * @param away_timeouts_left the away_timeouts_left to set
	 */
	public void setAway_timeouts_left(Object away_timeouts_left) {
		this.away_timeouts_left = away_timeouts_left;
	}

	/**
	 * @return the under_review
	 */
	public Boolean getUnder_review() {
		return under_review;
	}

	/**
	 * @param under_review the under_review to set
	 */
	public void setUnder_review(Boolean under_review) {
		this.under_review = under_review;
	}

	/**
	 * @return the team_in_possession
	 */
	public Object getTeam_in_possession() {
		return team_in_possession;
	}

	/**
	 * @param team_in_possession the team_in_possession to set
	 */
	public void setTeam_in_possession(Object team_in_possession) {
		this.team_in_possession = team_in_possession;
	}

}
