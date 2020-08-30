package com.jett.sample.dagger2.dagger2demo.d;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @Class: Engine
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-8:15 PM
 */
public class Engine {

    /**
     * 1.定义一个CarScope注解
     */
    @Scope
    @Retention(RetentionPolicy.RUNTIME)
    public @interface CarScope{

    }


    private String name ;

    public Engine(String name){
        this.name = name;
    }


    public void run(){

        System.out.println("跑了起来了~"
        );
    }


}
