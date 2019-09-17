package com.zq.day03.Client;

import com.zq.day02.dao.impl.Dao;
import com.zq.day03.dao.Idao;
import com.zq.day03.service.Iservice;
import com.zq.day03.service.impl.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        //Iservice iservice = (Iservice) BeanFactory.getBean("iservice");
        //Iservice iservice = new Service();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Iservice iservice = applicationContext.getBean("iservice",Iservice.class);
        Idao idao = applicationContext.getBean("idao",Idao.class);
        System.out.println(iservice);
        System.out.println(idao);
        iservice.save();
    }
}
