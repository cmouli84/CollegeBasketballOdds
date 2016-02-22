
package com.scribble.nbacb.models.events;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class League {

    private Localizations localizations;
    private Double daily_rollover_offset;
    private String daily_rollover_time;
    private String default_section;
    private String full_name;
    private String medium_name;
    private String season_type;
    private String short_name;
    private String slug;
    private String sport_name;
    private String updated_at;
    private String api_uri;
    private String resource_uri;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The localizations
     */
    public Localizations getLocalizations() {
        return localizations;
    }

    /**
     * 
     * @param localizations
     *     The localizations
     */
    public void setLocalizations(Localizations localizations) {
        this.localizations = localizations;
    }

    /**
     * 
     * @return
     *     The daily_rollover_offset
     */
    public Double getDaily_rollover_offset() {
        return daily_rollover_offset;
    }

    /**
     * 
     * @param daily_rollover_offset
     *     The daily_rollover_offset
     */
    public void setDaily_rollover_offset(Double daily_rollover_offset) {
        this.daily_rollover_offset = daily_rollover_offset;
    }

    /**
     * 
     * @return
     *     The daily_rollover_time
     */
    public String getDaily_rollover_time() {
        return daily_rollover_time;
    }

    /**
     * 
     * @param daily_rollover_time
     *     The daily_rollover_time
     */
    public void setDaily_rollover_time(String daily_rollover_time) {
        this.daily_rollover_time = daily_rollover_time;
    }

    /**
     * 
     * @return
     *     The default_section
     */
    public String getDefault_section() {
        return default_section;
    }

    /**
     * 
     * @param default_section
     *     The default_section
     */
    public void setDefault_section(String default_section) {
        this.default_section = default_section;
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
     *     The season_type
     */
    public String getSeason_type() {
        return season_type;
    }

    /**
     * 
     * @param season_type
     *     The season_type
     */
    public void setSeason_type(String season_type) {
        this.season_type = season_type;
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
     *     The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     * 
     * @param slug
     *     The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * 
     * @return
     *     The sport_name
     */
    public String getSport_name() {
        return sport_name;
    }

    /**
     * 
     * @param sport_name
     *     The sport_name
     */
    public void setSport_name(String sport_name) {
        this.sport_name = sport_name;
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
