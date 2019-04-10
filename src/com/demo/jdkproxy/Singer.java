package com.demo.jdkproxy;



/**
 * 歌手(目标对象)
 */
public class Singer implements ISinger{
    @Override
    public void sing() {
        System.out.println("专业歌手唱了一首歌");
    }
}
