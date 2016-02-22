
package com.scribble.nbacb.models.events;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Odd {

    private String away_odd;
    private String home_odd;
    private Integer id;
    private String line;
    private String over_under;
    private String api_uri;
    private String closing;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The away_odd
     */
    public String getAway_odd() {
        return away_odd;
    }

    /**
     * 
     * @param away_odd
     *     The away_odd
     */
    public void setAway_odd(String away_odd) {
        this.away_odd = away_odd;
    }

    /**
     * 
     * @return
     *     The home_odd
     */
    public String getHome_odd() {
        return home_odd;
    }

    /**
     * 
     * @param home_odd
     *     The home_odd
     */
    public void setHome_odd(String home_odd) {
        this.home_odd = home_odd;
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
     *     The line
     */
    public String getLine() {
        return line;
    }

    /**
     * 
     * @param line
     *     The line
     */
    public void setLine(String line) {
        this.line = line;
    }

    /**
     * 
     * @return
     *     The over_under
     */
    public String getOver_under() {
        return over_under;
    }

    /**
     * 
     * @param over_under
     *     The over_under
     */
    public void setOver_under(String over_under) {
        this.over_under = over_under;
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
     *     The closing
     */
    public String getClosing() {
        return closing;
    }

    /**
     * 
     * @param closing
     *     The closing
     */
    public void setClosing(String closing) {
        this.closing = closing;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
