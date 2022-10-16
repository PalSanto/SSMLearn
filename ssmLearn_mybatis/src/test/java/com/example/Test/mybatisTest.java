package com.example.Test;

import com.example.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class mybatisTest {

    @Test
    public void findAll() throws IOException {
        //加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作
        List<User> selectList = sqlSession.selectList("UserMapper.findAll");
        System.out.println(selectList);
        //释放资源
        sqlSession.close();
    }
    @Test
    public void add() throws IOException {
        //模拟数据
        User user = new User();
        user.setName("alice");
        user.setSex("女");
        user.setAge(16);


        //加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlConfig.xml");
        //获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作
        sqlSession.insert("UserMapper.add", user);
        //mybatis默认事务不提交
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
}
