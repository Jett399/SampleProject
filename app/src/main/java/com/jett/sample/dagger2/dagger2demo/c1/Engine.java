package com.jett.sample.dagger2.dagger2demo.c1;

/**
 * @Class: Engine
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-7:17 PM
 */
public class Engine {

    private String name;
    private int age;

    Engine(String name) {
        this.name = name;
    }

    Engine(String name,int age){
        this.name =name;
        this.age = age;
    }

    public void run(){
        System.out.println(name+"的引擎年限："+age);
    }
}
