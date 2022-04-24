
package com.konghq.model.config;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "route",
    "service",
    "target",
    "upstream"
})
@Generated("jsonschema2pojo")
public class KongDefaults {

    @JsonProperty("route")
    private Route route;
    @JsonProperty("service")
    private Service__1 service;
    @JsonProperty("target")
    private Target target;
    @JsonProperty("upstream")
    private Upstream__1 upstream;

    /**
     * No args constructor for use in serialization
     * 
     */
    public KongDefaults() {
    }

    /**
     * 
     * @param route
     * @param upstream
     * @param service
     * @param target
     */
    public KongDefaults(Route route, Service__1 service, Target target, Upstream__1 upstream) {
        super();
        this.route = route;
        this.service = service;
        this.target = target;
        this.upstream = upstream;
    }

    @JsonProperty("route")
    public Route getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(Route route) {
        this.route = route;
    }

    public KongDefaults withRoute(Route route) {
        this.route = route;
        return this;
    }

    @JsonProperty("service")
    public Service__1 getService() {
        return service;
    }

    @JsonProperty("service")
    public void setService(Service__1 service) {
        this.service = service;
    }

    public KongDefaults withService(Service__1 service) {
        this.service = service;
        return this;
    }

    @JsonProperty("target")
    public Target getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(Target target) {
        this.target = target;
    }

    public KongDefaults withTarget(Target target) {
        this.target = target;
        return this;
    }

    @JsonProperty("upstream")
    public Upstream__1 getUpstream() {
        return upstream;
    }

    @JsonProperty("upstream")
    public void setUpstream(Upstream__1 upstream) {
        this.upstream = upstream;
    }

    public KongDefaults withUpstream(Upstream__1 upstream) {
        this.upstream = upstream;
        return this;
    }

}
