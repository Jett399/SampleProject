package com.jett.sample.dagger2.dagger2demo.c;

import dagger.Module;
import dagger.Provides;

/**
 * @Class: MakeCarModule
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-7:08 PM
 */

@Module
public class MakeCarModule {

    @Provides
    @Engine.QualifierA
    Engine provideEngineA(){
        return new Engine("引擎A");
    }

    @Provides
    @Engine.QualifierB
    Engine provideEngineB(){
        return new Engine("引擎B");
    }



}
