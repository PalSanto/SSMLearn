package com.example.proxy.cglib;

import com.example.proxy.jdk.TargetInterface;

public class Target implements TargetInterface {
    public void save(){
        System.out.println("running!!");
    }
}
