package com.example.aop;

public class Target implements TargetInterface {
    public void save(){
//制造异常
//        int i = 1/0;
        System.out.println("running!!");
    }
}
