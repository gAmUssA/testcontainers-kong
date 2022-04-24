
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
    "secret",
    "tags",
    "username"
})
@Generated("jsonschema2pojo")
public class HMACAuth {

    @JsonProperty("consumer")
    private Consumer__2 consumer;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secret")
    private String secret;
    @JsonProperty("tags")
    private List<String> tags = null;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("username")
    private String username;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HMACAuth() {
    }

    /**
     * 
     * @param createdAt
     * @param id
     * @param secret
     * @param consumer
     * @param tags
     * @param username
     */
    public HMACAuth(Consumer__2 consumer, Integer createdAt, String id, String secret, List<String> tags, String username) {
        super();
        this.consumer = consumer;
        this.createdAt = createdAt;
        this.id = id;
        this.secret = secret;
        this.tags = tags;
        this.username = username;
    }

    @JsonProperty("consumer")
    public Consumer__2 getConsumer() {
        return consumer;
    }

    @JsonProperty("consumer")
    public void setConsumer(Consumer__2 consumer) {
        this.consumer = consumer;
    }

    public HMACAuth withConsumer(Consumer__2 consumer) {
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

    public HMACAuth withCreatedAt(Integer createdAt) {
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

    public HMACAuth withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secret")
    public String getSecret() {
        return secret;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("secret")
    public void setSecret(String secret) {
        this.secret = secret;
    }

    public HMACAuth withSecret(String secret) {
        this.secret = secret;
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

    public HMACAuth withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public HMACAuth withUsername(String username) {
        this.username = username;
        return this;
    }

}
