package com.kolmakova.tattoosalon.response.entity;

import com.kolmakova.tattoosalon.response.dto.impl.ResourceDTO;

public class ResourceContentResponse {
    private ResourceDTO resource;

    public ResourceDTO getResource() {
        return resource;
    }

    public void setResource(ResourceDTO resource) {
        this.resource = resource;
    }
}
