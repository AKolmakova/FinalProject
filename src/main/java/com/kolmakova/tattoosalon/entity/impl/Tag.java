package com.kolmakova.tattoosalon.entity.impl;

import com.kolmakova.tattoosalon.entity.Entity;

public class Tag implements Entity {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
