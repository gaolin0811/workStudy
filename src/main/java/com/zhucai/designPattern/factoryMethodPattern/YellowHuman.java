package com.zhucai.designPattern.factoryMethodPattern;

/**
 * @Desc: 黄人
 * @Auth: GaoLin
 * @Date: 2020/12/9 10:08
 */
public class YellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄人在笑.......");
    }

    @Override
    public void talk() {
        System.out.println("黄人在说话......");
    }

    @Override
    public void cry() {
        System.out.println("黄人在哭......");
    }
}
