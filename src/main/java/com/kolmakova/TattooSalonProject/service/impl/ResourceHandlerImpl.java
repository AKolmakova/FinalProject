package com.kolmakova.TattooSalonProject.service.impl;

import com.kolmakova.TattooSalonProject.entity.Resource;
import com.kolmakova.TattooSalonProject.service.ResourceHandler;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class ResourceHandlerImpl implements ResourceHandler {
    private static final Logger LOG = LogManager.getLogger(ResourceHandlerImpl.class);

    @Value("${resource.storage.path}")
    private String storagePath;

    @Override
    public Resource get(String url) {
        Resource resource = new Resource();
        String filePath = getFullName(url);

        try {
            File file = new File(filePath);
            resource.setContent(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            LOG.warn(String.format("Resource with url %s not found!", filePath), e);
        }

        return resource;
    }

    @Override
    public void delete(String url) {
        String filePath = getFullName(url);
        File file = new File(filePath);
        if (file.exists()) {
            boolean result = file.delete();
            LOG.info(String.format("Resource with url %s deleted: %s", filePath, result));
        }
    }

    @Override
    public Resource save(InputStream content, String fileName) {
        Resource resource = new Resource();

        String filePath = getFullName(fileName);
        try {
            File fileToSave = new File(filePath);
            FileUtils.copyInputStreamToFile(content, fileToSave);
            resource.setContent(new FileInputStream(fileToSave));
        } catch (IOException e) {
            LOG.warn(String.format("Resource with url %s not saved cause of ", filePath), e);
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
