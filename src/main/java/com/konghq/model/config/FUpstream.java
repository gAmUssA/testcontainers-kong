
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "algorithm",
    "client_certificate",
    "created_at",
    "hash_fallback",
    "hash_fallback_header",
    "hash_on",
    "hash_on_cookie",
    "hash_on_cookie_path",
    "hash_on_header",
    "healthchecks",
    "host_header",
    "id",
    "name",
    "slots",
    "tags",
    "targets"
})
@Generated("jsonschema2pojo")
public class FUpstream {

    @JsonProperty("algorithm")
    private String algorithm;
    @JsonProperty("client_certificate")
    private Certificate__7 clientCertificate;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("hash_fallback")
    private String hashFallback;
    @JsonProperty("hash_fallback_header")
    private String hashFallbackHeader;
    @JsonProperty("hash_on")
    private String hashOn;
    @JsonProperty("hash_on_cookie")
    private String hashOnCookie;
    @JsonProperty("hash_on_cookie_path")
    private String hashOnCookiePath;
    @JsonProperty("hash_on_header")
    private String hashOnHeader;
    @JsonProperty("healthchecks")
    private Healthcheck__2 healthchecks;
    @JsonProperty("host_header")
    private String hostHeader;
    @JsonProperty("id")
    private String id;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    @JsonProperty("slots")
    private Integer slots;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("targets")
    private List<FTarget> targets = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public FUpstream() {
    }

    /**
     * 
     * @param hostHeader
     * @param clientCertificate
     * @param healthchecks
     * @param hashFallback
     * @param hashOn
     * @param hashOnCookiePath
     * @param hashFallbackHeader
     * @param targets
     * @param tags
     * @param createdAt
     * @param slots
     * @param name
     * @param hashOnHeader
     * @param id
     * @param hashOnCookie
     * @param algorithm
     */
    public FUpstream(String algorithm, Certificate__7 clientCertificate, Integer createdAt, String hashFallback, String hashFallbackHeader, String hashOn, String hashOnCookie, String hashOnCookiePath, String hashOnHeader, Healthcheck__2 healthchecks, String hostHeader, String id, String name, Integer slots, List<String> tags, List<FTarget> targets) {
        super();
        this.algorithm = algorithm;
        this.clientCertificate = clientCertificate;
        this.createdAt = createdAt;
        this.hashFallback = hashFallback;
        this.hashFallbackHeader = hashFallbackHeader;
        this.hashOn = hashOn;
        this.hashOnCookie = hashOnCookie;
        this.hashOnCookiePath = hashOnCookiePath;
        this.hashOnHeader = hashOnHeader;
        this.healthchecks = healthchecks;
        this.hostHeader = hostHeader;
        this.id = id;
        this.name = name;
        this.slots = slots;
        this.tags = tags;
        this.targets = targets;
    }

    @JsonProperty("algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    @JsonProperty("algorithm")
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public FUpstream withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    @JsonProperty("client_certificate")
    public Certificate__7 getClientCertificate() {
        return clientCertificate;
    }

    @JsonProperty("client_certificate")
    public void setClientCertificate(Certificate__7 clientCertificate) {
        this.clientCertificate = clientCertificate;
    }

    public FUpstream withClientCertificate(Certificate__7 clientCertificate) {
        this.clientCertificate = clientCertificate;
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

    public FUpstream withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("hash_fallback")
    public String getHashFallback() {
        return hashFallback;
    }

    @JsonProperty("hash_fallback")
    public void setHashFallback(String hashFallback) {
        this.hashFallback = hashFallback;
    }

    public FUpstream withHashFallback(String hashFallback) {
        this.hashFallback = hashFallback;
        return this;
    }

    @JsonProperty("hash_fallback_header")
    public String getHashFallbackHeader() {
        return hashFallbackHeader;
    }

    @JsonProperty("hash_fallback_header")
    public void setHashFallbackHeader(String hashFallbackHeader) {
        this.hashFallbackHeader = hashFallbackHeader;
    }

    public FUpstream withHashFallbackHeader(String hashFallbackHeader) {
        this.hashFallbackHeader = hashFallbackHeader;
        return this;
    }

    @JsonProperty("hash_on")
    public String getHashOn() {
        return hashOn;
    }

    @JsonProperty("hash_on")
    public void setHashOn(String hashOn) {
        this.hashOn = hashOn;
    }

    public FUpstream withHashOn(String hashOn) {
        this.hashOn = hashOn;
        return this;
    }

    @JsonProperty("hash_on_cookie")
    public String getHashOnCookie() {
        return hashOnCookie;
    }

    @JsonProperty("hash_on_cookie")
    public void setHashOnCookie(String hashOnCookie) {
        this.hashOnCookie = hashOnCookie;
    }

    public FUpstream withHashOnCookie(String hashOnCookie) {
        this.hashOnCookie = hashOnCookie;
        return this;
    }

    @JsonProperty("hash_on_cookie_path")
    public String getHashOnCookiePath() {
        return hashOnCookiePath;
    }

    @JsonProperty("hash_on_cookie_path")
    public void setHashOnCookiePath(String hashOnCookiePath) {
        this.hashOnCookiePath = hashOnCookiePath;
    }

    public FUpstream withHashOnCookiePath(String hashOnCookiePath) {
        this.hashOnCookiePath = hashOnCookiePath;
        return this;
    }

    @JsonProperty("hash_on_header")
    public String getHashOnHeader() {
        return hashOnHeader;
    }

    @JsonProperty("hash_on_header")
    public void setHashOnHeader(String hashOnHeader) {
        this.hashOnHeader = hashOnHeader;
    }

    public FUpstream withHashOnHeader(String hashOnHeader) {
        this.hashOnHeader = hashOnHeader;
        return this;
    }

    @JsonProperty("healthchecks")
    public Healthcheck__2 getHealthchecks() {
        return healthchecks;
    }

    @JsonProperty("healthchecks")
    public void setHealthchecks(Healthcheck__2 healthchecks) {
        this.healthchecks = healthchecks;
    }

    public FUpstream withHealthchecks(Healthcheck__2 healthchecks) {
        this.healthchecks = healthchecks;
        return this;
    }

    @JsonProperty("host_header")
    public String getHostHeader() {
        return hostHeader;
    }

    @JsonProperty("host_header")
    public void setHostHeader(String hostHeader) {
        this.hostHeader = hostHeader;
    }

    public FUpstream withHostHeader(String hostHeader) {
        this.hostHeader = hostHeader;
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

    public FUpstream withId(String id) {
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

    public FUpstream withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("slots")
    public Integer getSlots() {
        return slots;
    }

    @JsonProperty("slots")
    public void setSlots(Integer slots) {
        this.slots = slots;
    }

    public FUpstream withSlots(Integer slots) {
        this.slots = slots;
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

    public FUpstream withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("targets")
    public List<FTarget> getTargets() {
        return targets;
    }

    @JsonProperty("targets")
    public void setTargets(List<FTarget> targets) {
        this.targets = targets;
    }

    public FUpstream withTargets(List<FTarget> targets) {
        this.targets = targets;
        return this;
    }

}
