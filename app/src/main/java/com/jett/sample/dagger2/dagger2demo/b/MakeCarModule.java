package com.jett.sample.dagger2.dagger2demo.b;

import dagger.Module;
import dagger.Provides;

/**
 * @Class: MakeCarModule
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-1:44 PM
 */
@Module
public class MakeCarModule {

    public MakeCarModule(){}

    @Provides
    Engine provideEngine(){
        return new Engine("比亚迪");
    }
}
