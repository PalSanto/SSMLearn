package com.example.ssmlearn_anno.test;

import com.example.ssmlearn_anno.config.SpringConfiguration;
import com.example.ssmlearn_anno.service.UserService;
import org.junit.Test;
import org.junit.internal.Classes;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
//  @ContextConfiguration(value = "classpath:applicationContext.xml")
@ContextConfiguration(classes = {SpringConfiguration.class})
public class SpringJunitTest {
    @Autowired
    private UserService userService;

    @Autowired
    private DataSource comboPooledDataSource;

    @Test
    public void test1() throws SQLException {
        userService.save();
        System.out.println(comboPooledDataSource.getConnection());
    }
}
