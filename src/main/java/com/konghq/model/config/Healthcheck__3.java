
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
public class Healthcheck__3 {

    @JsonProperty("active")
    private ActiveHealthcheck__3 active;
    @JsonProperty("passive")
    private PassiveHealthcheck__3 passive;
    @JsonProperty("threshold")
    private Double threshold;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Healthcheck__3() {
    }

    /**
     * 
     * @param active
     * @param threshold
     * @param passive
     */
    public Healthcheck__3(ActiveHealthcheck__3 active, PassiveHealthcheck__3 passive, Double threshold) {
        super();
        this.active = active;
        this.passive = passive;
        this.threshold = threshold;
    }

    @JsonProperty("active")
    public ActiveHealthcheck__3 getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(ActiveHealthcheck__3 active) {
        this.active = active;
    }

    public Healthcheck__3 withActive(ActiveHealthcheck__3 active) {
        this.active = active;
        return this;
    }

    @JsonProperty("passive")
    public PassiveHealthcheck__3 getPassive() {
        return passive;
    }

    @JsonProperty("passive")
    public void setPassive(PassiveHealthcheck__3 passive) {
        this.passive = passive;
    }

    public Healthcheck__3 withPassive(PassiveHealthcheck__3 passive) {
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

    public Healthcheck__3 withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

}
