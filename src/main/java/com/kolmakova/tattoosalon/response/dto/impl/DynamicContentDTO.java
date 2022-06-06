package com.kolmakova.tattoosalon.response.dto.impl;


import com.kolmakova.tattoosalon.response.dto.EntityDTO;

public class DynamicContentDTO implements EntityDTO {

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
