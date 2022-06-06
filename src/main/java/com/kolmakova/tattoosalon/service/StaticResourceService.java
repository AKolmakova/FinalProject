package com.kolmakova.tattoosalon.service;

import javax.servlet.ServletContext;

public interface StaticResourceService {
    byte[] getStaticResource(ServletContext context, String folderName, String fileName);
}
