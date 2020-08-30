package com.jett.sample.dagger2.dagger2demo.c;

import dagger.Component;

/**
 * @Class: CarComponent
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-6:59 PM
 */

@Component(modules = MakeCarModule.class)
public interface CarComponent {
    void inject(Car car);
}
