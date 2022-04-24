
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
public class PassiveHealthcheck__1 {

    @JsonProperty("healthy")
    private Healthy__3 healthy;
    @JsonProperty("type")
    private String type;
    @JsonProperty("unhealthy")
    private Unhealthy__3 unhealthy;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PassiveHealthcheck__1() {
    }

    /**
     * 
     * @param healthy
     * @param unhealthy
     * @param type
     */
    public PassiveHealthcheck__1(Healthy__3 healthy, String type, Unhealthy__3 unhealthy) {
        super();
        this.healthy = healthy;
        this.type = type;
        this.unhealthy = unhealthy;
    }

    @JsonProperty("healthy")
    public Healthy__3 getHealthy() {
        return healthy;
    }

    @JsonProperty("healthy")
    public void setHealthy(Healthy__3 healthy) {
        this.healthy = healthy;
    }

    public PassiveHealthcheck__1 withHealthy(Healthy__3 healthy) {
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

    public PassiveHealthcheck__1 withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("unhealthy")
    public Unhealthy__3 getUnhealthy() {
        return unhealthy;
    }

    @JsonProperty("unhealthy")
    public void setUnhealthy(Unhealthy__3 unhealthy) {
        this.unhealthy = unhealthy;
    }

    public PassiveHealthcheck__1 withUnhealthy(Unhealthy__3 unhealthy) {
        this.unhealthy = unhealthy;
        return this;
    }

}
