package com.example.ssmlearn_web.service.impl;

import com.example.ssmlearn_web.dao.UserDao;
import com.example.ssmlearn_web.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void save() {
        userDao.save();
    }
}
