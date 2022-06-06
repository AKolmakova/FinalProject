package com.kolmakova.tattoosalon.servlet;

import com.kolmakova.tattoosalon.response.responceservice.DCResponseService;
import com.kolmakova.tattoosalon.servlet.request.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/")
public class HomeServlet extends ThymeleafHttpServlet {

    @Autowired
    private DCResponseService dcResponseService;

    @Override
    protected String get(HttpServletRequest req, HttpServletResponse resp, RequestContext ctx) throws IOException {
        ctx.variable("dcResponse", dcResponseService.getDCResponse());
        return "index";
    }

    @Override
    protected String post(HttpServletRequest req, HttpServletResponse resp, RequestContext ctx) {
        return null;
    }
}
