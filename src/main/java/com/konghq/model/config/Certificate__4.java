
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
public class Certificate__4 {

    @JsonProperty("cert")
    private String cert;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("id")
    private String id;
    @JsonProperty("key")
    private String key;
    @JsonProperty("snis")
    private List<String> snis = null;
    @JsonProperty("tags")
    private List<String> tags = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Certificate__4() {
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
    public Certificate__4(String cert, Integer createdAt, String id, String key, List<String> snis, List<String> tags) {
        super();
        this.cert = cert;
        this.createdAt = createdAt;
        this.id = id;
        this.key = key;
        this.snis = snis;
        this.tags = tags;
    }

    @JsonProperty("cert")
    public String getCert() {
        return cert;
    }

    @JsonProperty("cert")
    public void setCert(String cert) {
        this.cert = cert;
    }

    public Certificate__4 withCert(String cert) {
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

    public Certificate__4 withCreatedAt(Integer createdAt) {
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

    public Certificate__4 withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    public Certificate__4 withKey(String key) {
        this.key = key;
        return this;
    }

    @JsonProperty("snis")
    public List<String> getSnis() {
        return snis;
    }

    @JsonProperty("snis")
    public void setSnis(List<String> snis) {
        this.snis = snis;
    }

    public Certificate__4 withSnis(List<String> snis) {
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

    public Certificate__4 withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

}
