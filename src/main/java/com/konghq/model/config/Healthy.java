
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "http_statuses",
    "interval",
    "successes"
})
@Generated("jsonschema2pojo")
public class Healthy {

    @JsonProperty("http_statuses")
    private List<Integer> httpStatuses = null;
    @JsonProperty("interval")
    private Integer interval;
    @JsonProperty("successes")
    private Integer successes;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Healthy() {
    }

    /**
     * 
     * @param httpStatuses
     * @param successes
     * @param interval
     */
    public Healthy(List<Integer> httpStatuses, Integer interval, Integer successes) {
        super();
        this.httpStatuses = httpStatuses;
        this.interval = interval;
        this.successes = successes;
    }

    @JsonProperty("http_statuses")
    public List<Integer> getHttpStatuses() {
        return httpStatuses;
    }

    @JsonProperty("http_statuses")
    public void setHttpStatuses(List<Integer> httpStatuses) {
        this.httpStatuses = httpStatuses;
    }

    public Healthy withHttpStatuses(List<Integer> httpStatuses) {
        this.httpStatuses = httpStatuses;
        return this;
    }

    @JsonProperty("interval")
    public Integer getInterval() {
        return interval;
    }

    @JsonProperty("interval")
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public Healthy withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    @JsonProperty("successes")
    public Integer getSuccesses() {
        return successes;
    }

    @JsonProperty("successes")
    public void setSuccesses(Integer successes) {
        this.successes = successes;
    }

    public Healthy withSuccesses(Integer successes) {
        this.successes = successes;
        return this;
    }

}