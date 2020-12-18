package com.zhucai.designPattern.abstractFactoryPattern;

/**
 * @Desc: 白种人抽象类
 * @Auth: GaoLin
 * @Date: 2020/12/14 11:44
 */
public abstract class AbstractWhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("白种人在笑......");
    }

    @Override
    public void talk() {
        System.out.println("白种人在说活......");
    }

    @Override
    public void cry() {
        System.out.println("白种人在哭......");
    }
}
