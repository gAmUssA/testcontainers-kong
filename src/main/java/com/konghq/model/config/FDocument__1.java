
package com.konghq.model.config;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "path",
    "published"
})
@Generated("jsonschema2pojo")
public class FDocument__1 {

    @JsonProperty("id")
    private String id;
    @JsonProperty("path")
    private String path;
    @JsonProperty("published")
    private Boolean published;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FDocument__1() {
    }

    /**
     * 
     * @param path
     * @param id
     * @param published
     */
    public FDocument__1(String id, String path, Boolean published) {
        super();
        this.id = id;
        this.path = path;
        this.published = published;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public FDocument__1 withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    public FDocument__1 withPath(String path) {
        this.path = path;
        return this;
    }

    @JsonProperty("published")
    public Boolean getPublished() {
        return published;
    }

    @JsonProperty("published")
    public void setPublished(Boolean published) {
        this.published = published;
    }

    public FDocument__1 withPublished(Boolean published) {
        this.published = published;
        return this;
    }

}
