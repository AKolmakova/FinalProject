package com.kolmakova.TattooSalonProject.service;

import com.kolmakova.TattooSalonProject.entity.Resource;
import java.io.IOException;
import java.io.InputStream;

public interface ResourceHandler {
    Resource get(String url) throws IOException;

    void delete(String url);

    Resource save(InputStream content, String fileName);

}
