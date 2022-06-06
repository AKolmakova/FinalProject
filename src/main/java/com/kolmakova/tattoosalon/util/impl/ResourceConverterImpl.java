package com.kolmakova.tattoosalon.util.impl;

import com.kolmakova.tattoosalon.entity.impl.Resource;
import com.kolmakova.tattoosalon.response.dto.impl.ResourceDTO;
import com.kolmakova.tattoosalon.util.Converter;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResourceConverterImpl implements Converter<Resource, ResourceDTO> {

    @Override
    public ResourceDTO convertToDTO(Resource component) {
        ResourceDTO resourceDTO = new ResourceDTO();
        BeanUtils.copyProperties(component, resourceDTO);

        return resourceDTO;
    }

    @Override
    public List<ResourceDTO> convertToDTOList(List<Resource> list) {
        List<ResourceDTO> resourceDTOList = new ArrayList<>();

        for (Resource resource : list) {
            resourceDTOList.add(convertToDTO(resource));
        }

        return resourceDTOList;
    }

}
