package com.demo.jdkproxy;


import java.lang.reflect.Proxy;

/**
 * 动态代理即JDK代理测试类
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("----JDK动态代理-----");
        //目标对象
        ISinger targt = new Singer();
        //代理对象(jdk方式)
        SingerHandler handler = new SingerHandler(targt);
        ISinger proxy = (ISinger)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{ISinger.class}, handler);
        proxy.sing();
    }
}
