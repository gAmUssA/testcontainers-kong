
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
    "tags"
})
@Generated("jsonschema2pojo")
public class FCACertificate {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("cert")
    private String cert;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("id")
    private String id;
    @JsonProperty("tags")
    private List<String> tags = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FCACertificate() {
    }

    /**
     * 
     * @param createdAt
     * @param cert
     * @param id
     * @param tags
     */
    public FCACertificate(String cert, Integer createdAt, String id, List<String> tags) {
        super();
        this.cert = cert;
        this.createdAt = createdAt;
        this.id = id;
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

    public FCACertificate withCert(String cert) {
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

    public FCACertificate withCreatedAt(Integer createdAt) {
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

    public FCACertificate withId(String id) {
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

    public FCACertificate withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

}
