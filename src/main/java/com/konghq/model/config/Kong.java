
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_format_version",
    "_info",
    "_plugin_configs",
    "_transform",
    "_workspace",
    "ca_certificates",
    "certificates",
    "consumers",
    "plugins",
    "rbac_roles",
    "routes",
    "service_packages",
    "services",
    "upstreams"
})
@Generated("jsonschema2pojo")
public class Kong {

    @JsonProperty("_format_version")
    private String formatVersion;
    @JsonProperty("_info")
    private Info info;
    @JsonProperty("_plugin_configs")
    private PluginConfigs pluginConfigs;
    @JsonProperty("_transform")
    private Boolean transform;
    @JsonProperty("_workspace")
    private String workspace;
    @JsonProperty("ca_certificates")
    private List<FCACertificate> caCertificates = null;
    @JsonProperty("certificates")
    private List<FCertificate> certificates = null;
    @JsonProperty("consumers")
    private List<FConsumer> consumers = null;
    @JsonProperty("plugins")
    private List<FPlugin__1> plugins = null;
    @JsonProperty("rbac_roles")
    private List<FRBACRole> rbacRoles = null;
    @JsonProperty("routes")
    private List<FRoute> routes = null;
    @JsonProperty("service_packages")
    private List<FServicePackage> servicePackages = null;
    @JsonProperty("services")
    private List<FService__1> services = null;
    @JsonProperty("upstreams")
    private List<FUpstream> upstreams = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Kong() {
    }

    /**
     * 
     * @param workspace
     * @param caCertificates
     * @param plugins
     * @param upstreams
     * @param services
     * @param pluginConfigs
     * @param routes
     * @param transform
     * @param certificates
     * @param servicePackages
     * @param consumers
     * @param rbacRoles
     * @param formatVersion
     * @param info
     */
    public Kong(String formatVersion, Info info, PluginConfigs pluginConfigs, Boolean transform, String workspace, List<FCACertificate> caCertificates, List<FCertificate> certificates, List<FConsumer> consumers, List<FPlugin__1> plugins, List<FRBACRole> rbacRoles, List<FRoute> routes, List<FServicePackage> servicePackages, List<FService__1> services, List<FUpstream> upstreams) {
        super();
        this.formatVersion = formatVersion;
        this.info = info;
        this.pluginConfigs = pluginConfigs;
        this.transform = transform;
        this.workspace = workspace;
        this.caCertificates = caCertificates;
        this.certificates = certificates;
        this.consumers = consumers;
        this.plugins = plugins;
        this.rbacRoles = rbacRoles;
        this.routes = routes;
        this.servicePackages = servicePackages;
        this.services = services;
        this.upstreams = upstreams;
    }

    @JsonProperty("_format_version")
    public String getFormatVersion() {
        return formatVersion;
    }

    @JsonProperty("_format_version")
    public void setFormatVersion(String formatVersion) {
        this.formatVersion = formatVersion;
    }

    public Kong withFormatVersion(String formatVersion) {
        this.formatVersion = formatVersion;
        return this;
    }

    @JsonProperty("_info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("_info")
    public void setInfo(Info info) {
        this.info = info;
    }

    public Kong withInfo(Info info) {
        this.info = info;
        return this;
    }

    @JsonProperty("_plugin_configs")
    public PluginConfigs getPluginConfigs() {
        return pluginConfigs;
    }

    @JsonProperty("_plugin_configs")
    public void setPluginConfigs(PluginConfigs pluginConfigs) {
        this.pluginConfigs = pluginConfigs;
    }

    public Kong withPluginConfigs(PluginConfigs pluginConfigs) {
        this.pluginConfigs = pluginConfigs;
        return this;
    }

    @JsonProperty("_transform")
    public Boolean getTransform() {
        return transform;
    }

    @JsonProperty("_transform")
    public void setTransform(Boolean transform) {
        this.transform = transform;
    }

    public Kong withTransform(Boolean transform) {
        this.transform = transform;
        return this;
    }

    @JsonProperty("_workspace")
    public String getWorkspace() {
        return workspace;
    }

    @JsonProperty("_workspace")
    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public Kong withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    @JsonProperty("ca_certificates")
    public List<FCACertificate> getCaCertificates() {
        return caCertificates;
    }

    @JsonProperty("ca_certificates")
    public void setCaCertificates(List<FCACertificate> caCertificates) {
        this.caCertificates = caCertificates;
    }

    public Kong withCaCertificates(List<FCACertificate> caCertificates) {
        this.caCertificates = caCertificates;
        return this;
    }

    @JsonProperty("certificates")
    public List<FCertificate> getCertificates() {
        return certificates;
    }

    @JsonProperty("certificates")
    public void setCertificates(List<FCertificate> certificates) {
        this.certificates = certificates;
    }

    public Kong withCertificates(List<FCertificate> certificates) {
        this.certificates = certificates;
        return this;
    }

    @JsonProperty("consumers")
    public List<FConsumer> getConsumers() {
        return consumers;
    }

    @JsonProperty("consumers")
    public void setConsumers(List<FConsumer> consumers) {
        this.consumers = consumers;
    }

    public Kong withConsumers(List<FConsumer> consumers) {
        this.consumers = consumers;
        return this;
    }

    @JsonProperty("plugins")
    public List<FPlugin__1> getPlugins() {
        return plugins;
    }

    @JsonProperty("plugins")
    public void setPlugins(List<FPlugin__1> plugins) {
        this.plugins = plugins;
    }

    public Kong withPlugins(List<FPlugin__1> plugins) {
        this.plugins = plugins;
        return this;
    }

    @JsonProperty("rbac_roles")
    public List<FRBACRole> getRbacRoles() {
        return rbacRoles;
    }

    @JsonProperty("rbac_roles")
    public void setRbacRoles(List<FRBACRole> rbacRoles) {
        this.rbacRoles = rbacRoles;
    }

    public Kong withRbacRoles(List<FRBACRole> rbacRoles) {
        this.rbacRoles = rbacRoles;
        return this;
    }

    @JsonProperty("routes")
    public List<FRoute> getRoutes() {
        return routes;
    }

    @JsonProperty("routes")
    public void setRoutes(List<FRoute> routes) {
        this.routes = routes;
    }

    public Kong withRoutes(List<FRoute> routes) {
        this.routes = routes;
        return this;
    }

    @JsonProperty("service_packages")
    public List<FServicePackage> getServicePackages() {
        return servicePackages;
    }

    @JsonProperty("service_packages")
    public void setServicePackages(List<FServicePackage> servicePackages) {
        this.servicePackages = servicePackages;
    }

    public Kong withServicePackages(List<FServicePackage> servicePackages) {
        this.servicePackages = servicePackages;
        return this;
    }

    @JsonProperty("services")
    public List<FService__1> getServices() {
        return services;
    }

    @JsonProperty("services")
    public void setServices(List<FService__1> services) {
        this.services = services;
    }

    public Kong withServices(List<FService__1> services) {
        this.services = services;
        return this;
    }

    @JsonProperty("upstreams")
    public List<FUpstream> getUpstreams() {
        return upstreams;
    }

    @JsonProperty("upstreams")
    public void setUpstreams(List<FUpstream> upstreams) {
        this.upstreams = upstreams;
    }

    public Kong withUpstreams(List<FUpstream> upstreams) {
        this.upstreams = upstreams;
        return this;
    }

}
