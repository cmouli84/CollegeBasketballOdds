
package com.scribble.nbacb.models.events;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Progress {

    private String clock_label;
    private String string;
    private String status;
    private String event_status;
    private Integer segment;
    private String segment_string;
    private String segment_description;
    private String clock;
    private Boolean overtime;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The clock_label
     */
    public String getClock_label() {
        return clock_label;
    }

    /**
     * 
     * @param clock_label
     *     The clock_label
     */
    public void setClock_label(String clock_label) {
        this.clock_label = clock_label;
    }

    /**
     * 
     * @return
     *     The string
     */
    public String getString() {
        return string;
    }

    /**
     * 
     * @param string
     *     The string
     */
    public void setString(String string) {
        this.string = string;
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
     *     The segment
     */
    public Integer getSegment() {
        return segment;
    }

    /**
     * 
     * @param segment
     *     The segment
     */
    public void setSegment(Integer segment) {
        this.segment = segment;
    }

    /**
     * 
     * @return
     *     The segment_string
     */
    public String getSegment_string() {
        return segment_string;
    }

    /**
     * 
     * @param segment_string
     *     The segment_string
     */
    public void setSegment_string(String segment_string) {
        this.segment_string = segment_string;
    }

    /**
     * 
     * @return
     *     The segment_description
     */
    public String getSegment_description() {
        return segment_description;
    }

    /**
     * 
     * @param segment_description
     *     The segment_description
     */
    public void setSegment_description(String segment_description) {
        this.segment_description = segment_description;
    }

    /**
     * 
     * @return
     *     The clock
     */
    public String getClock() {
        return clock;
    }

    /**
     * 
     * @param clock
     *     The clock
     */
    public void setClock(String clock) {
        this.clock = clock;
    }

    /**
     * 
     * @return
     *     The overtime
     */
    public Boolean getOvertime() {
        return overtime;
    }

    /**
     * 
     * @param overtime
     *     The overtime
     */
    public void setOvertime(Boolean overtime) {
        this.overtime = overtime;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
