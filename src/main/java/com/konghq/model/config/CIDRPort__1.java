
package com.konghq.model.config;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ip",
    "port"
})
@Generated("jsonschema2pojo")
public class CIDRPort__1 {

    @JsonProperty("ip")
    private String ip;
    @JsonProperty("port")
    private Integer port;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CIDRPort__1() {
    }

    /**
     * 
     * @param port
     * @param ip
     */
    public CIDRPort__1(String ip, Integer port) {
        super();
        this.ip = ip;
        this.port = port;
    }

    @JsonProperty("ip")
    public String getIp() {
        return ip;
    }

    @JsonProperty("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }

    public CIDRPort__1 withIp(String ip) {
        this.ip = ip;
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

    public CIDRPort__1 withPort(Integer port) {
        this.port = port;
        return this;
    }

}
