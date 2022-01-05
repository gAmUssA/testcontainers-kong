
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "created_at",
    "destinations",
    "headers",
    "hosts",
    "https_redirect_status_code",
    "id",
    "methods",
    "name",
    "path_handling",
    "paths",
    "preserve_host",
    "protocols",
    "regex_priority",
    "request_buffering",
    "response_buffering",
    "service",
    "snis",
    "sources",
    "strip_path",
    "tags",
    "updated_at"
})
@Generated("jsonschema2pojo")
public class Route {

    @JsonProperty("created_at")
    private Integer createdAt;
    @JsonProperty("destinations")
    private List<CIDRPort> destinations = null;
    @JsonProperty("headers")
    private Headers headers;
    @JsonProperty("hosts")
    private List<String> hosts = null;
    @JsonProperty("https_redirect_status_code")
    private Integer httpsRedirectStatusCode;
    @JsonProperty("id")
    private String id;
    @JsonProperty("methods")
    private List<String> methods = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("path_handling")
    private String pathHandling;
    @JsonProperty("paths")
    private List<String> paths = null;
    @JsonProperty("preserve_host")
    private Boolean preserveHost;
    @JsonProperty("protocols")
    private List<String> protocols = null;
    @JsonProperty("regex_priority")
    private Integer regexPriority;
    @JsonProperty("request_buffering")
    private Boolean requestBuffering;
    @JsonProperty("response_buffering")
    private Boolean responseBuffering;
    @JsonProperty("service")
    private Service service;
    @JsonProperty("snis")
    private List<String> snis = null;
    @JsonProperty("sources")
    private List<CIDRPort__1> sources = null;
    @JsonProperty("strip_path")
    private Boolean stripPath;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("updated_at")
    private Integer updatedAt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Route() {
    }

    /**
     * 
     * @param responseBuffering
     * @param headers
     * @param pathHandling
     * @param sources
     * @param hosts
     * @param methods
     * @param preserveHost
     * @param destinations
     * @param regexPriority
     * @param tags
     * @param snis
     * @param createdAt
     * @param stripPath
     * @param paths
     * @param service
     * @param requestBuffering
     * @param name
     * @param id
     * @param protocols
     * @param httpsRedirectStatusCode
     * @param updatedAt
     */
    public Route(Integer createdAt, List<CIDRPort> destinations, Headers headers, List<String> hosts, Integer httpsRedirectStatusCode, String id, List<String> methods, String name, String pathHandling, List<String> paths, Boolean preserveHost, List<String> protocols, Integer regexPriority, Boolean requestBuffering, Boolean responseBuffering, Service service, List<String> snis, List<CIDRPort__1> sources, Boolean stripPath, List<String> tags, Integer updatedAt) {
        super();
        this.createdAt = createdAt;
        this.destinations = destinations;
        this.headers = headers;
        this.hosts = hosts;
        this.httpsRedirectStatusCode = httpsRedirectStatusCode;
        this.id = id;
        this.methods = methods;
        this.name = name;
        this.pathHandling = pathHandling;
        this.paths = paths;
        this.preserveHost = preserveHost;
        this.protocols = protocols;
        this.regexPriority = regexPriority;
        this.requestBuffering = requestBuffering;
        this.responseBuffering = responseBuffering;
        this.service = service;
        this.snis = snis;
        this.sources = sources;
        this.stripPath = stripPath;
        this.tags = tags;
        this.updatedAt = updatedAt;
    }

    @JsonProperty("created_at")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Route withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("destinations")
    public List<CIDRPort> getDestinations() {
        return destinations;
    }

    @JsonProperty("destinations")
    public void setDestinations(List<CIDRPort> destinations) {
        this.destinations = destinations;
    }

    public Route withDestinations(List<CIDRPort> destinations) {
        this.destinations = destinations;
        return this;
    }

    @JsonProperty("headers")
    public Headers getHeaders() {
        return headers;
    }

    @JsonProperty("headers")
    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    public Route withHeaders(Headers headers) {
        this.headers = headers;
        return this;
    }

    @JsonProperty("hosts")
    public List<String> getHosts() {
        return hosts;
    }

    @JsonProperty("hosts")
    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public Route withHosts(List<String> hosts) {
        this.hosts = hosts;
        return this;
    }

    @JsonProperty("https_redirect_status_code")
    public Integer getHttpsRedirectStatusCode() {
        return httpsRedirectStatusCode;
    }

