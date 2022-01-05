
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
public class PassiveHealthcheck__2 {

    @JsonProperty("healthy")
    private Healthy__5 healthy;
    @JsonProperty("type")
    private String type;
    @JsonProperty("unhealthy")
    private Unhealthy__5 unhealthy;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PassiveHealthcheck__2() {
    }

    /**
     * 
     * @param healthy
     * @param unhealthy
     * @param type
     */
    public PassiveHealthcheck__2(Healthy__5 healthy, String type, Unhealthy__5 unhealthy) {
        super();
        this.healthy = healthy;
        this.type = type;
        this.unhealthy = unhealthy;
    }

    @JsonProperty("healthy")
    public Healthy__5 getHealthy() {
        return healthy;
    }

    @JsonProperty("healthy")
    public void setHealthy(Healthy__5 healthy) {
        this.healthy = healthy;
    }

    public PassiveHealthcheck__2 withHealthy(Healthy__5 healthy) {
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

    public PassiveHealthcheck__2 withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("unhealthy")
    public Unhealthy__5 getUnhealthy() {
        return unhealthy;
    }

    @JsonProperty("unhealthy")
    public void setUnhealthy(Unhealthy__5 unhealthy) {
        this.unhealthy = unhealthy;
    }

    public PassiveHealthcheck__2 withUnhealthy(Unhealthy__5 unhealthy) {
        this.unhealthy = unhealthy;
        return this;
    }

}
