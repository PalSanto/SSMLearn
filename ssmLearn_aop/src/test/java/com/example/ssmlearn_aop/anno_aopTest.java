package com.example.ssmlearn_aop;

import com.example.anno_aop.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-anno.xml")
public class anno_aopTest {

    @Autowired
    private TargetInterface target;

    @Test
    public void test1(){
        target.save();
    }


}
