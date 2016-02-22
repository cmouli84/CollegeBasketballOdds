
package com.scribble.nbacb.models.events;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Colours {

    private Object away;
    private Object home;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    /**
     * 
     * @return
     *     The home
     */
    public Object getHome() {
        return home;
    }

    /**
     * 
     * @param home
     *     The home
     */
    public void setHome(Object home) {
        this.home = home;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
