
package com.scribble.nbacb.models.events;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Away_team {

    private String abbreviation;
    private Object colour_1;
    private Object colour_2;
    private String division;
    private String full_name;
    private String search_name;
    private Integer id;
    private Object location;
    private Logos logos;
    private String medium_name;
    private String short_name;
    private String conference;
    private Boolean has_injuries;
    private Boolean has_rosters;
    private String updated_at;
    private Integer subscription_count;
    private String api_uri;
    private String resource_uri;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The abbreviation
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * 
     * @param abbreviation
     *     The abbreviation
     */
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     * 
     * @return
     *     The colour_1
     */
    public Object getColour_1() {
        return colour_1;
    }

    /**
     * 
     * @param colour_1
     *     The colour_1
     */
    public void setColour_1(Object colour_1) {
        this.colour_1 = colour_1;
    }

    /**
     * 
     * @return
     *     The colour_2
     */
    public Object getColour_2() {
        return colour_2;
    }

    /**
     * 
     * @param colour_2
     *     The colour_2
     */
    public void setColour_2(Object colour_2) {
        this.colour_2 = colour_2;
    }

    /**
     * 
     * @return
     *     The division
     */
    public String getDivision() {
        return division;
    }

    /**
     * 
     * @param division
     *     The division
     */
    public void setDivision(String division) {
        this.division = division;
    }

    /**
     * 
     * @return
     *     The full_name
     */
    public String getFull_name() {
        return full_name;
    }

    /**
     * 
     * @param full_name
     *     The full_name
     */
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    /**
     * 
     * @return
     *     The search_name
     */
    public String getSearch_name() {
        return search_name;
    }

    /**
     * 
     * @param search_name
     *     The search_name
     */
    public void setSearch_name(String search_name) {
        this.search_name = search_name;
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
     *     The location
     */
    public Object getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(Object location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The logos
     */
    public Logos getLogos() {
        return logos;
    }

    /**
     * 
     * @param logos
     *     The logos
     */
    public void setLogos(Logos logos) {
        this.logos = logos;
    }

    /**
     * 
     * @return
     *     The medium_name
     */
    public String getMedium_name() {
        return medium_name;
    }

    /**
     * 
     * @param medium_name
     *     The medium_name
     */
    public void setMedium_name(String medium_name) {
        this.medium_name = medium_name;
    }

    /**
     * 
     * @return
     *     The short_name
     */
    public String getShort_name() {
        return short_name;
    }

    /**
     * 
     * @param short_name
     *     The short_name
     */
    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    /**
     * 
     * @return
     *     The conference
     */
    public String getConference() {
        return conference;
    }

    /**
     * 
     * @param conference
     *     The conference
     */
    public void setConference(String conference) {
        this.conference = conference;
    }

    /**
     * 
     * @return
     *     The has_injuries
     */
    public Boolean getHas_injuries() {
        return has_injuries;
    }

    /**
     * 
     * @param has_injuries
     *     The has_injuries
     */
    public void setHas_injuries(Boolean has_injuries) {
        this.has_injuries = has_injuries;
    }

    /**
     * 
     * @return
     *     The has_rosters
     */
    public Boolean getHas_rosters() {
        return has_rosters;
    }

    /**
     * 
     * @param has_rosters
     *     The has_rosters
     */
    public void setHas_rosters(Boolean has_rosters) {
        this.has_rosters = has_rosters;
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
     *     The subscription_count
     */
    public Integer getSubscription_count() {
        return subscription_count;
    }

    /**
     * 
     * @param subscription_count
     *     The subscription_count
     */
    public void setSubscription_count(Integer subscription_count) {
        this.subscription_count = subscription_count;
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
