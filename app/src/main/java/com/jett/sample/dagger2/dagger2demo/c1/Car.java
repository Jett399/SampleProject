package com.jett.sample.dagger2.dagger2demo.c1;

import org.junit.Test;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @Class: Car
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-7:17 PM
 */
public class Car {

    @Named("A")
    @Inject
    Engine engineA;

    @Named("B")
    @Inject
    Engine engineB;

    public Car() {
        DaggerCarComponent.builder().makeCarModule(new MakeCarModule()).build().inject(this);
    }

    @Test
    public void test() {
        engineA.run();
        engineB.run();
    }
}
