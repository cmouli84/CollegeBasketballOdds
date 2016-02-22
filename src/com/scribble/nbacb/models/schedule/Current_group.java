
package com.scribble.nbacb.models.schedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Current_group {

    private String guid;
    private String id;
    private String label;
    private String season_type;
    private String start_date;
    private String end_date;
    private List<Integer> event_ids = new ArrayList<Integer>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The guid
     */
    public String getGuid() {
        return guid;
    }

    /**
     * 
     * @param guid
     *     The guid
     */
    public void setGuid(String guid) {
        this.guid = guid;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The label
     */
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    public void setLabel(String label) {
        this.label = label;
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
     *     The start_date
     */
    public String getStart_date() {
        return start_date;
    }

    /**
     * 
     * @param start_date
     *     The start_date
     */
    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    /**
     * 
     * @return
     *     The end_date
     */
    public String getEnd_date() {
        return end_date;
    }

    /**
     * 
     * @param end_date
     *     The end_date
     */
    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    /**
     * 
     * @return
     *     The event_ids
     */
    public List<Integer> getEvent_ids() {
        return event_ids;
    }

    /**
     * 
     * @param event_ids
     *     The event_ids
     */
    public void setEvent_ids(List<Integer> event_ids) {
        this.event_ids = event_ids;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
