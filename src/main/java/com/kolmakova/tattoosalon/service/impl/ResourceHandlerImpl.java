package com.kolmakova.tattoosalon.service.impl;

import com.kolmakova.tattoosalon.entity.impl.Resource;
import com.kolmakova.tattoosalon.service.ResourceHandler;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class ResourceHandlerImpl implements ResourceHandler {
    private static final Logger LOGGER = LogManager.getLogger(ResourceHandlerImpl.class);

    @Value("${resource.storage.path}")
    private String storagePath;

    @Override
    public Resource get(String url) {
        Resource resource = new Resource();
        String filePath = getFullName(url);

        try {
            File file = new File(filePath);
            resource.setInputStream(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            LOGGER.warn(String.format("Resource with url %s not found!", filePath), e);
        }

        return resource;
    }


    @Override
    public void delete(String url) {
        String filePath = getFullName(url);
        File file = new File(filePath);
        if (file.exists()) {
            boolean result = file.delete();
            LOGGER.info("Resource with url {} deleted: {}", filePath, result);
        }
    }

    @Override
    public Resource save(InputStream content, String fileName) {
        Resource resource = new Resource();

        String filePath = getFullName(fileName);
        try {
            File fileToSave = new File(filePath);
            FileUtils.copyInputStreamToFile(content, fileToSave);
            resource.setInputStream(new FileInputStream(fileToSave));
        } catch (IOException e) {
            LOGGER.warn(String.format("Resource with url %s not saved cause of ", filePath), e);
        }

        return resource;
    }

    private String getFullName(String url) {
        return new StringBuilder(storagePath)
                .append("/")
                .append(url)
                .toString();
    }
}
