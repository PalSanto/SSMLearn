package com.example.ssmlearn_anno.web;

import com.example.ssmlearn_anno.config.SpringConfiguration;
import com.example.ssmlearn_anno.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserController {
    public static void main(String[] args) {
//  获取容器
//  ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.save();
    }
}
