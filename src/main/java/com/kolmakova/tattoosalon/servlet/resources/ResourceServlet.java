package com.kolmakova.tattoosalon.servlet.resources;

import com.kolmakova.tattoosalon.response.responceservice.ResourceContentResponseService;
import com.kolmakova.tattoosalon.servlet.SpringHttpServlet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/resource/*")
public class ResourceServlet extends SpringHttpServlet {
    private static final Logger LOGGER = LogManager.getLogger(ResourceServlet.class);

    @Autowired
    private ResourceContentResponseService resourceContentResponseService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

        String[] pathParts = req.getRequestURI()
                .replace(req.getContextPath(), "")
                .split("/");

        if (partsAreNull(pathParts)) {
            LOGGER.warn("Data is not valid");
        } else {
            byte[] resourceContent = resourceContentResponseService.getResourceContentResponse(pathParts[2]).getResource().getContent();

            try {
                resp.getOutputStream().write(resourceContent);
            } catch (IOException e) {
                LOGGER.warn("Can not get resource", e);
            }
        }
    }

    private boolean partsAreNull(String[] pathParts) {
        return pathParts.length - 1 < 2;
    }

}
