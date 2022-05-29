package com.kolmakova.TattooSalonProject.servlet;

import com.kolmakova.TattooSalonProject.dao.AbstractDAO;
import com.kolmakova.TattooSalonProject.entity.Customer;
import com.kolmakova.TattooSalonProject.entity.Resource;
import com.kolmakova.TattooSalonProject.service.ResourceHandler;
import com.kolmakova.TattooSalonProject.servlet.request.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
    protected String get(HttpServletRequest req, HttpServletResponse resp, RequestContext ctx) throws IOException {

        List<Customer> customers = abstractDAO.findAll();
        List<Resource> pictures = abstractDAOPictures.findAll();

        ctx
                .variable("customers", customers)
                .variable("pictures", pictures);

        return "test";
    }

    @Override
    protected String post(HttpServletRequest req, HttpServletResponse resp, RequestContext ctx) {
        String name = req.getParameter("customerName");
        return "some.html";
    }

}
