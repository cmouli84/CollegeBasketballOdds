
package com.scribble.nbacb.models.events;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Logos_ {

    private String large;
    private String small;
    private String w72xh72;
    private String tiny;
    private Object facing;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The large
     */
    public String getLarge() {
        return large;
    }

    /**
     * 
     * @param large
     *     The large
     */
    public void setLarge(String large) {
        this.large = large;
    }

    /**
     * 
     * @return
     *     The small
     */
    public String getSmall() {
        return small;
    }

    /**
     * 
     * @param small
     *     The small
     */
    public void setSmall(String small) {
        this.small = small;
    }

    /**
     * 
     * @return
     *     The w72xh72
     */
    public String getW72xh72() {
        return w72xh72;
    }

    /**
     * 
     * @param w72xh72
     *     The w72xh72
     */
    public void setW72xh72(String w72xh72) {
        this.w72xh72 = w72xh72;
    }

    /**
     * 
     * @return
     *     The tiny
     */
    public String getTiny() {
        return tiny;
    }

    /**
     * 
     * @param tiny
     *     The tiny
     */
    public void setTiny(String tiny) {
        this.tiny = tiny;
    }

    /**
     * 
     * @return
     *     The facing
     */
    public Object getFacing() {
        return facing;
    }

    /**
     * 
     * @param facing
     *     The facing
     */
    public void setFacing(Object facing) {
        this.facing = facing;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
