package com.kolmakova.TattooSalonProject.servlet.resources;

import com.kolmakova.TattooSalonProject.dao.AbstractDAO;
import com.kolmakova.TattooSalonProject.entity.Resource;
import com.kolmakova.TattooSalonProject.service.ResourceHandler;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(urlPatterns = "/resource/*")
public class ResourceServlet extends HttpServlet {

    @Autowired
    private AbstractDAO<Resource> abstractDAO;

    @Autowired
    private ResourceHandler resourceHandler;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String[] pathParts = req.getRequestURI()
                .replace(req.getContextPath(), "")
                .split("/");

        int id = Integer.parseInt(pathParts[2]);
        Resource resource = abstractDAO.getOne(id);
        Resource resource1 = resourceHandler.get(resource.getUrl());

        try (InputStream is = resource1.getInputStream()) {
            resp.getOutputStream().write(IOUtils.toByteArray(is));
        }
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                config.getServletContext());
    }
}
