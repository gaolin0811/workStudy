package com.zhucai.designPattern.proxyPattern;

/**
 * @Desc: 定义一种类型的女人，王婆和潘金莲都属于这个类型的女人
 * @Auth: GaoLin
 * @Date: 2020/12/8 15:01
 * 代理模式：什么是代理模式呢？我很忙，忙的没空理你，那你要找我呢就先找我的代理人吧，那代理人总要知道
 * 被代理人能做哪些事情不能做哪些事情吧，那就是两个人具备同一个接口，代理人虽然不能干活，但是被
 * 代理的人能干活呀。
 *
 * 说完这个故事，那额总结一下，代理模式主要使用了 Java 的多态，干活的是被代理类，代理类主要是
 * 接活，你让我干活，好，我交给幕后的类去干，你满意就成，那怎么知道被代理类能不能干呢？同根就成，
 * 大家知根知底，你能做啥，我能做啥都清楚的很，同一个接口呗。
 */
@SuppressWarnings("all")
public interface KindWomen {

    //这种类型的女人能做什么事情呢？
    public void makeEyesWithMan();

    public void makeHappyWithMan();
}
