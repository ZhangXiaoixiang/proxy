package com.demo.staticproxy;

/**
 * 业余歌手
 */
public class OtherSinger implements ISinger{
    @Override
    public void sing() {
        System.out.println("我是业余歌手,我也会唱歌,代理唱歌的也可以代理我哈哈!");
    }
}
