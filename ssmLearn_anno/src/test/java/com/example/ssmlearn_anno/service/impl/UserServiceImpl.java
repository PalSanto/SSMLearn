package com.example.ssmlearn_anno.service.impl;

import com.example.ssmlearn_anno.dao.UserDao;
import com.example.ssmlearn_anno.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.security.SecureRandom;

@Data
@Service("userService")
//  @Component("userService")
//  <bean id="userService" class="com.example.ssmlearn_anno.service.impl.UserServiceImpl"></bean>
@Scope("singleton")//   单例
public class UserServiceImpl implements UserService {

//  @Autowired
//  @Qualifier("userDao")
    @Resource(name = "userDao")
//  <property name="userDao" ref="userDao"></property>

    private UserDao userDao;

    @Value("${jdbc.username}")
    private String name;

    public void save() {
        System.out.println(name);
        userDao.save();
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化方法");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("销毁方法");
    }
}
