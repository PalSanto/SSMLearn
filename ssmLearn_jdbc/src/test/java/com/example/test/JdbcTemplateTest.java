package com.example.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

public class JdbcTemplateTest {
    @Test
    public void test1() throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = applicationContext.getBean(JdbcTemplate.class);
        int row = jdbcTemplate.update("insert into account values(?,?)","alex","6000");
        System.out.println(row);
    }

    @Test
    public void test() throws PropertyVetoException {
        //创建数据源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/dbforssm");
        dataSource.setUser("root");
        dataSource.setPassword("135490");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        //执行update语句
        int row = jdbcTemplate.update("insert into account values(?,?)","tom","5000");
        System.out.println(row);
    }

}
