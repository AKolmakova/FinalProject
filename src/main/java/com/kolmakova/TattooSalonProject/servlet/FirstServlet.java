package com.kolmakova.TattooSalonProject.servlet;

import com.kolmakova.TattooSalonProject.dao.AbstractDAO;
import com.kolmakova.TattooSalonProject.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.context.WebContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet(urlPatterns = "/test")
public class FirstServlet extends ThymeleafHttpServlet {
    @Autowired
    private AbstractDAO<Customer> abstractDAO;

    @Override
    protected String get(HttpServletRequest req, HttpServletResponse resp, WebContext context) {
        List<Customer> customers = abstractDAO.findAll();
        context.setVariable("customers", customers);
        return "test";
    }

    @Override
    protected String post(HttpServletRequest req, HttpServletResponse resp, WebContext context) {
        String name = req.getParameter("customerName");
        return "some.html";
    }

}
