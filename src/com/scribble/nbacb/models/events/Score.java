
package com.scribble.nbacb.models.events;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Score {

    private Home home;
    private Away away;
    private String winning_team;
    private String losing_team;
    private Boolean tie_game;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The home
     */
    public Home getHome() {
        return home;
    }

    /**
     * 
     * @param home
     *     The home
     */
    public void setHome(Home home) {
        this.home = home;
    }

    /**
     * 
     * @return
     *     The away
     */
    public Away getAway() {
        return away;
    }

    /**
     * 
     * @param away
     *     The away
     */
    public void setAway(Away away) {
        this.away = away;
    }

    /**
     * 
     * @return
     *     The winning_team
     */
    public String getWinning_team() {
        return winning_team;
    }

    /**
     * 
     * @param winning_team
     *     The winning_team
     */
    public void setWinning_team(String winning_team) {
        this.winning_team = winning_team;
    }

    /**
     * 
     * @return
     *     The losing_team
     */
    public String getLosing_team() {
        return losing_team;
    }

    /**
     * 
     * @param losing_team
     *     The losing_team
     */
    public void setLosing_team(String losing_team) {
        this.losing_team = losing_team;
    }

    /**
     * 
     * @return
     *     The tie_game
     */
    public Boolean getTie_game() {
        return tie_game;
    }

    /**
     * 
     * @param tie_game
     *     The tie_game
     */
    public void setTie_game(Boolean tie_game) {
        this.tie_game = tie_game;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
