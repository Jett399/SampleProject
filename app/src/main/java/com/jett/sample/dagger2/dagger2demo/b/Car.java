package com.jett.sample.dagger2.dagger2demo.b;



import org.junit.Test;

import javax.inject.Inject;

/**
 * @Class: Car
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-1:38 PM
 */
public class Car {

    @Inject
    Engine engine ;

    @Inject
    Engine engine1;

    public Car(){
        DaggerCarComponent.builder().build().inject(this);
    }

    @Test
    public void test(){
      engine.run();
        System.out.println(engine);
      engine1.run();
        System.out.println(engine1);
    }
}
