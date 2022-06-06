package com.kolmakova.tattoosalon.util.impl;

import com.kolmakova.tattoosalon.entity.impl.DynamicContent;
import com.kolmakova.tattoosalon.response.dto.impl.DynamicContentDTO;
import com.kolmakova.tattoosalon.util.Converter;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DynamicContentConverterImpl implements Converter<DynamicContent, DynamicContentDTO> {

    @Override
    public DynamicContentDTO convertToDTO(DynamicContent component) {
        DynamicContentDTO dynamicContentDTO = new DynamicContentDTO();
        BeanUtils.copyProperties(component, dynamicContentDTO);

        return dynamicContentDTO;
    }

    @Override
    public List<DynamicContentDTO> convertToDTOList(List<DynamicContent> list) {
        List<DynamicContentDTO> dynamicContentDTOList = new ArrayList<>();

        for (DynamicContent dynamicContent : list) {
            dynamicContentDTOList.add(convertToDTO(dynamicContent));
        }

        return dynamicContentDTOList;
    }

}
