package com.example.anno_aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect //标注myAspect为切面类
public class myAspect {

    @Before("execution(* com.example.anno_aop.*.*(..))")
    public void before(){
        System.out.println("before");
    }

    @AfterReturning("Pointcut()")
    public void afterReturning(){
        System.out.println("afterReturning");
    }

//ProceedingJoinPoint 正在执行的连接点 == 切点
//    @Around("execution(* com.example.anno_aop.*.*(..))")
    @Around("Pointcut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Before_around");
        Object proceed = proceedingJoinPoint.proceed();//切点方法
        System.out.println("After_around");
        return proceed;
    }

    @AfterThrowing("Pointcut()")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    @After("Pointcut()")
    public void after(){
        System.out.println("after");
    }

    //定义切点表达式
    //切点表达式的抽取
    @Pointcut("execution(* com.example.anno_aop.*.*(..))")
    public void Pointcut(){}
}
