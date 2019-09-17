package com.zq.day02.service.impl;

import com.zq.day02.BeanFactory.BeanFactory;
import com.zq.day02.dao.Idao;
import com.zq.day02.service.Iservice;

public class Service implements Iservice {
    private Idao idao = (Idao)BeanFactory.getBean("idao");

    @Override
    public void save() {
        idao.save();
    }
}
