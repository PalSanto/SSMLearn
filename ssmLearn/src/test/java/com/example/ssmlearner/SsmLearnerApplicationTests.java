package com.example.ssmlearner;

import com.example.ssmlearner.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.discovery.ClasspathResourceSelector;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class SsmLearnerApplicationTests {

    @Test
    public void test(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext");
        UserDao userDao = (UserDao) app.getBean("userDao");
        System.out.println(userDao);
        //app.close();
    }

}
