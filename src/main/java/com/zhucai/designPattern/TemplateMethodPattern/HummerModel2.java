package com.zhucai.designPattern.TemplateMethodPattern;

/**
 * @Desc: 悍马2抽象类
 * @Auth: GaoLin
 * @Date: 2021/1/4 17:04
 * 非常非常的简单，那如果我告诉这就是模板方法模式你会不会很不屑呢？就这模式，太简单了，我一
 * 直在使用呀，是的，你经常在使用，但你不知道这是模板方法模式，那些所谓的高手就可以很牛 X 的说“用
 * 模板方法模式就可以实现…”，你还要很崇拜的看着，哇，牛人，模板方法模式是什么呀?
 * 然后我们继续回顾我们这个模型，回头一想，不对呀，需求分析的有点问题，客户要关心模型的启动，
 * 停止，鸣笛，引擎声音吗？他只要在 run 的过程中，听到或看都成了呀，暴露那么多的方法干啥？
 */
public abstract class HummerModel2 {
    /*
     * 首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正
     * 是要能够发动起来，那这个实现要在实现类里了
     */
    protected abstract void start();
    //能发动，那还要能停下来，那才是真本事
    protected abstract void stop();
    //喇叭会出声音，是滴滴叫，还是哔哔叫
    protected abstract void alarm();
    //引擎会轰隆隆的响，不响那是假的
    protected abstract void engineBoom();
    //那模型应该会跑吧，别管是人退的，还是电力驱动，总之要会跑
    final public void run() {
    //先发动汽车
        this.start();
    //引擎开始轰鸣
        this.engineBoom();
    //然后就开始跑了，跑的过程中遇到一条狗挡路，就按喇叭
        this.alarm();
    //到达目的地就停车
        this.stop();
    }
}
