package com.jett.sample.dagger2.dagger2demo.c;

import org.junit.Test;

import javax.inject.Inject;

/**
 * @Class: Car
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-6:58 PM
 */
public class Car {


    @Engine.QualifierB
    @Inject
    Engine engineB;


    @Engine.QualifierA
    @Inject
    Engine engineA;


    public Car(){
        DaggerCarComponent.builder().build().inject(this);
    }

    @Test
    public void test (){
        engineA.run();
        engineB.run();
    }
}
