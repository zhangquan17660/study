package com.zq.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CustomProxy {
    public static void main(String[] args) {
        final  Producer producer = new Producer();
        IProducer iProducer = (IProducer)Proxy.newProxyInstance(producer.getClass().getClassLoader(),producer.getClass().getInterfaces(),new InvocationHandler(){

            /**
             *
             * @param proxy
             * @param method
             * @param args
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //提供增强的方法
                Object returnObj = null;
                float money = (Float) args[0];
                if("saleProduce".equals(method.getName())){
                    returnObj =  method.invoke(producer,money*0.8f);
                }
                return returnObj;
            }
        });
        iProducer.saleProduce(8000);
    }
}
