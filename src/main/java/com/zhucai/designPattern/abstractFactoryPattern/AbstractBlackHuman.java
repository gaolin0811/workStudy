package com.zhucai.designPattern.abstractFactoryPattern;

/**
 * @Desc: 黑种人抽象类
 * @Auth: GaoLin
 * @Date: 2020/12/14 11:42
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑人在笑......");
    }

    @Override
    public void talk() {
        System.out.println("黑人在说话.....");
    }

    @Override
    public void cry() {
        System.out.println("黑人在哭......");
    }
}
