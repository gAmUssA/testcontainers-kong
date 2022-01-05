
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ca_certificates",
    "client_certificate",
    "connect_timeout",
    "created_at",
    "host",
    "id",
    "name",
    "path",
    "port",
    "protocol",
    "read_timeout",
    "retries",
    "tags",
    "tls_verify",
    "tls_verify_depth",
    "updated_at",
    "url",
    "write_timeout"
})
@Generated("jsonschema2pojo")
public class Service__3 {

    @JsonProperty("ca_certificates")
    private List<String> caCertificates = null;
    @JsonProperty("client_certificate")
    private Certificate__5 clientCertificate;
    @JsonProperty("connect_timeout")
    private Integer connectTimeout;
    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("host")
    private String host;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("path")
    private String path;
    @JsonProperty("port")
    private Integer port;
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("read_timeout")
    private Integer readTimeout;
    @JsonProperty("retries")
    private Integer retries;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("tls_verify")
    private Boolean tlsVerify;
    @JsonProperty("tls_verify_depth")
    private Integer tlsVerifyDepth;
    @JsonProperty("updated_at")
    private Integer updatedAt;
    @JsonProperty("url")
    private String url;
    @JsonProperty("write_timeout")
    private Integer writeTimeout;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Service__3() {
    }

    /**
     * 
     * @param clientCertificate
     * @param caCertificates
     * @param tlsVerify
     * @param writeTimeout
     * @param url
     * @param tags
     * @param createdAt
     * @param path
     * @param retries
     * @param protocol
     * @param port
     * @param tlsVerifyDepth
     * @param readTimeout
     * @param connectTimeout
     * @param host
     * @param name
     * @param id
     * @param updatedAt
     */
    public Service__3(List<String> caCertificates, Certificate__5 clientCertificate, Integer connectTimeout, Integer createdAt, String host, String id, String name, String path, Integer port, String protocol, Integer readTimeout, Integer retries, List<String> tags, Boolean tlsVerify, Integer tlsVerifyDepth, Integer updatedAt, String url, Integer writeTimeout) {
        super();
        this.caCertificates = caCertificates;
        this.clientCertificate = clientCertificate;
        this.connectTimeout = connectTimeout;
        this.createdAt = createdAt;
        this.host = host;
        this.id = id;
        this.name = name;
        this.path = path;
        this.port = port;
        this.protocol = protocol;
        this.readTimeout = readTimeout;
        this.retries = retries;
        this.tags = tags;
        this.tlsVerify = tlsVerify;
        this.tlsVerifyDepth = tlsVerifyDepth;
        this.updatedAt = updatedAt;
        this.url = url;
        this.writeTimeout = writeTimeout;
    }

    @JsonProperty("ca_certificates")
    public List<String> getCaCertificates() {
        return caCertificates;
    }

    @JsonProperty("ca_certificates")
    public void setCaCertificates(List<String> caCertificates) {
        this.caCertificates = caCertificates;
    }

    public Service__3 withCaCertificates(List<String> caCertificates) {
        this.caCertificates = caCertificates;
        return this;
    }

    @JsonProperty("client_certificate")
    public Certificate__5 getClientCertificate() {
        return clientCertificate;
    }

    @JsonProperty("client_certificate")
    public void setClientCertificate(Certificate__5 clientCertificate) {
        this.clientCertificate = clientCertificate;
    }

    public Service__3 withClientCertificate(Certificate__5 clientCertificate) {
        this.clientCertificate = clientCertificate;
        return this;
    }

    @JsonProperty("connect_timeout")
    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    @JsonProperty("connect_timeout")
    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Service__3 withConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
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

    public Service__3 withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    public Service__3 withHost(String host) {
        this.host = host;
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

    public Service__3 withId(String id) {
        this.id = id;
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

    public Service__3 withName(String name) {
        this.name = name;
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

    public Service__3 withPath(String path) {
        this.path = path;
        return this;
    }

    @JsonProperty("port")
    public Integer getPort() {
        return port;
    }

    @JsonProperty("port")
    public void setPort(Integer port) {
        this.port = port;
    }

    public Service__3 withPort(Integer port) {
        this.port = port;
        return this;
    }

    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }

    @JsonProperty("protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Service__3 withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    @JsonProperty("read_timeout")
    public Integer getReadTimeout() {
        return readTimeout;
    }

    @JsonProperty("read_timeout")
    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    public Service__3 withReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    @JsonProperty("retries")
    public Integer getRetries() {
        return retries;
    }

    @JsonProperty("retries")
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public Service__3 withRetries(Integer retries) {
        this.retries = retries;
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

    public Service__3 withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("tls_verify")
    public Boolean getTlsVerify() {
        return tlsVerify;
    }

    @JsonProperty("tls_verify")
    public void setTlsVerify(Boolean tlsVerify) {
        this.tlsVerify = tlsVerify;
    }

    public Service__3 withTlsVerify(Boolean tlsVerify) {
        this.tlsVerify = tlsVerify;
        return this;
    }

    @JsonProperty("tls_verify_depth")
    public Integer getTlsVerifyDepth() {
        return tlsVerifyDepth;
    }

    @JsonProperty("tls_verify_depth")
    public void setTlsVerifyDepth(Integer tlsVerifyDepth) {
        this.tlsVerifyDepth = tlsVerifyDepth;
    }

    public Service__3 withTlsVerifyDepth(Integer tlsVerifyDepth) {
        this.tlsVerifyDepth = tlsVerifyDepth;
        return this;
    }

    @JsonProperty("updated_at")
    public Integer getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Service__3 withUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Service__3 withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("write_timeout")
    public Integer getWriteTimeout() {
        return writeTimeout;
    }

    @JsonProperty("write_timeout")
    public void setWriteTimeout(Integer writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    public Service__3 withWriteTimeout(Integer writeTimeout) {
        this.writeTimeout = writeTimeout;
        return this;
    }

}
