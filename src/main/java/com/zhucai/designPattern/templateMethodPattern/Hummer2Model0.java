package com.zhucai.designPattern.templateMethodPattern;

/**
 * @Desc: 悍马模型2实现类
 * @Auth: GaoLin
 * @Date: 2021/1/4 16:51
 */
public class Hummer2Model0 extends HummerModel0 {
    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }
    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样在...");
    }
    @Override
    public void start() {
        System.out.println("悍马H2发动...");
    }
    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }
    /*
     * H2要跑，那肯定要启动，停止了等，也就是要调其他方法
     */
    @Override
    public void run() {
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
