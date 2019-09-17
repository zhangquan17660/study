package com.zq.Ioczhujie.BeanFactory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Bean:计算机英语中表示可重用组件
 * JavaBean(java 语言创建的可重用组件) > 实体类
 * 需要配置文件配置service，dao
 *     配置内容：key=全限定类名
 *     xml或properties
 * 反射创建bean对象
 */
public class BeanFactory {
    private static Map<String,Object> beans;
    private static Properties pro;
    static{
        try {
            pro = new Properties();
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("beanProperties/bean.properties");
            pro.load(in);
            //实例化beans
            beans = new HashMap<String, Object>();
           Enumeration em =  pro.keys();
           while (em.hasMoreElements()){
               String key = em.nextElement().toString();
               String beanPath = pro.getProperty(key);
               Object  bean = Class.forName(beanPath).newInstance();
               beans.put(key,bean);
           }
        }catch (Exception e){
            throw new ExceptionInInitializerError("初始化失败！");
        }
    }
    public  static  Object  getBean(String beanName) {
        return beans.get(beanName);
    }
}
