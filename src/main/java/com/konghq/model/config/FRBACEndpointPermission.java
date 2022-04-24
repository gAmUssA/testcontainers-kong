
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "actions",
    "comment",
    "created_at",
    "endpoint",
    "negative",
    "role",
    "workspace"
})
@Generated("jsonschema2pojo")
public class FRBACEndpointPermission {

    @JsonProperty("actions")
    private List<String> actions = null;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("created_at")
    private Integer createdAt;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endpoint")
    private String endpoint;
    @JsonProperty("negative")
    private Boolean negative;
    @JsonProperty("role")
    private RBACRole role;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("workspace")
    private String workspace;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FRBACEndpointPermission() {
    }

    /**
     * 
     * @param createdAt
     * @param endpoint
     * @param negative
     * @param workspace
     * @param role
     * @param comment
     * @param actions
     */
    public FRBACEndpointPermission(List<String> actions, String comment, Integer createdAt, String endpoint, Boolean negative, RBACRole role, String workspace) {
        super();
        this.actions = actions;
        this.comment = comment;
        this.createdAt = createdAt;
        this.endpoint = endpoint;
        this.negative = negative;
        this.role = role;
        this.workspace = workspace;
    }

    @JsonProperty("actions")
    public List<String> getActions() {
        return actions;
    }

    @JsonProperty("actions")
    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public FRBACEndpointPermission withActions(List<String> actions) {
        this.actions = actions;
        return this;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    public FRBACEndpointPermission withComment(String comment) {
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

    public FRBACEndpointPermission withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endpoint")
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public FRBACEndpointPermission withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    @JsonProperty("negative")
    public Boolean getNegative() {
        return negative;
    }

    @JsonProperty("negative")
    public void setNegative(Boolean negative) {
        this.negative = negative;
    }

    public FRBACEndpointPermission withNegative(Boolean negative) {
        this.negative = negative;
        return this;
    }

    @JsonProperty("role")
    public RBACRole getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(RBACRole role) {
        this.role = role;
    }

    public FRBACEndpointPermission withRole(RBACRole role) {
        this.role = role;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("workspace")
    public String getWorkspace() {
        return workspace;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("workspace")
    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public FRBACEndpointPermission withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

}
