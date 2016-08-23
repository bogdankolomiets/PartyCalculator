package com.example.bogdan.partycalculator;

import android.app.Application;
import android.content.Context;

import com.example.bogdan.partycalculator.di.AppComponent;
import com.example.bogdan.partycalculator.di.DaggerAppComponent;

/**
 * @author Bogdan Kolomiets
 * @version 1
 * @date 15.07.16
 */
public class App extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        resolveDependencies();
    }

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    private void resolveDependencies() {
        mAppComponent = DaggerAppComponent.builder()
                .build();
    }

}
