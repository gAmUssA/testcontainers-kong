
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
    "password",
    "tags",
    "username"
})
@Generated("jsonschema2pojo")
public class BasicAuth {

    @JsonProperty("consumer")
    private Consumer__1 consumer;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("password")
    private String password;
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
    public BasicAuth() {
    }

    /**
     * 
     * @param createdAt
     * @param password
     * @param id
     * @param consumer
     * @param tags
     * @param username
     */
    public BasicAuth(Consumer__1 consumer, Integer createdAt, String id, String password, List<String> tags, String username) {
        super();
        this.consumer = consumer;
        this.createdAt = createdAt;
        this.id = id;
        this.password = password;
        this.tags = tags;
        this.username = username;
    }

    @JsonProperty("consumer")
    public Consumer__1 getConsumer() {
        return consumer;
    }

    @JsonProperty("consumer")
    public void setConsumer(Consumer__1 consumer) {
        this.consumer = consumer;
    }

    public BasicAuth withConsumer(Consumer__1 consumer) {
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

    public BasicAuth withCreatedAt(Integer createdAt) {
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

    public BasicAuth withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    public BasicAuth withPassword(String password) {
        this.password = password;
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

    public BasicAuth withTags(List<String> tags) {
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

    public BasicAuth withUsername(String username) {
        this.username = username;
        return this;
    }

}
