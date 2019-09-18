package com.zq.anno.Client;

import com.zq.anno.pojo.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcTempeleteTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:jdbcBean.xml");
        JdbcTemplate jdbcTemplate =(JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        jdbcTemplate.execute("select * from account where id =1");
        jdbcTemplate.update("update account set name = ? where id =?","test",1);
        List<Account> a = jdbcTemplate.query("select*from account where id=?",new BeanPropertyRowMapper<Account>(Account.class),1);
        System.out.println(a);

    }




}
