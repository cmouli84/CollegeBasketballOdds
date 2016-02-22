
package com.scribble.nbacb.models.schedule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Season {

    private List<Current_season> current_season = new ArrayList<Current_season>();
    private Current_group current_group;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The current_season
     */
    public List<Current_season> getCurrent_season() {
        return current_season;
    }

    /**
     * 
     * @param current_season
     *     The current_season
     */
    public void setCurrent_season(List<Current_season> current_season) {
        this.current_season = current_season;
    }

    /**
     * 
     * @return
     *     The current_group
     */
    public Current_group getCurrent_group() {
        return current_group;
    }

    /**
     * 
     * @param current_group
     *     The current_group
     */
    public void setCurrent_group(Current_group current_group) {
        this.current_group = current_group;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
