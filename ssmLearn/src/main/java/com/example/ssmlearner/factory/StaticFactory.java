package com.example.ssmlearner.factory;

import com.example.ssmlearner.dao.UserDao;
import com.example.ssmlearner.dao.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
