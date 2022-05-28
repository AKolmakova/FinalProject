package com.kolmakova.TattooSalonProject.servlet;

import com.kolmakova.TattooSalonProject.dao.AbstractDAO;
import com.kolmakova.TattooSalonProject.entity.Customer;
import com.kolmakova.TattooSalonProject.entity.Resource;
import com.kolmakova.TattooSalonProject.service.ResourceHandler;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@WebServlet(urlPatterns = "/test")
public class FirstServlet extends ThymeleafHttpServlet {
    @Autowired
    private AbstractDAO<Customer> abstractDAO;

    @Autowired
    private AbstractDAO<Resource> abstractDAOPictures;

    @Autowired
    private ResourceHandler resourceHandler;


    @Override
    protected String get(HttpServletRequest req, HttpServletResponse resp, WebContext context) throws IOException {

        List<Customer> customers = abstractDAO.findAll();
        List<Resource> pictures=abstractDAOPictures.findAll();

        context.setVariable("customers", customers);
        context.setVariable("pictures", pictures);
        return "test";
    }

    @Override
    protected String post(HttpServletRequest req, HttpServletResponse resp, WebContext context) {
        String name = req.getParameter("customerName");
        return "some.html";
    }

}
