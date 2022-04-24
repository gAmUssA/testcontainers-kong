
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "algorithm",
    "consumer",
    "created_at",
    "id",
    "key",
    "rsa_public_key",
    "secret",
    "tags"
})
@Generated("jsonschema2pojo")
public class JWTAuth {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    private String algorithm;
    @JsonProperty("consumer")
    private Consumer__3 consumer;
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
    @JsonProperty("rsa_public_key")
    private String rsaPublicKey;
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
     * No args constructor for use in serialization
     * 
     */
    public JWTAuth() {
    }

    /**
     * 
     * @param createdAt
     * @param id
     * @param secret
     * @param rsaPublicKey
     * @param consumer
     * @param key
     * @param algorithm
     * @param tags
     */
    public JWTAuth(String algorithm, Consumer__3 consumer, Integer createdAt, String id, String key, String rsaPublicKey, String secret, List<String> tags) {
        super();
        this.algorithm = algorithm;
        this.consumer = consumer;
        this.createdAt = createdAt;
        this.id = id;
        this.key = key;
        this.rsaPublicKey = rsaPublicKey;
        this.secret = secret;
        this.tags = tags;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("algorithm")
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public JWTAuth withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    @JsonProperty("consumer")
    public Consumer__3 getConsumer() {
        return consumer;
    }

    @JsonProperty("consumer")
    public void setConsumer(Consumer__3 consumer) {
        this.consumer = consumer;
    }

    public JWTAuth withConsumer(Consumer__3 consumer) {
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

    public JWTAuth withCreatedAt(Integer createdAt) {
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

    public JWTAuth withId(String id) {
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

    public JWTAuth withKey(String key) {
        this.key = key;
        return this;
    }

    @JsonProperty("rsa_public_key")
    public String getRsaPublicKey() {
        return rsaPublicKey;
    }

    @JsonProperty("rsa_public_key")
    public void setRsaPublicKey(String rsaPublicKey) {
        this.rsaPublicKey = rsaPublicKey;
    }

    public JWTAuth withRsaPublicKey(String rsaPublicKey) {
        this.rsaPublicKey = rsaPublicKey;
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

    public JWTAuth withSecret(String secret) {
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

    public JWTAuth withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

}
