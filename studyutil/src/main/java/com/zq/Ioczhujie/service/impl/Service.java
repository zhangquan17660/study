package com.zq.Ioczhujie.service.impl;

import com.zq.Ioczhujie.dao.Idao;
import com.zq.Ioczhujie.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
@PropertySource("classpath:")
@Component(value = "iservice")
public class Service implements Iservice {
    /*@Autowired
    @Qualifier(value = "idao1")*/
    @Resource(name = "idao1")
    private Idao idao1;

    @Override
    public void save() {
        idao1.save();
        System.out.println("service方法调用了！！");
    }

}
