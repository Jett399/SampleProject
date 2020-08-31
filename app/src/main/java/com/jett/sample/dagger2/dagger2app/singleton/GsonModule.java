package com.jett.sample.dagger2.dagger2app.singleton;

import com.google.gson.Gson;

import dagger.Module;
import dagger.Provides;

/**
 * @Class: GsonModule
 * @Description:
 * @author: Jett
 * @Date: 8/31/20-9:34 AM
 */
@Module
public class GsonModule {
    @ApplicationScope
    @Provides
    public Gson provideGson(){
        return new Gson();
    }
}
