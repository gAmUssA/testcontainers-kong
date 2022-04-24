
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "http_failures",
    "http_statuses",
    "interval",
    "tcp_failures",
    "timeouts"
})
@Generated("jsonschema2pojo")
public class Unhealthy__3 {

    @JsonProperty("http_failures")
    private Integer httpFailures;
    @JsonProperty("http_statuses")
    private List<Integer> httpStatuses = null;
    @JsonProperty("interval")
    private Integer interval;
    @JsonProperty("tcp_failures")
    private Integer tcpFailures;
    @JsonProperty("timeouts")
    private Integer timeouts;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Unhealthy__3() {
    }

    /**
     * 
     * @param httpStatuses
     * @param tcpFailures
     * @param timeouts
     * @param httpFailures
     * @param interval
     */
    public Unhealthy__3(Integer httpFailures, List<Integer> httpStatuses, Integer interval, Integer tcpFailures, Integer timeouts) {
        super();
        this.httpFailures = httpFailures;
        this.httpStatuses = httpStatuses;
        this.interval = interval;
        this.tcpFailures = tcpFailures;
        this.timeouts = timeouts;
    }

    @JsonProperty("http_failures")
    public Integer getHttpFailures() {
        return httpFailures;
    }

    @JsonProperty("http_failures")
    public void setHttpFailures(Integer httpFailures) {
        this.httpFailures = httpFailures;
    }

    public Unhealthy__3 withHttpFailures(Integer httpFailures) {
        this.httpFailures = httpFailures;
        return this;
    }

    @JsonProperty("http_statuses")
    public List<Integer> getHttpStatuses() {
        return httpStatuses;
    }

    @JsonProperty("http_statuses")
    public void setHttpStatuses(List<Integer> httpStatuses) {
        this.httpStatuses = httpStatuses;
    }

    public Unhealthy__3 withHttpStatuses(List<Integer> httpStatuses) {
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

    public Unhealthy__3 withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    @JsonProperty("tcp_failures")
    public Integer getTcpFailures() {
        return tcpFailures;
    }

    @JsonProperty("tcp_failures")
    public void setTcpFailures(Integer tcpFailures) {
        this.tcpFailures = tcpFailures;
    }

    public Unhealthy__3 withTcpFailures(Integer tcpFailures) {
        this.tcpFailures = tcpFailures;
        return this;
    }

    @JsonProperty("timeouts")
    public Integer getTimeouts() {
        return timeouts;
    }

    @JsonProperty("timeouts")
    public void setTimeouts(Integer timeouts) {
        this.timeouts = timeouts;
    }

    public Unhealthy__3 withTimeouts(Integer timeouts) {
        this.timeouts = timeouts;
        return this;
    }

}
