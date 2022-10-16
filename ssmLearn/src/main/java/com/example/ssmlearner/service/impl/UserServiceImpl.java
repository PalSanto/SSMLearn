package com.example.ssmlearner.service.impl;

import com.example.ssmlearner.dao.UserDao;
import com.example.ssmlearner.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    /*  set方法实现依赖注入
            public void setUserDao(UserDao userDao) {
                this.userDao = userDao;
            }
        */
    public void save(){
        userDao.save();
    }
}
