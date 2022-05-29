package com.kolmakova.TattooSalonProject.servlet;

import com.kolmakova.TattooSalonProject.response.service.DynamicContentService;
import com.kolmakova.TattooSalonProject.servlet.request.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/")
public class HomeServlet extends ThymeleafHttpServlet {

    @Autowired
    private DynamicContentService dynamicContentService;

    @Override
    protected String get(HttpServletRequest req, HttpServletResponse resp, RequestContext ctx) throws IOException {
        ctx.variable("banner", dynamicContentService.getBannerContent());
        return "index";
    }

    @Override
    protected String post(HttpServletRequest req, HttpServletResponse resp, RequestContext ctx) {
        return null;
    }
}
