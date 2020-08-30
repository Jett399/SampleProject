package com.jett.sample.dagger2.dagger2demo.d;

import org.junit.Test;

import javax.inject.Inject;

import dagger.Component;

/**
 * @Class: Car
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-8:23 PM
 */


public class Car {

    @Inject
    Engine engine;

    public Car(){
        DaggerCarComponent.builder().makeCarModule(new MakeCarModule()).build().inject(this);
    }

    @Test
    public void test(){
        engine.run();
    }
}
