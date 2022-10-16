package com.example.ssmlearner.factory;

import com.example.ssmlearner.dao.UserDao;
import com.example.ssmlearner.dao.impl.UserDaoImpl;

public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
