
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ca_certificate",
    "consumer",
    "created_at",
    "id",
    "subject_name",
    "tags"
})
@Generated("jsonschema2pojo")
public class MTLSAuth {

    @JsonProperty("ca_certificate")
    private CACertificate caCertificate;
    @JsonProperty("consumer")
    private Consumer__5 consumer;
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
    @JsonProperty("subject_name")
    private String subjectName;
    @JsonProperty("tags")
    private List<String> tags = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MTLSAuth() {
    }

    /**
     * 
     * @param createdAt
     * @param id
     * @param caCertificate
     * @param consumer
     * @param subjectName
     * @param tags
     */
    public MTLSAuth(CACertificate caCertificate, Consumer__5 consumer, Integer createdAt, String id, String subjectName, List<String> tags) {
        super();
        this.caCertificate = caCertificate;
        this.consumer = consumer;
        this.createdAt = createdAt;
        this.id = id;
        this.subjectName = subjectName;
        this.tags = tags;
    }

    @JsonProperty("ca_certificate")
    public CACertificate getCaCertificate() {
        return caCertificate;
    }

    @JsonProperty("ca_certificate")
    public void setCaCertificate(CACertificate caCertificate) {
        this.caCertificate = caCertificate;
    }

    public MTLSAuth withCaCertificate(CACertificate caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }

    @JsonProperty("consumer")
    public Consumer__5 getConsumer() {
        return consumer;
    }

    @JsonProperty("consumer")
    public void setConsumer(Consumer__5 consumer) {
        this.consumer = consumer;
    }

    public MTLSAuth withConsumer(Consumer__5 consumer) {
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

    public MTLSAuth withCreatedAt(Integer createdAt) {
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

    public MTLSAuth withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subject_name")
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("subject_name")
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public MTLSAuth withSubjectName(String subjectName) {
        this.subjectName = subjectName;
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

    public MTLSAuth withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

}
