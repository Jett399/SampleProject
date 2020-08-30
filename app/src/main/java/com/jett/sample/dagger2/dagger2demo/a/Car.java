package com.jett.sample.dagger2.dagger2demo.a;

import org.junit.Test;

import javax.inject.Inject;

/**
 * @Class: Car
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-12:32 PM
 */
public class Car  {

    @Inject
    Engine engine;

    public Car(){
        DaggerCarComponent.builder().build().inject(this);
    }

    @Test
    public void test1(){
        engine.run();
    }
}
