package com.kolmakova.tattoosalon.service.impl;

import com.kolmakova.tattoosalon.service.StaticResourceService;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.io.InputStream;

@Service
public class StaticResourceServiceImpl implements StaticResourceService {
    private static final Logger LOGGER = LogManager.getLogger();

    @Value("${resource.path.template}")
    private String resourcePathTemplate;

    @Override
    public byte[] getStaticResource(ServletContext context, String fileName, String folderName) {

        String resourceName = resourcePathTemplate
                .replace("{folder}",folderName )
                .replace("{fileName}",fileName );

        try (InputStream is = context.getResourceAsStream(resourceName)) {
            return (IOUtils.toByteArray(is));
        } catch (IOException e) {
            LOGGER.warn("Can not get resource", e);
        }

        return new byte[0];
    }
}
