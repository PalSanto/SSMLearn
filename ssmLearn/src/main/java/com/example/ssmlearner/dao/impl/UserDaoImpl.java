package com.example.ssmlearner.dao.impl;

import com.example.ssmlearner.dao.UserDao;
import com.example.ssmlearner.domain.User;
import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Data
public class UserDaoImpl implements UserDao {

    private List<String> stringList;
    private Map<String, User> userMap;
    private Properties properties;


    private String name;
    private int age;

    /*
            public UserDaoImpl(){
                System.out.println("UserDaoImpl created");
            }

            public void init(){
                System.out.println("初始化");
            }
            public void destroy(){
                System.out.println("销毁");
            }
            */
    public void save(){
//        System.out.printf("output:" + name + "\t" + age);
        System.out.println(stringList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("saving");
    }

}
