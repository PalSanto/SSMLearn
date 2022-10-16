package com.example.ssmlearn_anno.dao.impl;

import com.example.ssmlearn_anno.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("userDao")
@Repository("userDao")
//  <bean id="userDao" class="com.example.ssmlearn_anno.dao.impl.UserDaoImpl"></bean>

public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("saving");
    }
}
