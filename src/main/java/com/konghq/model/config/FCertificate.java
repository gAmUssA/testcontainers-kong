
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cert",
    "created_at",
    "id",
    "key",
    "snis",
    "tags"
})
@Generated("jsonschema2pojo")
public class FCertificate {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cert")
    private String cert;
    @JsonProperty("created_at")
    private Integer createdAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("key")
    private String key;
    @JsonProperty("snis")
    private List<Sni> snis = null;
    @JsonProperty("tags")
    private List<String> tags = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FCertificate() {
    }

    /**
     * 
     * @param snis
     * @param createdAt
     * @param cert
     * @param id
     * @param key
     * @param tags
     */
    public FCertificate(String cert, Integer createdAt, String id, String key, List<Sni> snis, List<String> tags) {
        super();
        this.cert = cert;
        this.createdAt = createdAt;
        this.id = id;
        this.key = key;
        this.snis = snis;
        this.tags = tags;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cert")
    public String getCert() {
        return cert;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cert")
    public void setCert(String cert) {
        this.cert = cert;
    }

    public FCertificate withCert(String cert) {
        this.cert = cert;
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

    public FCertificate withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FCertificate withId(String id) {
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

    public FCertificate withKey(String key) {
        this.key = key;
        return this;
    }

    @JsonProperty("snis")
    public List<Sni> getSnis() {
        return snis;
    }

    @JsonProperty("snis")
    public void setSnis(List<Sni> snis) {
        this.snis = snis;
    }

    public FCertificate withSnis(List<Sni> snis) {
        this.snis = snis;
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

    public FCertificate withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

}
