package com.zq.anno.Client;

import com.zq.anno.dao.Idao;
import com.zq.anno.pojo.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTempeleteTest1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:jdbcBean.xml");
        Idao idao = (Idao)applicationContext.getBean("accountDao1");
        Account account = idao.selectAccount(1);
        System.out.println(account.getMoney());

    }




}
