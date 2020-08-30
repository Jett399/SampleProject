package com.jett.sample.dagger2.dagger2demo.c;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @Class: Engine
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-6:59 PM
 */
public class Engine {


    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface QualifierA{ }


    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface QualifierB{}

    private String name;

    Engine(String name){
        this.name = name;
    }

    public void run(){
        System.out.println(name + "跑起来了");
    }
}
