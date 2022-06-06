package com.kolmakova.tattoosalon.servlet;

import com.kolmakova.tattoosalon.servlet.request.RequestContext;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/signIn")
public class SecuritySignInServlet extends ThymeleafHttpServlet {
    @Override
    protected String get(HttpServletRequest req, HttpServletResponse resp, RequestContext ctx) throws IOException {
        ctx.variable("signIn", true);
        return "security";
    }

    @Override
    protected String post(HttpServletRequest req, HttpServletResponse resp, RequestContext ctx) {
        return null;
    }
}
