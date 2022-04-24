
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
    "id",
    "key",
    "tags",
    "ttl"
})
@Generated("jsonschema2pojo")
public class KeyAuth {

    @JsonProperty("consumer")
    private Consumer__4 consumer;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("key")
    private String key;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("ttl")
    private Integer ttl;

    /**
     * No args constructor for use in serialization
     * 
     */
    public KeyAuth() {
    }

    /**
     * 
     * @param createdAt
     * @param id
     * @param ttl
     * @param consumer
     * @param key
     * @param tags
     */
    public KeyAuth(Consumer__4 consumer, Integer createdAt, String id, String key, List<String> tags, Integer ttl) {
        super();
        this.consumer = consumer;
        this.createdAt = createdAt;
        this.id = id;
        this.key = key;
        this.tags = tags;
        this.ttl = ttl;
    }

    @JsonProperty("consumer")
    public Consumer__4 getConsumer() {
        return consumer;
    }

    @JsonProperty("consumer")
    public void setConsumer(Consumer__4 consumer) {
        this.consumer = consumer;
    }

    public KeyAuth withConsumer(Consumer__4 consumer) {
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

    public KeyAuth withCreatedAt(Integer createdAt) {
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

    public KeyAuth withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    public KeyAuth withKey(String key) {
        this.key = key;
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

    public KeyAuth withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("ttl")
    public Integer getTtl() {
        return ttl;
    }

    @JsonProperty("ttl")
    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public KeyAuth withTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }

}
