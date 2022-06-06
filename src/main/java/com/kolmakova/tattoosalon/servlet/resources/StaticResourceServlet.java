package com.kolmakova.tattoosalon.servlet.resources;

import com.kolmakova.tattoosalon.service.StaticResourceService;
import com.kolmakova.tattoosalon.servlet.SpringHttpServlet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/css/*", "/img/*", "/js/*"})
@Component
public class StaticResourceServlet extends SpringHttpServlet {
    private static final Logger LOGGER = LogManager.getLogger(StaticResourceServlet.class);

    @Autowired
    private StaticResourceService resourceService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String[] pathParts = req.getRequestURI()
                .replace(req.getContextPath(), "")
                .split("/");
        ServletContext context = req.getServletContext();

        if (partsAreNull(pathParts)) {
            LOGGER.warn("Data is not valid");
        } else {
            byte[] resourceContent = resourceService.getStaticResource(context, pathParts[2], pathParts[1]);
            try {
                resp.getOutputStream().write(resourceContent);
            } catch (IOException e) {
                LOGGER.warn("Can not get resource", e);
            }
        }
    }

    public boolean partsAreNull(String[] pathParts) {
        return pathParts.length - 1 < 2;
    }
}
