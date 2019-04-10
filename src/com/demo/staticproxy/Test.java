package com.demo.staticproxy;

/**
 * 静态代理测试类
 */
public class Test {
    public static void main(String[] args) {
        //目标对象(静态代理缺点就是这里必须new 出来,就是说必选提前指出)
        ISinger target = new Singer();//多态,刚才说的new具体歌手
        //代理对象
        ISinger proxy = new SingerProxy(target);
        //执行的是代理的方法
        proxy.sing();

        //这次我们代理业余歌手(只要是实现唱歌的功能的实现类,都可以作为代理的目标对象哈)
        System.out.println("----------下面我们代理业余歌手--------------");
        //目标对象(静态代理缺点就是这里必须new 出来,就是说必选提前指出)
        ISinger target2 = new OtherSinger();
        //代理对象
        ISinger proxy2 = new SingerProxy(target2);
        //执行的是代理的方法
        proxy2.sing();


    }
}
