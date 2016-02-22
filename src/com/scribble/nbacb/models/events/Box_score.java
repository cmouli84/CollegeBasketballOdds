
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

}
