package com.jett.sample.dagger2.dagger2demo.d;

import dagger.Component;

/**
 * @Class: CarComponent
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-8:23 PM
 */

/**
 * 3.在component中声明
 */
@Engine.CarScope
@Component(modules = MakeCarModule.class)
public interface CarComponent {
    void inject(Car c);
}
