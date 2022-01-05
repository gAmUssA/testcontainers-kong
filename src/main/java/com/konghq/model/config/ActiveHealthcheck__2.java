
package com.konghq.model.config;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "concurrency",
    "healthy",
    "http_path",
    "https_sni",
    "https_verify_certificate",
    "timeout",
    "type",
    "unhealthy"
})
@Generated("jsonschema2pojo")
public class ActiveHealthcheck__2 {

    @JsonProperty("concurrency")
    private Integer concurrency;
    @JsonProperty("healthy")
    private Healthy__4 healthy;
    @JsonProperty("http_path")
    private String httpPath;
    @JsonProperty("https_sni")
    private String httpsSni;
    @JsonProperty("https_verify_certificate")
    private Boolean httpsVerifyCertificate;
    @JsonProperty("timeout")
    private Integer timeout;
    @JsonProperty("type")
    private String type;
    @JsonProperty("unhealthy")
    private Unhealthy__4 unhealthy;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ActiveHealthcheck__2() {
    }

    /**
     * 
     * @param httpPath
     * @param healthy
     * @param unhealthy
     * @param httpsVerifyCertificate
     * @param httpsSni
     * @param type
     * @param timeout
     * @param concurrency
     */
    public ActiveHealthcheck__2(Integer concurrency, Healthy__4 healthy, String httpPath, String httpsSni, Boolean httpsVerifyCertificate, Integer timeout, String type, Unhealthy__4 unhealthy) {
        super();
        this.concurrency = concurrency;
        this.healthy = healthy;
        this.httpPath = httpPath;
        this.httpsSni = httpsSni;
        this.httpsVerifyCertificate = httpsVerifyCertificate;
        this.timeout = timeout;
        this.type = type;
        this.unhealthy = unhealthy;
    }

    @JsonProperty("concurrency")
    public Integer getConcurrency() {
        return concurrency;
    }

    @JsonProperty("concurrency")
    public void setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
    }

    public ActiveHealthcheck__2 withConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }

    @JsonProperty("healthy")
    public Healthy__4 getHealthy() {
        return healthy;
    }

    @JsonProperty("healthy")
    public void setHealthy(Healthy__4 healthy) {
        this.healthy = healthy;
    }

    public ActiveHealthcheck__2 withHealthy(Healthy__4 healthy) {
        this.healthy = healthy;
        return this;
    }

    @JsonProperty("http_path")
    public String getHttpPath() {
        return httpPath;
    }

    @JsonProperty("http_path")
    public void setHttpPath(String httpPath) {
        this.httpPath = httpPath;
    }

    public ActiveHealthcheck__2 withHttpPath(String httpPath) {
        this.httpPath = httpPath;
        return this;
    }

    @JsonProperty("https_sni")
    public String getHttpsSni() {
        return httpsSni;
    }

    @JsonProperty("https_sni")
    public void setHttpsSni(String httpsSni) {
        this.httpsSni = httpsSni;
    }

    public ActiveHealthcheck__2 withHttpsSni(String httpsSni) {
        this.httpsSni = httpsSni;
        return this;
    }

    @JsonProperty("https_verify_certificate")
    public Boolean getHttpsVerifyCertificate() {
        return httpsVerifyCertificate;
    }

    @JsonProperty("https_verify_certificate")
    public void setHttpsVerifyCertificate(Boolean httpsVerifyCertificate) {
        this.httpsVerifyCertificate = httpsVerifyCertificate;
    }

    public ActiveHealthcheck__2 withHttpsVerifyCertificate(Boolean httpsVerifyCertificate) {
        this.httpsVerifyCertificate = httpsVerifyCertificate;
        return this;
    }

    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ActiveHealthcheck__2 withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public ActiveHealthcheck__2 withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("unhealthy")
    public Unhealthy__4 getUnhealthy() {
        return unhealthy;
    }

    @JsonProperty("unhealthy")
    public void setUnhealthy(Unhealthy__4 unhealthy) {
        this.unhealthy = unhealthy;
    }

    public ActiveHealthcheck__2 withUnhealthy(Unhealthy__4 unhealthy) {
        this.unhealthy = unhealthy;
        return this;
    }

}
