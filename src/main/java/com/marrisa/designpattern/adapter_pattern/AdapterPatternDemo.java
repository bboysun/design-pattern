package com.marrisa.designpattern.adapter_pattern;

/**
 * @Auther: Darryl
 * @Description: 适配器模式DEMO入口
 * @Date: created in 2020/3/1 19:52
 */

public class AdapterPatternDemo {


    public static void main(String[] args) {
        AutoMediaPlayer player = new AutoMediaPlayer();
        player.play("扎心", "MP3");
        player.play("如果这都不算爱", "MP4");
        player.play("庆功酒", "VLC");
        player.play("家人", "PNG");
    }

}
