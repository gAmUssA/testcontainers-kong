
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "created_at",
    "id",
    "tags",
    "target",
    "upstream",
    "weight"
})
@Generated("jsonschema2pojo")
public class Target {

    @JsonProperty("created_at")
    private Double createdAt;
    @JsonProperty("id")
    private String id;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("target")
    private String target;
    @JsonProperty("upstream")
    private Upstream upstream;
    @JsonProperty("weight")
    private Integer weight;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Target() {
    }

    /**
     * 
     * @param createdAt
     * @param upstream
     * @param weight
     * @param id
     * @param tags
     * @param target
     */
    public Target(Double createdAt, String id, List<String> tags, String target, Upstream upstream, Integer weight) {
        super();
        this.createdAt = createdAt;
        this.id = id;
        this.tags = tags;
        this.target = target;
        this.upstream = upstream;
        this.weight = weight;
    }

    @JsonProperty("created_at")
    public Double getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Double createdAt) {
        this.createdAt = createdAt;
    }

    public Target withCreatedAt(Double createdAt) {
        this.createdAt = createdAt;
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

    public Target withId(String id) {
        this.id = id;
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

    public Target withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("target")
    public String getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(String target) {
        this.target = target;
    }

    public Target withTarget(String target) {
        this.target = target;
        return this;
    }

    @JsonProperty("upstream")
    public Upstream getUpstream() {
        return upstream;
    }

    @JsonProperty("upstream")
    public void setUpstream(Upstream upstream) {
        this.upstream = upstream;
    }

    public Target withUpstream(Upstream upstream) {
        this.upstream = upstream;
        return this;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Target withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

}
