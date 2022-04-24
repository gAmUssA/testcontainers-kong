
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "document",
    "id",
    "name",
    "versions"
})
@Generated("jsonschema2pojo")
public class FServicePackage {

    @JsonProperty("description")
    private String description;
    @JsonProperty("document")
    private FDocument document;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    @JsonProperty("versions")
    private List<FServiceVersion> versions = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FServicePackage() {
    }

    /**
     * 
     * @param versions
     * @param document
     * @param name
     * @param description
     * @param id
     */
    public FServicePackage(String description, FDocument document, String id, String name, List<FServiceVersion> versions) {
        super();
        this.description = description;
        this.document = document;
        this.id = id;
        this.name = name;
        this.versions = versions;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public FServicePackage withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("document")
    public FDocument getDocument() {
        return document;
    }

    @JsonProperty("document")
    public void setDocument(FDocument document) {
        this.document = document;
    }

    public FServicePackage withDocument(FDocument document) {
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

    public FServicePackage withId(String id) {
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

    public FServicePackage withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("versions")
    public List<FServiceVersion> getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public void setVersions(List<FServiceVersion> versions) {
        this.versions = versions;
    }

    public FServicePackage withVersions(List<FServiceVersion> versions) {
        this.versions = versions;
        return this;
    }

}
