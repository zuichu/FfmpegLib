package me.zuichu.ffmpeglibDemo;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import me.zuichu.ffmpeglib.FfmpegApi;

public class MainActivity extends AppCompatActivity {
    private FfmpegApi ffmpegApi;
    private String tag = "recordVideo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ffmpegApi = new FfmpegApi();
        ffmpegApi.recordRtmpVideoFfmpeg(tag, "rtmp://live.hkstv.hk.lxdns.com/live/hks", -1, Environment.getExternalStorageDirectory() + "/movie.flv");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ffmpegApi.stopFfmepg(tag);
    }
}
