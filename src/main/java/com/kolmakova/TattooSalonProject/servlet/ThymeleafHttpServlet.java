package com.kolmakova.TattooSalonProject.servlet;

import com.kolmakova.TattooSalonProject.servlet.request.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;

public abstract class ThymeleafHttpServlet extends HttpServlet {

    @Autowired
    private TemplateEngine engine;
    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate template;

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

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                config.getServletContext());
    }

    protected abstract String get(HttpServletRequest req, HttpServletResponse resp, RequestContext ctx) throws IOException;

    protected abstract String post(HttpServletRequest req, HttpServletResponse resp, RequestContext ctx);
}
