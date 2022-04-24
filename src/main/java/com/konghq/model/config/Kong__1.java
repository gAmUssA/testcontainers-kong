
package com.konghq.model.config;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "service"
})
@Generated("jsonschema2pojo")
public class Kong__1 {

    @JsonProperty("service")
    private FService service;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Kong__1() {
    }

    /**
     * 
     * @param service
     */
    public Kong__1(FService service) {
        super();
        this.service = service;
    }

    @JsonProperty("service")
    public FService getService() {
        return service;
    }

    @JsonProperty("service")
    public void setService(FService service) {
        this.service = service;
    }

    public Kong__1 withService(FService service) {
        this.service = service;
        return this;
    }

}
