# FfmpegLib
FfmpegLib库

##CN

FfmpegLib库，性能优秀，支持命令。持续优化更新拓展中，可时时录制网络视频和直播流，视频剪切等。
欢迎提意见和问题，我们会持续更新优化。

目前测试库只有一个api：

```
FfmpegLib.initFfmpegLib(getApplicationContext(), true);//初始化
/**
     * 录制rtmp直播流视频或其他视频
     *
     * @param tag              ffmpeg执行线程独立标签
     * @param rtmpUrl          rtmp直播流地址
     * @param frame            视频帧率
     * @param savePathWithName 保存的视频文件路径，包含文件名和后缀
     * @return 返回执行结果，1为正常
     */
     
recordRtmpVideoFfmpeg(String tag, String rtmpUrl, int frame, String savePathWithName);//录制视频

```

##EN

FfmpegLib,surport ffmpeg command
