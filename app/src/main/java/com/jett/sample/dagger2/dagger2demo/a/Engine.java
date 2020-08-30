package com.jett.sample.dagger2.dagger2demo.a;

import javax.inject.Inject;

/**
 * @Class: Engine
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-12:32 PM
 */
public class Engine {

    @Inject
    Engine(){}

    private String name ;

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }

    public void run(){
        System.out.println("引擎转起来了 === > running~");
    }
}
