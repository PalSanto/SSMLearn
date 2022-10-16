package com.example.test;

import com.example.ssmlearn_jdbc.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateCRUDTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //更新语句
    @Test
    public void testUpdate(){
        jdbcTemplate.update("update account set money=? where name=?","10000","tom");
    }
    //删除语句
    @Test
    public void testDelete(){
        jdbcTemplate.update("delete from account where name=?","tom");
    }

    //查询
    @Test
    public void testQueryAll(){
        List<Account> accountList = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(accountList);
    }
    //查询
    @Test
    public void testQuery(){
        Account account = jdbcTemplate.queryForObject("select * from account where name=?", new BeanPropertyRowMapper<Account>(Account.class), "tom");
        System.out.println(account);
    }
    //
    @Test
    public void testCount(){
        Long aLong = jdbcTemplate.queryForObject("select count(*) from account", long.class);
        System.out.println(aLong);
    }
}
