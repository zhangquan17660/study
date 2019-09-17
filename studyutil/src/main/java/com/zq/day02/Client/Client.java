package com.zq.day02.Client;

import com.zq.day02.BeanFactory.BeanFactory;
import com.zq.day02.service.Iservice;

public class Client {

    public static void main(String[] args) {
        for(int i = 0 ; i < 5 ; i++)
            System.out.println(BeanFactory.getBean("iservice"));
        Iservice iservice = (Iservice)BeanFactory.getBean("iservice");
        iservice.save();
    }
}
