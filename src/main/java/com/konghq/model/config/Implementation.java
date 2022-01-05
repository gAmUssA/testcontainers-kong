
package com.konghq.model.config;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "kong",
    "type"
})
@Generated("jsonschema2pojo")
public class Implementation {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kong")
    private Kong__1 kong;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private String type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Implementation() {
    }

    /**
     * 
     * @param type
     * @param kong
     */
    public Implementation(Kong__1 kong, String type) {
        super();
        this.kong = kong;
        this.type = type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kong")
    public Kong__1 getKong() {
        return kong;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("kong")
    public void setKong(Kong__1 kong) {
        this.kong = kong;
    }

    public Implementation withKong(Kong__1 kong) {
        this.kong = kong;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Implementation withType(String type) {
        this.type = type;
        return this;
    }

}
