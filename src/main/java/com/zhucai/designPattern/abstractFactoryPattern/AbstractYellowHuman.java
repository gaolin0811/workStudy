package com.zhucai.designPattern.abstractFactoryPattern;

/**
 * @Desc: 黄种人抽象类
 * @Auth: GaoLin
 * @Date: 2020/12/14 11:41
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄种人在笑......");
    }

    @Override
    public void talk() {
        System.out.println("黄种人在说话......");
    }

    @Override
    public void cry() {
        System.out.println("黄种人在哭......");
    }
}
