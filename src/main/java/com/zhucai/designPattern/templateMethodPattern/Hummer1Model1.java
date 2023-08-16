package com.zhucai.designPattern.templateMethodPattern;

/**
 * @Desc: 悍马1抽象类实现类1
 * @Auth: GaoLin
 * @Date: 2021/1/4 16:56
 */
public class Hummer1Model1 extends HummerModel1 {
    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }
    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样在...");
    }
    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }
    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }
}
