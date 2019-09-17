package com.zq.jdbc.Client;

import com.zq.jdbc.dao.Idao;
import com.zq.jdbc.pojo.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class JdbcTempeleteTest1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:jdbcBean.xml");
        Idao idao = (Idao)applicationContext.getBean("accountDao1");
        Account account = idao.selectAccount(1);
        System.out.println(account.getMoney());

    }




}
