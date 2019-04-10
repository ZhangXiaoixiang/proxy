package com.demo.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SingerHandler implements InvocationHandler {
    //代理歌手(面向接口)
   private ISinger target;

    public SingerHandler(ISinger target) {
        this.target = target;
    }

    /**
     * 在这里配置代理细节
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("向观众问好");
        //执行目标对象方法
        Object invoke = method.invoke(target, args);
        System.out.println("谢谢大家");
        return invoke;
    }
}
