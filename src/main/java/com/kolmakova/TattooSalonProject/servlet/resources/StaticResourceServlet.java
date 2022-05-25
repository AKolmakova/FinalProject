package com.kolmakova.TattooSalonProject.servlet.resources;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(urlPatterns = {"/css/*", "/img/*", "/js/*"})
public class StaticResourceServlet extends HttpServlet {
    private static final String RESOURCE_PATH_TEMPLATE = "/resources/{folder}/{fileName}";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] pathParts = req.getRequestURI()
                .replace(req.getContextPath(),"")
                .split("/");

        String fileName = RESOURCE_PATH_TEMPLATE
                .replace("{folder}", pathParts[1])
                .replace("{fileName}", pathParts[2]);

        ServletContext context = req.getServletContext();
        try (InputStream is = context.getResourceAsStream(fileName)) {
            resp.getOutputStream().write(IOUtils.toByteArray(is));
        }
    }
}
