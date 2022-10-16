package com.example.service;

import com.example.dao.UserDao;
import com.example.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ServiceDemo {
    public static void main(String[] args) throws IOException {
        //加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> all = userDao.findAll();
        System.out.println(all);

        UserDao userDao1 = sqlSession.getMapper(UserDao.class);
        User byId = userDao1.findById(1);
        System.out.println(byId);
    }
}
