package com.zq.Ioczhujie.Client;

import com.zq.Ioczhujie.service.Iservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanIoczhujie.xml");
        Iservice iservice = applicationContext.getBean("iservice", Iservice.class);
        iservice.save();
    }
}
