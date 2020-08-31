package com.jett.sample.dagger2.dagger2singleton;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @Class: LoginActivityComponent
 * @Description:
 * @author: Jett
 * @Date: 8/31/20-9:00 AM
 */
@Singleton
@Component(modules = GsonModule.class)
public interface LoginActivityComponent {
    void inject(LoginActivity activity);
}
