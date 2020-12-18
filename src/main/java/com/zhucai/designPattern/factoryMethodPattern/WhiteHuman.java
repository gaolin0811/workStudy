package com.zhucai.designPattern.factoryMethodPattern;

/**
 * @Desc: 白人
 * @Auth: GaoLin
 * @Date: 2020/12/9 10:07
 */
public class WhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("白人在笑.......");
    }

    @Override
    public void talk() {
        System.out.println("白人在说话......");
    }

    @Override
    public void cry() {
        System.out.println("白人在哭......");
    }
}
