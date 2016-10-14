package me.zuichu.ffmpeglibDemo;

import android.app.Application;

import me.zuichu.ffmpeglib.FfmpegLib;

/**
 * Created by office on 2016/10/13.
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        FfmpegLib.initFfmpegLib(getApplicationContext(), true);
    }
}
