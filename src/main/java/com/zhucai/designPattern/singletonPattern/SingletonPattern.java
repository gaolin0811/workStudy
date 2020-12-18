package com.zhucai.designPattern.singletonPattern;

/**
 * @Desc: 单例模式类
 * @Auth: GaoLin
 * @Date: 2020/12/8 15:47
 * 单例模式很简单，就是在构造函数中多了加一个构造函数，访问权限是 private 的就可以了，这个模
 * 式是简单，但是简单中透着风险，风险？什么风险？在一个 B/S 项目中，每个 HTTP Request 请求到 J2EE
 * 的容器上后都创建了一个线程,每个线程都要创建同一个单例对象,怎么办?,好,我们写一个通用的单例程
 * 序,然后分析一下:
 */
@SuppressWarnings("all")
public class SingletonPattern {
    private static SingletonPattern singletonPattern = null;

    private SingletonPattern() {

    }


    //假如现在有两个线程 A 和线程 B，线程 A 执行到 this.singletonPattern = new SingletonPattern()，
    //正在申请内存分配，可能需要 0.001 微秒，就在这 0.001 微秒之内，线程 B 执
    //行到 if(this.singletonPattern == null)，你说这个时候这个判断条件是 true 还是 false？是 true，那
    //然后呢？线程 B 也往下走，于是乎就在内存中就有两个 SingletonPattern 的实例了，看看是不是出问题了？
    public static SingletonPattern getInstance() {
        if(null == singletonPattern) {
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }

    //如果你这个单例是去拿一个序列号或者创建一个信号资源的时候，会怎么样？业务逻辑混乱！数据一致性
    //校验失败！最重要的是你从代码上还看不出什么问题，这才是最要命的！因为这种情况基本上你是重现不
    //了的，不寒而栗吧，那怎么修改？有很多种方案，我就说一种，能简单的、彻底解决问题的方案：详见SingletonPatternPlus类
}
