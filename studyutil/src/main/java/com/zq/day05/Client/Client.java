package com.zq.day05.Client;

import com.zq.day05.service.Iservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean05.xml");
        Iservice iservice = applicationContext.getBean("iservice", Iservice.class);
        iservice.save();
        iservice.update();
        iservice.delete(1);
    }
}
