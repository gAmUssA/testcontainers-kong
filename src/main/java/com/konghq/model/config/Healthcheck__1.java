
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
public class Healthcheck__1 {

    @JsonProperty("active")
    private ActiveHealthcheck__1 active;
    @JsonProperty("passive")
    private PassiveHealthcheck__1 passive;
    @JsonProperty("threshold")
    private Double threshold;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Healthcheck__1() {
    }

    /**
     * 
     * @param active
     * @param threshold
     * @param passive
     */
    public Healthcheck__1(ActiveHealthcheck__1 active, PassiveHealthcheck__1 passive, Double threshold) {
        super();
        this.active = active;
        this.passive = passive;
        this.threshold = threshold;
    }

    @JsonProperty("active")
    public ActiveHealthcheck__1 getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(ActiveHealthcheck__1 active) {
        this.active = active;
    }

    public Healthcheck__1 withActive(ActiveHealthcheck__1 active) {
        this.active = active;
        return this;
    }

    @JsonProperty("passive")
    public PassiveHealthcheck__1 getPassive() {
        return passive;
    }

    @JsonProperty("passive")
    public void setPassive(PassiveHealthcheck__1 passive) {
        this.passive = passive;
    }

    public Healthcheck__1 withPassive(PassiveHealthcheck__1 passive) {
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

    public Healthcheck__1 withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

}
