
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "client_id",
    "client_secret",
    "consumer",
    "created_at",
    "hash_secret",
    "id",
    "name",
    "redirect_uris",
    "tags"
})
@Generated("jsonschema2pojo")
public class Oauth2Credential {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_id")
    private String clientId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_secret")
    private String clientSecret;
    @JsonProperty("consumer")
    private Consumer__6 consumer;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("hash_secret")
    private Boolean hashSecret;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("redirect_uris")
    private List<String> redirectUris = null;
    @JsonProperty("tags")
    private List<String> tags = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Oauth2Credential() {
    }

    /**
     * 
     * @param createdAt
     * @param clientId
     * @param name
     * @param clientSecret
     * @param id
     * @param hashSecret
     * @param redirectUris
     * @param consumer
     * @param tags
     */
    public Oauth2Credential(String clientId, String clientSecret, Consumer__6 consumer, Integer createdAt, Boolean hashSecret, String id, String name, List<String> redirectUris, List<String> tags) {
        super();
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.consumer = consumer;
        this.createdAt = createdAt;
        this.hashSecret = hashSecret;
        this.id = id;
        this.name = name;
        this.redirectUris = redirectUris;
        this.tags = tags;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_id")
    public String getClientId() {
        return clientId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_id")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Oauth2Credential withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_secret")
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("client_secret")
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public Oauth2Credential withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    @JsonProperty("consumer")
    public Consumer__6 getConsumer() {
        return consumer;
    }

    @JsonProperty("consumer")
    public void setConsumer(Consumer__6 consumer) {
        this.consumer = consumer;
    }

    public Oauth2Credential withConsumer(Consumer__6 consumer) {
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

    public Oauth2Credential withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("hash_secret")
    public Boolean getHashSecret() {
        return hashSecret;
    }

    @JsonProperty("hash_secret")
    public void setHashSecret(Boolean hashSecret) {
        this.hashSecret = hashSecret;
    }

    public Oauth2Credential withHashSecret(Boolean hashSecret) {
        this.hashSecret = hashSecret;
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

    public Oauth2Credential withId(String id) {
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

    public Oauth2Credential withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("redirect_uris")
    public List<String> getRedirectUris() {
        return redirectUris;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("redirect_uris")
    public void setRedirectUris(List<String> redirectUris) {
        this.redirectUris = redirectUris;
    }

    public Oauth2Credential withRedirectUris(List<String> redirectUris) {
        this.redirectUris = redirectUris;
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

    public Oauth2Credential withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

}
