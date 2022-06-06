package com.kolmakova.tattoosalon.service.impl;

import com.kolmakova.tattoosalon.dao.impl.ResourceDAO;
import com.kolmakova.tattoosalon.entity.impl.Resource;
import com.kolmakova.tattoosalon.service.ResourceContentService;
import com.kolmakova.tattoosalon.service.ResourceHandler;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;

@Service
public class ResourceContentServiceImpl implements ResourceContentService {
    private static final Logger LOGGER = LogManager.getLogger(ResourceContentServiceImpl.class);

    @Autowired
    private ResourceDAO resourceDAO;

    @Autowired
    private ResourceHandler resourceHandler;

    @Override
    public Resource getResource(String id) {
        int resId;
        try {
            resId = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            LOGGER.warn("Failed to convert type to int", e);
            return null;
        }
        Resource resource = resourceDAO.getOne(resId);
        try {
            resource = resourceHandler.get(resource.getUrl());
        } catch (IOException e) {
            LOGGER.warn("Failed to get resource by url", e);
        }
        try (InputStream is = resource.getInputStream()) {
            resource.setContent(IOUtils.toByteArray(is));
        } catch (IOException e) {
            LOGGER.warn("Can not get resource InputStream", e);
        }
        return resource;
    }
}
