package com.sony.app.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel
public class Product {

    @ApiModelProperty(notes = "name of the user")
    private String id;
    @ApiModelProperty(allowableValues = "fernando, gordillo, banned")
    private String name;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}