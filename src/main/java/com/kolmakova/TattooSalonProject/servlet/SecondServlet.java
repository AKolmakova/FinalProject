package com.kolmakova.TattooSalonProject.servlet;

import org.thymeleaf.context.WebContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/")
public class SecondServlet extends ThymeleafHttpServlet {

    @Override
    protected String get(HttpServletRequest req, HttpServletResponse resp, WebContext context) throws IOException {
        return "index";
    }

    @Override
    protected String post(HttpServletRequest req, HttpServletResponse resp, WebContext context) {
        return null;
    }
}
