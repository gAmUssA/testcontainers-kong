
package com.konghq.model.config;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "document",
    "id",
    "implementation",
    "version"
})
@Generated("jsonschema2pojo")
public class FServiceVersion {

    @JsonProperty("document")
    private FDocument__1 document;
    @JsonProperty("id")
    private String id;
    @JsonProperty("implementation")
    private Implementation implementation;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    private String version;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FServiceVersion() {
    }

    /**
     * 
     * @param document
     * @param implementation
     * @param id
     * @param version
     */
    public FServiceVersion(FDocument__1 document, String id, Implementation implementation, String version) {
        super();
        this.document = document;
        this.id = id;
        this.implementation = implementation;
        this.version = version;
    }

    @JsonProperty("document")
    public FDocument__1 getDocument() {
        return document;
    }

    @JsonProperty("document")
    public void setDocument(FDocument__1 document) {
        this.document = document;
    }

    public FServiceVersion withDocument(FDocument__1 document) {
        this.document = document;
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

    public FServiceVersion withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("implementation")
    public Implementation getImplementation() {
        return implementation;
    }

    @JsonProperty("implementation")
    public void setImplementation(Implementation implementation) {
        this.implementation = implementation;
    }

    public FServiceVersion withImplementation(Implementation implementation) {
        this.implementation = implementation;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public FServiceVersion withVersion(String version) {
        this.version = version;
        return this;
    }

}
