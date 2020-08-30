package com.jett.sample.dagger2.dagger2demo.b;

import dagger.Component;

/**
 * @Class: CarComponent
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-1:43 PM
 */
@Component(modules = MakeCarModule.class)
public interface CarComponent {
    void inject(Car car);
}
