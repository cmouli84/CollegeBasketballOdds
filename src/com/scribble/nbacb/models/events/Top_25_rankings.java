
package com.scribble.nbacb.models.events;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Top_25_rankings {

    private Integer home;
    private Object away;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The home
     */
    public Integer getHome() {
        return home;
    }

    /**
     * 
     * @param home
     *     The home
     */
    public void setHome(Integer home) {
        this.home = home;
    }

    /**
     * 
     * @return
     *     The away
     */
    public Object getAway() {
        return away;
    }

    /**
     * 
     * @param away
     *     The away
     */
    public void setAway(Object away) {
        this.away = away;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
