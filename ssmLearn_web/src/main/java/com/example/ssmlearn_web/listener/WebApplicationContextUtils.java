package com.example.ssmlearn_web.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

//自己编写的WebApplicationContextUtils
public class WebApplicationContextUtils {
    public static ApplicationContext getWebApplicationContext(ServletContext servletContext){
        return (ApplicationContext) servletContext.getAttribute("app");
    }
}
