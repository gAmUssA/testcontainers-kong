
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_config",
    "consumer",
    "created_at",
    "enabled",
    "id",
    "name",
    "protocols",
    "route",
    "run_on",
    "service",
    "tags"
})
@Generated("jsonschema2pojo")
public class FPlugin__1 {

    @JsonProperty("_config")
    private String config;
    @JsonProperty("consumer")
    private String consumer;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    @JsonProperty("protocols")
    private List<String> protocols = null;
    @JsonProperty("route")
    private String route;
    @JsonProperty("run_on")
    private String runOn;
    @JsonProperty("service")
    private String service;
    @JsonProperty("tags")
    private List<String> tags = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FPlugin__1() {
    }

    /**
     * 
     * @param createdAt
     * @param route
     * @param service
     * @param runOn
     * @param name
     * @param id
     * @param protocols
     * @param config
     * @param consumer
     * @param enabled
     * @param tags
     */
    public FPlugin__1(String config, String consumer, Integer createdAt, Boolean enabled, String id, String name, List<String> protocols, String route, String runOn, String service, List<String> tags) {
        super();
        this.config = config;
        this.consumer = consumer;
        this.createdAt = createdAt;
        this.enabled = enabled;
        this.id = id;
        this.name = name;
        this.protocols = protocols;
        this.route = route;
        this.runOn = runOn;
        this.service = service;
        this.tags = tags;
    }

    @JsonProperty("_config")
    public String getConfig() {
        return config;
    }

    @JsonProperty("_config")
    public void setConfig(String config) {
        this.config = config;
    }

    public FPlugin__1 withConfig(String config) {
        this.config = config;
        return this;
    }

    @JsonProperty("consumer")
    public String getConsumer() {
        return consumer;
    }

    @JsonProperty("consumer")
    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public FPlugin__1 withConsumer(String consumer) {
        this.consumer = consumer;
        return this;
    }

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public FPlugin__1 withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public FPlugin__1 withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FPlugin__1 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public FPlugin__1 withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("protocols")
    public List<String> getProtocols() {
        return protocols;
    }

    @JsonProperty("protocols")
    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }

    public FPlugin__1 withProtocols(List<String> protocols) {
        this.protocols = protocols;
        return this;
    }

    @JsonProperty("route")
    public String getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(String route) {
        this.route = route;
    }

    public FPlugin__1 withRoute(String route) {
        this.route = route;
        return this;
    }

    @JsonProperty("run_on")
    public String getRunOn() {
        return runOn;
    }

    @JsonProperty("run_on")
    public void setRunOn(String runOn) {
        this.runOn = runOn;
    }

    public FPlugin__1 withRunOn(String runOn) {
        this.runOn = runOn;
        return this;
    }

    @JsonProperty("service")
    public String getService() {
        return service;
    }

    @JsonProperty("service")
    public void setService(String service) {
        this.service = service;
    }

    public FPlugin__1 withService(String service) {
        this.service = service;
        return this;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public FPlugin__1 withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

}
