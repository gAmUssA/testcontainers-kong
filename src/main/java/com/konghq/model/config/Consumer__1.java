
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "created_at",
    "custom_id",
    "id",
    "tags",
    "username"
})
@Generated("jsonschema2pojo")
public class Consumer__1 {

    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("custom_id")
    private String customId;
    @JsonProperty("id")
    private String id;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("username")
    private String username;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Consumer__1() {
    }

    /**
     * 
     * @param createdAt
     * @param id
     * @param customId
     * @param tags
     * @param username
     */
    public Consumer__1(Integer createdAt, String customId, String id, List<String> tags, String username) {
        super();
        this.createdAt = createdAt;
        this.customId = customId;
        this.id = id;
        this.tags = tags;
        this.username = username;
    }

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Consumer__1 withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("custom_id")
    public String getCustomId() {
        return customId;
    }

    @JsonProperty("custom_id")
    public void setCustomId(String customId) {
        this.customId = customId;
    }

    public Consumer__1 withCustomId(String customId) {
        this.customId = customId;
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

    public Consumer__1 withId(String id) {
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

    public Consumer__1 withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public Consumer__1 withUsername(String username) {
        this.username = username;
        return this;
    }

}
