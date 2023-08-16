package com.zhucai.designPattern.templateMethodPattern;

/**
 * @Desc: 悍马2抽象类实现类2
 * @Auth: GaoLin
 * @Date: 2021/1/4 16:58
 */
public class Hummer2Model1  extends HummerModel1{
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
        System.out.println("悍马H2停车...");
    }
}
