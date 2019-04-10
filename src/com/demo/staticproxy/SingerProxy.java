package com.demo.staticproxy;

/**
 * 歌手代理(代理对象,要成为代理必然要实现目标对象实现过的接口,这是代理的基础,
 * 你想一下代理歌手歌都不会唱还能担任代理的职责吗)
 */
public class SingerProxy implements ISinger {
    //代理的对象(当然是歌手接口了)
    /**
     * 为什么不是具体的歌手?因为这样可以用多态,如果直接下面写private Singer singer;那么就相当于代理具体歌手了,
     * 如代理周杰伦,那么还有刘德华,邓紫棋,薛之谦等一大波代理歌手,岂不是类膨胀了,失去代理的意义了,
     * 抽象成歌手接口ISinger,代理唱歌接口(new 对应的歌手就行了)
     */


    private ISinger target;//如果这里不包含代理对象,那么后面就是单纯的重写,相当于重写实现,那就失去代理意义了,所以这里要使用它作为属性

    //对应带参构造器
    public SingerProxy(ISinger target) {
        this.target = target;
    }

    // 对目标对象的sing方法进行功能扩展
    @Override
    public void sing() {
        System.out.println("向观众问好");//代理的服务
        target.sing();//代理最基本的任务
        System.out.println("谢谢大家");//代理的服务
    }
}