    @JsonProperty("https_redirect_status_code")
    public void setHttpsRedirectStatusCode(Integer httpsRedirectStatusCode) {
        this.httpsRedirectStatusCode = httpsRedirectStatusCode;
    }

    public Route withHttpsRedirectStatusCode(Integer httpsRedirectStatusCode) {
        this.httpsRedirectStatusCode = httpsRedirectStatusCode;
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

    public Route withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("methods")
    public List<String> getMethods() {
        return methods;
    }

    @JsonProperty("methods")
    public void setMethods(List<String> methods) {
        this.methods = methods;
    }

    public Route withMethods(List<String> methods) {
        this.methods = methods;
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

    public Route withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("path_handling")
    public String getPathHandling() {
        return pathHandling;
    }

    @JsonProperty("path_handling")
    public void setPathHandling(String pathHandling) {
        this.pathHandling = pathHandling;
    }

    public Route withPathHandling(String pathHandling) {
        this.pathHandling = pathHandling;
        return this;
    }

    @JsonProperty("paths")
    public List<String> getPaths() {
        return paths;
    }

    @JsonProperty("paths")
    public void setPaths(List<String> paths) {
        this.paths = paths;
    }

    public Route withPaths(List<String> paths) {
        this.paths = paths;
        return this;
    }

    @JsonProperty("preserve_host")
    public Boolean getPreserveHost() {
        return preserveHost;
    }

    @JsonProperty("preserve_host")
    public void setPreserveHost(Boolean preserveHost) {
        this.preserveHost = preserveHost;
    }

    public Route withPreserveHost(Boolean preserveHost) {
        this.preserveHost = preserveHost;
        return this;
    }

    @JsonProperty("protocols")
    public List<String> getProtocols() {
        return protocols;
    }

    @JsonProperty("protocols")
    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }

    public Route withProtocols(List<String> protocols) {
        this.protocols = protocols;
        return this;
    }

    @JsonProperty("regex_priority")
    public Integer getRegexPriority() {
        return regexPriority;
    }

    @JsonProperty("regex_priority")
    public void setRegexPriority(Integer regexPriority) {
        this.regexPriority = regexPriority;
    }

    public Route withRegexPriority(Integer regexPriority) {
        this.regexPriority = regexPriority;
        return this;
    }

    @JsonProperty("request_buffering")
    public Boolean getRequestBuffering() {
        return requestBuffering;
    }

    @JsonProperty("request_buffering")
    public void setRequestBuffering(Boolean requestBuffering) {
        this.requestBuffering = requestBuffering;
    }

    public Route withRequestBuffering(Boolean requestBuffering) {
        this.requestBuffering = requestBuffering;
        return this;
    }

    @JsonProperty("response_buffering")
    public Boolean getResponseBuffering() {
        return responseBuffering;
    }

    @JsonProperty("response_buffering")
    public void setResponseBuffering(Boolean responseBuffering) {
        this.responseBuffering = responseBuffering;
    }

    public Route withResponseBuffering(Boolean responseBuffering) {
        this.responseBuffering = responseBuffering;
        return this;
    }

    @JsonProperty("service")
    public Service getService() {
        return service;
    }

    @JsonProperty("service")
    public void setService(Service service) {
        this.service = service;
    }

    public Route withService(Service service) {
        this.service = service;
        return this;
    }

    @JsonProperty("snis")
    public List<String> getSnis() {
        return snis;
    }

    @JsonProperty("snis")
    public void setSnis(List<String> snis) {
        this.snis = snis;
    }

    public Route withSnis(List<String> snis) {
        this.snis = snis;
        return this;
    }

    @JsonProperty("sources")
    public List<CIDRPort__1> getSources() {
        return sources;
    }

    @JsonProperty("sources")
    public void setSources(List<CIDRPort__1> sources) {
        this.sources = sources;
    }

    public Route withSources(List<CIDRPort__1> sources) {
        this.sources = sources;
        return this;
    }

    @JsonProperty("strip_path")
    public Boolean getStripPath() {
        return stripPath;
    }

    @JsonProperty("strip_path")
    public void setStripPath(Boolean stripPath) {
        this.stripPath = stripPath;
    }

    public Route withStripPath(Boolean stripPath) {
        this.stripPath = stripPath;
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

    public Route withTags(List<String> tags) {
        this.tags = tags;
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

    public Route withUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

}
