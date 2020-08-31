package com.jett.sample.dagger2.dagger2singleton;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import javax.inject.Inject;

/**
 * @Class: LoginActivity
 * @Description:
 * @author: Jett
 * @Date: 8/31/20-8:35 AM
 */
public class LoginActivity extends AppCompatActivity {

    @Inject
    Gson gson;

    @Inject
    Gson gson1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerLoginActivityComponent.builder().build().inject(this);

        System.out.println("gson.hashCode:" +  gson.hashCode());
        System.out.println("gson1.hashCode:" + gson1.hashCode());
    }
}
