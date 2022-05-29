package com.kolmakova.TattooSalonProject.response.entity;

import com.kolmakova.TattooSalonProject.response.DTO.DynamicContentDTO;

import java.util.List;

public class DynamicContentResponse {

    private List<DynamicContentDTO> dynamicContentDTOList;

    public List<DynamicContentDTO> getDynamicContentDTOList() {
        return dynamicContentDTOList;
    }

    public void setDynamicContentDTOList(List<DynamicContentDTO> dynamicContentDTOList) {
        this.dynamicContentDTOList = dynamicContentDTOList;
    }
}
