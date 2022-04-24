
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
public class PassiveHealthcheck__3 {

    @JsonProperty("healthy")
    private Healthy__7 healthy;
    @JsonProperty("type")
    private String type;
    @JsonProperty("unhealthy")
    private Unhealthy__7 unhealthy;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PassiveHealthcheck__3() {
    }

    /**
     * 
     * @param healthy
     * @param unhealthy
     * @param type
     */
    public PassiveHealthcheck__3(Healthy__7 healthy, String type, Unhealthy__7 unhealthy) {
        super();
        this.healthy = healthy;
        this.type = type;
        this.unhealthy = unhealthy;
    }

    @JsonProperty("healthy")
    public Healthy__7 getHealthy() {
        return healthy;
    }

    @JsonProperty("healthy")
    public void setHealthy(Healthy__7 healthy) {
        this.healthy = healthy;
    }

    public PassiveHealthcheck__3 withHealthy(Healthy__7 healthy) {
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

    public PassiveHealthcheck__3 withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("unhealthy")
    public Unhealthy__7 getUnhealthy() {
        return unhealthy;
    }

    @JsonProperty("unhealthy")
    public void setUnhealthy(Unhealthy__7 unhealthy) {
        this.unhealthy = unhealthy;
    }

    public PassiveHealthcheck__3 withUnhealthy(Unhealthy__7 unhealthy) {
        this.unhealthy = unhealthy;
        return this;
    }

}
