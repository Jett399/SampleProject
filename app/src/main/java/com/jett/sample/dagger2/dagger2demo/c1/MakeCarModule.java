package com.jett.sample.dagger2.dagger2demo.c1;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @Class: MakeCarModule
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-7:17 PM
 */
@Module
public class MakeCarModule {

    @Provides
    @Named("A")
    public Engine providesA(){
        return new Engine("宝马引擎");
    }

    @Provides
    @Named("B")
    public Engine providesB(){
        return new Engine("奔驰引擎",10);
    }

}
