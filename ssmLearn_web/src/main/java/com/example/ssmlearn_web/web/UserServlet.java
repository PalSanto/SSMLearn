package com.example.ssmlearn_web.web;

import com.example.ssmlearn_web.service.UserService;

import jakarta.servlet.ServletContext;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        ServletContext servletContext = this.getServletContext();

        //ApplicationContext app = (ApplicationContext) servletContext.getAttribute("app");
        //ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext((javax.servlet.ServletContext) servletContext);

        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext((javax.servlet.ServletContext) servletContext);
        UserService userService = webApplicationContext.getBean(UserService.class);
        userService.save();
    }
}

