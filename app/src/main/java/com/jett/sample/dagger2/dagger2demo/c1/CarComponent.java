package com.jett.sample.dagger2.dagger2demo.c1;

import dagger.Component;

/**
 * @Class: CarComponent
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-7:17 PM
 */
@Component(modules = MakeCarModule.class)
public interface CarComponent {
    void inject(Car c);
}
