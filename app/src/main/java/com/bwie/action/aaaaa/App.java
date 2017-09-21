package com.bwie.action.aaaaa;

import android.app.Application;

import org.xutils.*;
import org.xutils.BuildConfig;

/**
 * Created by ASUS on 2017/9/21.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);
    }
}
