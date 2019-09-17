package com.zq.day03.service.impl;

import com.zq.day03.BeanFactory.BeanFactory;
import com.zq.day03.dao.Idao;
import com.zq.day03.dao.impl.Dao;
import com.zq.day03.service.Iservice;

public class Service implements Iservice {
    public Service(){
        System.out.println("对象创建！！！");
    }
   // private Idao idao = (Idao) BeanFactory.getBean("idao");
   private Idao idao = new Dao();
    @Override
    public void save() {
        idao.save();
    }
}
