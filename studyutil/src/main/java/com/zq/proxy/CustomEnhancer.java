package com.zq.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CustomEnhancer {
    public static void main(String[] args) {
        Producer producer = new Producer();
        Producer producerClib = (Producer)Enhancer.create(producer.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                //提供增强的方法
                Object returnObj = null;
                float money = (Float) objects[0];
                if("saleProduce".equals(method.getName())){
                    returnObj =  method.invoke(producer,money*0.8f);
                }
                return returnObj;
            }
        });
        producerClib.saleProduce(10000);
    }
}
