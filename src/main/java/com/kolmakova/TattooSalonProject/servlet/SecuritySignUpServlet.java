package com.kolmakova.TattooSalonProject.servlet;

import org.thymeleaf.context.WebContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/signUp")
public class SecuritySignUpServlet extends ThymeleafHttpServlet {
    @Override
    protected String get(HttpServletRequest req, HttpServletResponse resp, WebContext context) throws IOException {
        context.setVariable("signUp",true);
        return "security";
    }

    @Override
    protected String post(HttpServletRequest req, HttpServletResponse resp, WebContext context) {
        return null;
    }
}