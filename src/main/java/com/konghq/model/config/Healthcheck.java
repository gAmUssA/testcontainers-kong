
package com.konghq.model.config;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "active",
    "passive",
    "threshold"
})
@Generated("jsonschema2pojo")
public class Healthcheck {

    @JsonProperty("active")
    private ActiveHealthcheck active;
    @JsonProperty("passive")
    private PassiveHealthcheck passive;
    @JsonProperty("threshold")
    private Double threshold;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Healthcheck() {
    }

    /**
     * 
     * @param active
     * @param threshold
     * @param passive
     */
    public Healthcheck(ActiveHealthcheck active, PassiveHealthcheck passive, Double threshold) {
        super();
        this.active = active;
        this.passive = passive;
        this.threshold = threshold;
    }

    @JsonProperty("active")
    public ActiveHealthcheck getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(ActiveHealthcheck active) {
        this.active = active;
    }

    public Healthcheck withActive(ActiveHealthcheck active) {
        this.active = active;
        return this;
    }

    @JsonProperty("passive")
    public PassiveHealthcheck getPassive() {
        return passive;
    }

    @JsonProperty("passive")
    public void setPassive(PassiveHealthcheck passive) {
        this.passive = passive;
    }

    public Healthcheck withPassive(PassiveHealthcheck passive) {
        this.passive = passive;
        return this;
    }

    @JsonProperty("threshold")
    public Double getThreshold() {
        return threshold;
    }

    @JsonProperty("threshold")
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public Healthcheck withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

}
