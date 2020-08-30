package com.jett.sample.dagger2.dagger2demo.b;

import javax.inject.Inject;

/**
 * @Class: Engine
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-1:43 PM
 */
public class Engine {

    String name;

    @Inject
    public Engine(){}

    public Engine(String name){
        this.name = name;
    }


    public void run(){
        System.out.println(name + "跑起来了");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }
}
