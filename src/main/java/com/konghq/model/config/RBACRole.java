
package com.konghq.model.config;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "comment",
    "created_at",
    "id",
    "is_default",
    "name"
})
@Generated("jsonschema2pojo")
public class RBACRole {

    @JsonProperty("comment")
    private String comment;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("id")
    private String id;
    @JsonProperty("is_default")
    private Boolean isDefault;
    @JsonProperty("name")
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RBACRole() {
    }

    /**
     * 
     * @param createdAt
     * @param isDefault
     * @param name
     * @param comment
     * @param id
     */
    public RBACRole(String comment, Integer createdAt, String id, Boolean isDefault, String name) {
        super();
        this.comment = comment;
        this.createdAt = createdAt;
        this.id = id;
        this.isDefault = isDefault;
        this.name = name;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public RBACRole withComment(String comment) {
        this.comment = comment;
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

    public RBACRole withCreatedAt(Integer createdAt) {
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

    public RBACRole withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("is_default")
    public Boolean getIsDefault() {
        return isDefault;
    }

    @JsonProperty("is_default")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public RBACRole withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public RBACRole withName(String name) {
        this.name = name;
        return this;
    }

}
