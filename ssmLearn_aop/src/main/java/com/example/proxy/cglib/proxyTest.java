package com.example.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class proxyTest {
    public static void main(String[] args) {
        //目标对象
        Target target = new Target();

        //增强对象
        Advice advice = new Advice();

        //返回的值是动态代理生成的对象 基于cglib
        //创建增强器
        Enhancer enhancer = new Enhancer();
        //设置父类(目标对象)
        enhancer.setSuperclass(Target.class);
        //设置回调
        enhancer.setCallback(
                new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                advice.before();//前置增强
                Object invoke = method.invoke(target, args);//执行目标方法
                advice.after();//后置增强
                return invoke;
            }
        }
        );
        //生成代理对象
        Target proxy = (Target) enhancer.create();

        proxy.save();

    }
}
