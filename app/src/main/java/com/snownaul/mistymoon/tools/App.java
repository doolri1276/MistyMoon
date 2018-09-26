package com.snownaul.mistymoon.tools;

import android.app.Application;
import android.content.Context;

public class App extends Application {

    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
    }

    public static Context getContext(){
       return instance;
    }

    public static App getInstance(){
        return instance;
    }
}
