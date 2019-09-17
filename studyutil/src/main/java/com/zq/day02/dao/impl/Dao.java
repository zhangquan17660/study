package com.zq.day02.dao.impl;

import com.zq.day02.dao.Idao;

public class Dao implements Idao {

    @Override
    public void save() {
        System.out.println("保存完毕！");
    }
}
