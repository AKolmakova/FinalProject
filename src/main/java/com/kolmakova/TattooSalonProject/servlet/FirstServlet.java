package com.kolmakova.TattooSalonProject.servlet;

import com.kolmakova.TattooSalonProject.dao.AbstractDAO;
import com.kolmakova.TattooSalonProject.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.context.WebContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class FirstServlet extends ThymeleafHttpServlet {
    @Autowired
    private AbstractDAO<Customer> abstractDAO;

    @Override
    protected String get(HttpServletRequest req, HttpServletResponse resp, WebContext context) {
        context.setVariable("recipient", "Friend");

        return "index";
    }

    @Override
    protected String post(HttpServletRequest req, HttpServletResponse resp, WebContext context) {
        return "some.html";
    }

}
