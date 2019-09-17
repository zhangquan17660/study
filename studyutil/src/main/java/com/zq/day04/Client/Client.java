package com.zq.day04.Client;

import com.zq.day04.dao.Idao;
import com.zq.day04.service.Iservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean04.xml");
        Iservice iservice = applicationContext.getBean("iservice", Iservice.class);
        iservice.save();
    }
}
