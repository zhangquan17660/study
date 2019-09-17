package com.zq.Ioczhujie.dao.impl;

import com.zq.Ioczhujie.dao.Idao;

import org.springframework.stereotype.Repository;


@Repository("idao")
public class Dao implements Idao {



    @Override
    public void save() {
        System.out.println("保存完毕！");
    }
}
