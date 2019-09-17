package com.zq.day05.BeanFactory;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {
    void logger(){
        System.out.println("执行日志");
    }

    Object aroundLogger(ProceedingJoinPoint pjp){
        Object o = null;
        try {
            System.out.println("执行了前置通知！！");
           o =  pjp.proceed(); //明确调用业务点方法
            System.out.println("执行了后置置通知！！");
        }catch (Throwable e){
            e.printStackTrace();
        }finally {

        }
        return o;

    }
}
