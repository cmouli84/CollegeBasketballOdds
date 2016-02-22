
package com.scribble.nbacb.models.events;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Event {

    private Colours colours;
    private List<String> conference_names = new ArrayList<String>();
    private String event_status;
    private Boolean has_play_by_play_records;
    private Integer id;
    private String game_date;
    private String game_type;
    private Object game_description;
    private Boolean tba;
    private String updated_at;
    private String api_uri;
    private String resource_uri;
    private String status;
    private String preview;
    private String recap;
    private List<Event_detail> event_details = new ArrayList<Event_detail>();
    private Away_team away_team;
    private Home_team home_team;
    private Object top_match;
    private League league;
    private String location;
    private String stadium;
    private String away_conference;
    private String home_conference;
    private Odd odd;
    private List<Subscribable_alert> subscribable_alerts = new ArrayList<Subscribable_alert>();
    private Box_score box_score;
    private Object away_ranking;
    private Integer home_ranking;
    private Boolean important;
    private Object slot;
    private Object tournament_name;
    private Top_25_rankings top_25_rankings;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The colours
     */
    public Colours getColours() {
        return colours;
    }

    /**
     * 
     * @param colours
     *     The colours
     */
    public void setColours(Colours colours) {
        this.colours = colours;
    }

    /**
     * 
     * @return
     *     The conference_names
     */
    public List<String> getConference_names() {
        return conference_names;
    }

    /**
     * 
     * @param conference_names
     *     The conference_names
     */
    public void setConference_names(List<String> conference_names) {
        this.conference_names = conference_names;
    }

    /**
     * 
     * @return
     *     The event_status
     */
    public String getEvent_status() {
        return event_status;
    }

    /**
     * 
     * @param event_status
     *     The event_status
     */
    public void setEvent_status(String event_status) {
        this.event_status = event_status;
    }

    /**
     * 
     * @return
     *     The has_play_by_play_records
     */
    public Boolean getHas_play_by_play_records() {
        return has_play_by_play_records;
    }

    /**
     * 
     * @param has_play_by_play_records
     *     The has_play_by_play_records
     */
    public void setHas_play_by_play_records(Boolean has_play_by_play_records) {
        this.has_play_by_play_records = has_play_by_play_records;
    }

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
     *     The game_date
     */
    public String getGame_date() {
        return game_date;
    }

    /**
     * 
     * @param game_date
     *     The game_date
     */
    public void setGame_date(String game_date) {
        this.game_date = game_date;
    }

    /**
     * 
     * @return
     *     The game_type
     */
    public String getGame_type() {
        return game_type;
    }

    /**
     * 
     * @param game_type
     *     The game_type
     */
    public void setGame_type(String game_type) {
        this.game_type = game_type;
    }

    /**
     * 
     * @return
     *     The game_description
     */
    public Object getGame_description() {
        return game_description;
    }

    /**
     * 
     * @param game_description
     *     The game_description
     */
    public void setGame_description(Object game_description) {
        this.game_description = game_description;
    }

    /**
     * 
     * @return
     *     The tba
     */
    public Boolean getTba() {
        return tba;
    }

    /**
     * 
     * @param tba
     *     The tba
     */
    public void setTba(Boolean tba) {
        this.tba = tba;
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
     *     The resource_uri
     */
    public String getResource_uri() {
        return resource_uri;
    }

    /**
     * 
     * @param resource_uri
     *     The resource_uri
     */
    public void setResource_uri(String resource_uri) {
        this.resource_uri = resource_uri;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The preview
     */
    public String getPreview() {
        return preview;
    }

    /**
     * 
     * @param preview
     *     The preview
     */
    public void setPreview(String preview) {
        this.preview = preview;
    }

    /**
     * 
     * @return
     *     The recap
     */
    public String getRecap() {
        return recap;
    }

    /**
     * 
     * @param recap
     *     The recap
     */
    public void setRecap(String recap) {
        this.recap = recap;
    }

    /**
     * 
     * @return
     *     The event_details
     */
    public List<Event_detail> getEvent_details() {
        return event_details;
    }

    /**
     * 
     * @param event_details
     *     The event_details
     */
    public void setEvent_details(List<Event_detail> event_details) {
        this.event_details = event_details;
    }

    /**
     * 
     * @return
     *     The away_team
     */
    public Away_team getAway_team() {
        return away_team;
    }

    /**
     * 
     * @param away_team
     *     The away_team
     */
    public void setAway_team(Away_team away_team) {
        this.away_team = away_team;
    }

    /**
     * 
     * @return
     *     The home_team
     */
    public Home_team getHome_team() {
        return home_team;
    }

    /**
     * 
     * @param home_team
     *     The home_team
     */
    public void setHome_team(Home_team home_team) {
        this.home_team = home_team;
    }

    /**
     * 
     * @return
     *     The top_match
     */
    public Object getTop_match() {
        return top_match;
    }

    /**
     * 
     * @param top_match
     *     The top_match
     */
    public void setTop_match(Object top_match) {
        this.top_match = top_match;
    }

    /**
     * 
     * @return
     *     The league
     */
    public League getLeague() {
        return league;
    }

    /**
     * 
     * @param league
     *     The league
     */
    public void setLeague(League league) {
        this.league = league;
    }

    /**
     * 
     * @return
     *     The location
     */
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The stadium
     */
    public String getStadium() {
        return stadium;
    }

    /**
     * 
     * @param stadium
     *     The stadium
     */
    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    /**
     * 
     * @return
     *     The away_conference
     */
    public String getAway_conference() {
        return away_conference;
    }

    /**
     * 
     * @param away_conference
     *     The away_conference
     */
    public void setAway_conference(String away_conference) {
        this.away_conference = away_conference;
    }

    /**
     * 
     * @return
     *     The home_conference
     */
    public String getHome_conference() {
        return home_conference;
    }

    /**
     * 
     * @param home_conference
     *     The home_conference
     */
    public void setHome_conference(String home_conference) {
        this.home_conference = home_conference;
    }

    /**
     * 
     * @return
     *     The odd
     */
    public Odd getOdd() {
        return odd;
    }

    /**
     * 
     * @param odd
     *     The odd
     */
    public void setOdd(Odd odd) {
        this.odd = odd;
    }

    /**
     * 
     * @return
     *     The subscribable_alerts
     */
    public List<Subscribable_alert> getSubscribable_alerts() {
        return subscribable_alerts;
    }

    /**
     * 
     * @param subscribable_alerts
     *     The subscribable_alerts
     */
    public void setSubscribable_alerts(List<Subscribable_alert> subscribable_alerts) {
        this.subscribable_alerts = subscribable_alerts;
    }

    /**
     * 
     * @return
     *     The box_score
     */
    public Box_score getBox_score() {
        return box_score;
    }

    /**
     * 
     * @param box_score
     *     The box_score
     */
    public void setBox_score(Box_score box_score) {
        this.box_score = box_score;
    }

    /**
     * 
     * @return
     *     The away_ranking
     */
    public Object getAway_ranking() {
        return away_ranking;
    }

    /**
     * 
     * @param away_ranking
     *     The away_ranking
     */
    public void setAway_ranking(Object away_ranking) {
        this.away_ranking = away_ranking;
    }

    /**
     * 
     * @return
     *     The home_ranking
     */
    public Integer getHome_ranking() {
        return home_ranking;
    }

    /**
     * 
     * @param home_ranking
     *     The home_ranking
     */
    public void setHome_ranking(Integer home_ranking) {
        this.home_ranking = home_ranking;
    }

    /**
     * 
     * @return
     *     The important
     */
    public Boolean getImportant() {
        return important;
    }

    /**
     * 
     * @param important
     *     The important
     */
    public void setImportant(Boolean important) {
        this.important = important;
    }

    /**
     * 
     * @return
     *     The slot
     */
    public Object getSlot() {
        return slot;
    }

    /**
     * 
     * @param slot
     *     The slot
     */
    public void setSlot(Object slot) {
        this.slot = slot;
    }

    /**
     * 
     * @return
     *     The tournament_name
     */
    public Object getTournament_name() {
        return tournament_name;
    }

    /**
     * 
     * @param tournament_name
     *     The tournament_name
     */
    public void setTournament_name(Object tournament_name) {
        this.tournament_name = tournament_name;
    }

    /**
     * 
     * @return
     *     The top_25_rankings
     */
    public Top_25_rankings getTop_25_rankings() {
        return top_25_rankings;
    }

    /**
     * 
     * @param top_25_rankings
     *     The top_25_rankings
     */
    public void setTop_25_rankings(Top_25_rankings top_25_rankings) {
        this.top_25_rankings = top_25_rankings;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
