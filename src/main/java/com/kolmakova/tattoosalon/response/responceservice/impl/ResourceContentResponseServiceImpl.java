package com.kolmakova.tattoosalon.response.responceservice.impl;

import com.kolmakova.tattoosalon.entity.impl.Resource;
import com.kolmakova.tattoosalon.response.dto.impl.ResourceDTO;
import com.kolmakova.tattoosalon.response.entity.ResourceContentResponse;
import com.kolmakova.tattoosalon.response.responceservice.ResourceContentResponseService;
import com.kolmakova.tattoosalon.service.ResourceContentService;
import com.kolmakova.tattoosalon.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ResourceContentResponseServiceImpl implements ResourceContentResponseService {

    @Autowired
    private ResourceContentService resourceService;

    @Autowired
    private Converter<Resource, ResourceDTO> resourceConverter;

    @Override
    public ResourceContentResponse getResourceContentResponse(String id) {
        ResourceContentResponse resourceContentResponse = new ResourceContentResponse();
        Resource resource = resourceService.getResource(id);
        ResourceDTO resourceDTO = resourceConverter.convertToDTO(resource);
        resourceContentResponse.setResource(resourceDTO);

        return resourceContentResponse;
    }
}
