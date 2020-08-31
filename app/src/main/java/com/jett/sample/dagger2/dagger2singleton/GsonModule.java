package com.jett.sample.dagger2.dagger2singleton;

import com.google.gson.Gson;
import com.jett.sample.dagger2.dagger2app.singleton.ApplicationScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @Class: GsonModule
 * @Description:
 * @author: Jett
 * @Date: 8/31/20-8:45 AM
 */
@Module
public class GsonModule {

    @Singleton
    @Provides
    public Gson provideGson(){
        return new Gson();
    }
}
