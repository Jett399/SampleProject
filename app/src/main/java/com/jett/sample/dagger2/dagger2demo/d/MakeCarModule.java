package com.jett.sample.dagger2.dagger2demo.d;

import dagger.Module;
import dagger.Provides;

/**
 * @Class: MakeCarModule
 * @Description:
 * @author: Jett
 * @Date: 8/30/20-8:19 PM
 */
@Module
public class MakeCarModule {


    /**
     * 2. 用@CarScope去标记依赖提供方MarkCarModule
     * @return
     */
    @Provides
    @Engine.CarScope
    public Engine provideEngine(){
        return new Engine("gear");
    }
}
