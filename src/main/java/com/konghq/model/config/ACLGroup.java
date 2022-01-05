
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "consumer",
    "created_at",
    "group",
    "id",
    "tags"
})
@Generated("jsonschema2pojo")
public class ACLGroup {

    @JsonProperty("consumer")
    private Consumer consumer;
    @JsonProperty("created_at")
    private Integer createdAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group")
    private String group;
    @JsonProperty("id")
    private String id;
    @JsonProperty("tags")
    private List<String> tags = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ACLGroup() {
    }

    /**
     * 
     * @param createdAt
     * @param id
     * @param consumer
     * @param group
     * @param tags
     */
    public ACLGroup(Consumer consumer, Integer createdAt, String group, String id, List<String> tags) {
        super();
        this.consumer = consumer;
        this.createdAt = createdAt;
        this.group = group;
        this.id = id;
        this.tags = tags;
    }

    @JsonProperty("consumer")
    public Consumer getConsumer() {
        return consumer;
    }

    @JsonProperty("consumer")
    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public ACLGroup withConsumer(Consumer consumer) {
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

    public ACLGroup withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    public ACLGroup withGroup(String group) {
        this.group = group;
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

    public ACLGroup withId(String id) {
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

    public ACLGroup withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

}
