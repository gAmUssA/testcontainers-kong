
package com.konghq.model.config;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "healthy",
    "type",
    "unhealthy"
})
@Generated("jsonschema2pojo")
public class PassiveHealthcheck {

    @JsonProperty("healthy")
    private Healthy__1 healthy;
    @JsonProperty("type")
    private String type;
    @JsonProperty("unhealthy")
    private Unhealthy__1 unhealthy;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PassiveHealthcheck() {
    }

    /**
     * 
     * @param healthy
     * @param unhealthy
     * @param type
     */
    public PassiveHealthcheck(Healthy__1 healthy, String type, Unhealthy__1 unhealthy) {
        super();
        this.healthy = healthy;
        this.type = type;
        this.unhealthy = unhealthy;
    }

    @JsonProperty("healthy")
    public Healthy__1 getHealthy() {
        return healthy;
    }

    @JsonProperty("healthy")
    public void setHealthy(Healthy__1 healthy) {
        this.healthy = healthy;
    }

    public PassiveHealthcheck withHealthy(Healthy__1 healthy) {
        this.healthy = healthy;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public PassiveHealthcheck withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("unhealthy")
    public Unhealthy__1 getUnhealthy() {
        return unhealthy;
    }

    @JsonProperty("unhealthy")
    public void setUnhealthy(Unhealthy__1 unhealthy) {
        this.unhealthy = unhealthy;
    }

    public PassiveHealthcheck withUnhealthy(Unhealthy__1 unhealthy) {
        this.unhealthy = unhealthy;
        return this;
    }

}
