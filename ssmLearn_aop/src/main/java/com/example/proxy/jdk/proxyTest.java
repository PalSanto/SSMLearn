package com.example.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxyTest {
    public static void main(String[] args) {
        //目标对象
        Target target = new Target();

        //增强对象
        Advice advice = new Advice();

        //返回的值是动态代理生成的对象
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(//用父类接收
                target.getClass().getClassLoader(), //目标对象类加载器
                target.getClass().getInterfaces(),  //目标对象相同的接口字节码对象数组
                new InvocationHandler() {
                    //调用代理对象的任何方法 实质上执行的都是invoke方法
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        advice.before();//前置增强
                        Object invoke = method.invoke(target, args);//执行目标方法
                        advice.after();//后置增强
                        return invoke;
                    }
                }
                );
        //调用代理对象的方法
        proxy.save();
    }
}
