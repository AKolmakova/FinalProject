package com.kolmakova.tattoosalon.servlet;

import com.kolmakova.tattoosalon.servlet.request.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/catalog")
@Component
public class CatalogServlet extends ThymeleafHttpServlet {
    @Override
    protected String get(HttpServletRequest req, HttpServletResponse resp, RequestContext ctx) throws IOException {
        return "catalog";
    }

    @Override
    protected String post(HttpServletRequest req, HttpServletResponse resp, RequestContext ctx) {
        return null;
    }
}
