package com.kolmakova.tattoosalon.entity.impl;

import com.kolmakova.tattoosalon.entity.Entity;

public class DynamicContent implements Entity {
    private Integer id;
    private String elementType;
    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
