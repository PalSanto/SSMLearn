package com.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class myAspect {

    public void before(){
        System.out.println("before");
    }
    public void afterReturning(){
        System.out.println("afterReturning");
    }

//ProceedingJoinPoint 正在执行的连接点 == 切点
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Before_around");
        Object proceed = proceedingJoinPoint.proceed();//切点方法
        System.out.println("After_around");
        return proceed;
    }
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    public void after(){
        System.out.println("after");
    }
}
