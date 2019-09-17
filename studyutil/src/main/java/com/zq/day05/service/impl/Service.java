package com.zq.day05.service.impl;

import com.zq.day05.service.Iservice;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Service implements Iservice {
    private String name;
    private int age;
    private Date birthday;
    private String[] myStrs;
    private List<String> myList;
    private Map<String,String> myMap;
    private Properties myPro;


    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyPro(Properties myPro) {
        this.myPro = myPro;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public void save() {
        System.out.println("service方法调用了！！"+name+age+birthday);
    }
    public void update(){
        System.out.println("service方法调用了更新方法");
    }
    public void delete(int id){
        System.out.println("service方法调用了删除方法！");
    }
}
