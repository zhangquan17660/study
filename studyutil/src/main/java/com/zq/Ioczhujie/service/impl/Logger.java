package com.zq.Ioczhujie.service.impl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("logger")
@Aspect
public class Logger {
    @Pointcut("execution(void com.zq.Ioczhujie.service.Iservice.*(..))")
   public void pt1(){

    }
    @Before("pt1()")
    void logger(){
        System.out.println("执行日志");
    }
    @Around("pt1()" )
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
