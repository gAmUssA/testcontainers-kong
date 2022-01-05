
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "comment",
    "created_at",
    "endpoint_permissions",
    "id",
    "is_default",
    "name"
})
@Generated("jsonschema2pojo")
public class FRBACRole {

    @JsonProperty("comment")
    private String comment;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("endpoint_permissions")
    private List<FRBACEndpointPermission> endpointPermissions = null;
    @JsonProperty("id")
    private String id;
    @JsonProperty("is_default")
    private Boolean isDefault;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FRBACRole() {
    }

    /**
     * 
     * @param createdAt
     * @param isDefault
     * @param name
     * @param endpointPermissions
     * @param comment
     * @param id
     */
    public FRBACRole(String comment, Integer createdAt, List<FRBACEndpointPermission> endpointPermissions, String id, Boolean isDefault, String name) {
        super();
        this.comment = comment;
        this.createdAt = createdAt;
        this.endpointPermissions = endpointPermissions;
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

    public FRBACRole withComment(String comment) {
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

    public FRBACRole withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("endpoint_permissions")
    public List<FRBACEndpointPermission> getEndpointPermissions() {
        return endpointPermissions;
    }

    @JsonProperty("endpoint_permissions")
    public void setEndpointPermissions(List<FRBACEndpointPermission> endpointPermissions) {
        this.endpointPermissions = endpointPermissions;
    }

    public FRBACRole withEndpointPermissions(List<FRBACEndpointPermission> endpointPermissions) {
        this.endpointPermissions = endpointPermissions;
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

    public FRBACRole withId(String id) {
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

    public FRBACRole withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
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

    public FRBACRole withName(String name) {
        this.name = name;
        return this;
    }

}
