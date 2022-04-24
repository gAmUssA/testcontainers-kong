
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "acls",
    "basicauth_credentials",
    "created_at",
    "custom_id",
    "hmacauth_credentials",
    "id",
    "jwt_secrets",
    "keyauth_credentials",
    "mtls_auth_credentials",
    "oauth2_credentials",
    "plugins",
    "tags",
    "username"
})
@Generated("jsonschema2pojo")
public class FConsumer {

    @JsonProperty("acls")
    private List<ACLGroup> acls = null;
    @JsonProperty("basicauth_credentials")
    private List<BasicAuth> basicauthCredentials = null;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("custom_id")
    private String customId;
    @JsonProperty("hmacauth_credentials")
    private List<HMACAuth> hmacauthCredentials = null;
    @JsonProperty("id")
    private String id;
    @JsonProperty("jwt_secrets")
    private List<JWTAuth> jwtSecrets = null;
    @JsonProperty("keyauth_credentials")
    private List<KeyAuth> keyauthCredentials = null;
    @JsonProperty("mtls_auth_credentials")
    private List<MTLSAuth> mtlsAuthCredentials = null;
    @JsonProperty("oauth2_credentials")
    private List<Oauth2Credential> oauth2Credentials = null;
    @JsonProperty("plugins")
    private List<FPlugin> plugins = null;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("username")
    private String username;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FConsumer() {
    }

    /**
     * 
     * @param oauth2Credentials
     * @param acls
     * @param hmacauthCredentials
     * @param plugins
     * @param keyauthCredentials
     * @param basicauthCredentials
     * @param customId
     * @param tags
     * @param mtlsAuthCredentials
     * @param createdAt
     * @param id
     * @param jwtSecrets
     * @param username
     */
    public FConsumer(List<ACLGroup> acls, List<BasicAuth> basicauthCredentials, Integer createdAt, String customId, List<HMACAuth> hmacauthCredentials, String id, List<JWTAuth> jwtSecrets, List<KeyAuth> keyauthCredentials, List<MTLSAuth> mtlsAuthCredentials, List<Oauth2Credential> oauth2Credentials, List<FPlugin> plugins, List<String> tags, String username) {
        super();
        this.acls = acls;
        this.basicauthCredentials = basicauthCredentials;
        this.createdAt = createdAt;
        this.customId = customId;
        this.hmacauthCredentials = hmacauthCredentials;
        this.id = id;
        this.jwtSecrets = jwtSecrets;
        this.keyauthCredentials = keyauthCredentials;
        this.mtlsAuthCredentials = mtlsAuthCredentials;
        this.oauth2Credentials = oauth2Credentials;
        this.plugins = plugins;
        this.tags = tags;
        this.username = username;
    }

    @JsonProperty("acls")
    public List<ACLGroup> getAcls() {
        return acls;
    }

    @JsonProperty("acls")
    public void setAcls(List<ACLGroup> acls) {
        this.acls = acls;
    }

    public FConsumer withAcls(List<ACLGroup> acls) {
        this.acls = acls;
        return this;
    }

    @JsonProperty("basicauth_credentials")
    public List<BasicAuth> getBasicauthCredentials() {
        return basicauthCredentials;
    }

    @JsonProperty("basicauth_credentials")
    public void setBasicauthCredentials(List<BasicAuth> basicauthCredentials) {
        this.basicauthCredentials = basicauthCredentials;
    }

    public FConsumer withBasicauthCredentials(List<BasicAuth> basicauthCredentials) {
        this.basicauthCredentials = basicauthCredentials;
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

    public FConsumer withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("custom_id")
    public String getCustomId() {
        return customId;
    }

    @JsonProperty("custom_id")
    public void setCustomId(String customId) {
        this.customId = customId;
    }

    public FConsumer withCustomId(String customId) {
        this.customId = customId;
        return this;
    }

    @JsonProperty("hmacauth_credentials")
    public List<HMACAuth> getHmacauthCredentials() {
        return hmacauthCredentials;
    }

    @JsonProperty("hmacauth_credentials")
    public void setHmacauthCredentials(List<HMACAuth> hmacauthCredentials) {
        this.hmacauthCredentials = hmacauthCredentials;
    }

    public FConsumer withHmacauthCredentials(List<HMACAuth> hmacauthCredentials) {
        this.hmacauthCredentials = hmacauthCredentials;
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

    public FConsumer withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("jwt_secrets")
    public List<JWTAuth> getJwtSecrets() {
        return jwtSecrets;
    }

    @JsonProperty("jwt_secrets")
    public void setJwtSecrets(List<JWTAuth> jwtSecrets) {
        this.jwtSecrets = jwtSecrets;
    }

    public FConsumer withJwtSecrets(List<JWTAuth> jwtSecrets) {
        this.jwtSecrets = jwtSecrets;
        return this;
    }

    @JsonProperty("keyauth_credentials")
    public List<KeyAuth> getKeyauthCredentials() {
        return keyauthCredentials;
    }

    @JsonProperty("keyauth_credentials")
    public void setKeyauthCredentials(List<KeyAuth> keyauthCredentials) {
        this.keyauthCredentials = keyauthCredentials;
    }

    public FConsumer withKeyauthCredentials(List<KeyAuth> keyauthCredentials) {
        this.keyauthCredentials = keyauthCredentials;
        return this;
    }

    @JsonProperty("mtls_auth_credentials")
    public List<MTLSAuth> getMtlsAuthCredentials() {
        return mtlsAuthCredentials;
    }

    @JsonProperty("mtls_auth_credentials")
    public void setMtlsAuthCredentials(List<MTLSAuth> mtlsAuthCredentials) {
        this.mtlsAuthCredentials = mtlsAuthCredentials;
    }

    public FConsumer withMtlsAuthCredentials(List<MTLSAuth> mtlsAuthCredentials) {
        this.mtlsAuthCredentials = mtlsAuthCredentials;
        return this;
    }

    @JsonProperty("oauth2_credentials")
    public List<Oauth2Credential> getOauth2Credentials() {
        return oauth2Credentials;
    }

    @JsonProperty("oauth2_credentials")
    public void setOauth2Credentials(List<Oauth2Credential> oauth2Credentials) {
        this.oauth2Credentials = oauth2Credentials;
    }

    public FConsumer withOauth2Credentials(List<Oauth2Credential> oauth2Credentials) {
        this.oauth2Credentials = oauth2Credentials;
        return this;
    }

    @JsonProperty("plugins")
    public List<FPlugin> getPlugins() {
        return plugins;
    }

    @JsonProperty("plugins")
    public void setPlugins(List<FPlugin> plugins) {
        this.plugins = plugins;
    }

    public FConsumer withPlugins(List<FPlugin> plugins) {
        this.plugins = plugins;
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

    public FConsumer withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public FConsumer withUsername(String username) {
        this.username = username;
        return this;
    }

}
