
package com.scribble.nbacb.models.standings;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Season {

    private Integer id;
    private String short_name;
    private String api_uri;
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
