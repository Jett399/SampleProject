package com.jett.sample.dagger2.dagger2demo.a;

import dagger.Component;

/**
 * @Class: CarComponent
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-12:33 PM
 *
 * 注入器： 将Engine注入到Car中
 */
@Component
public interface CarComponent {
        void inject(Car car);
}
