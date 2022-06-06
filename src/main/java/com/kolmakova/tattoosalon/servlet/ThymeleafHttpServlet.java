package com.kolmakova.tattoosalon.servlet;

import com.kolmakova.tattoosalon.servlet.request.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class ThymeleafHttpServlet extends SpringHttpServlet {

    @Autowired
    private TemplateEngine engine;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        WebContext webContext = new WebContext(req, resp, req.getServletContext());
        RequestContext ctx = new RequestContext();
        String view = get(req, resp, ctx);

        webContext.setVariables(ctx.getVariables());
        engine.process(view, webContext, resp.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        WebContext webContext = new WebContext(req, resp, req.getServletContext());
        RequestContext ctx = new RequestContext();
        String view = post(req, resp, ctx);

        webContext.setVariables(ctx.getVariables());
        engine.process(view, webContext, resp.getWriter());
    }

    protected abstract String get(HttpServletRequest req, HttpServletResponse resp, RequestContext ctx) throws IOException;

    protected abstract String post(HttpServletRequest req, HttpServletResponse resp, RequestContext ctx);
}
