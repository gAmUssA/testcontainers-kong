
package com.konghq.model.config;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "defaults",
    "select_tags"
})
@Generated("jsonschema2pojo")
public class Info {

    @JsonProperty("defaults")
    private KongDefaults defaults;
    @JsonProperty("select_tags")
    private List<String> selectTags = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Info() {
    }

    /**
     * 
     * @param defaults
     * @param selectTags
     */
    public Info(KongDefaults defaults, List<String> selectTags) {
        super();
        this.defaults = defaults;
        this.selectTags = selectTags;
    }

    @JsonProperty("defaults")
    public KongDefaults getDefaults() {
        return defaults;
    }

    @JsonProperty("defaults")
    public void setDefaults(KongDefaults defaults) {
        this.defaults = defaults;
    }

    public Info withDefaults(KongDefaults defaults) {
        this.defaults = defaults;
        return this;
    }

    @JsonProperty("select_tags")
    public List<String> getSelectTags() {
        return selectTags;
    }

    @JsonProperty("select_tags")
    public void setSelectTags(List<String> selectTags) {
        this.selectTags = selectTags;
    }

    public Info withSelectTags(List<String> selectTags) {
        this.selectTags = selectTags;
        return this;
    }

}
