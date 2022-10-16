package com.example.ssmlearn_web.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//自己编写的ContextLoaderListener
public class ContextLoaderListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        //读取web.xml中的全局参数
        String contextConfig = servletContext.getInitParameter("contextConfig");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextConfig);
        //存储到ServletContext中
        servletContext.setAttribute("app",applicationContext);

        System.out.println("done");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
}
