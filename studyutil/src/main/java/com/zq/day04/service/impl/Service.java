package com.zq.day04.service.impl;

import com.zq.day04.dao.Idao;
import com.zq.day04.dao.impl.Dao;
import com.zq.day04.service.Iservice;

import java.util.Date;

public class Service implements Iservice {


    @Override
    public void save() {
        System.out.println("service方法调用了！！");
    }
}
