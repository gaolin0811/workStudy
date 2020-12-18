package com.zhucai.designPattern.strategyPattern;


/**
 * @Desc: 走后门
 * @Auth: GaoLin
 * @Date: 2020/12/8 11:19
 */
@SuppressWarnings("all")
public class BackDoor implements Istrategy {
    @Override
    public void operate() {
        System.out.println("走后门");
    }
}
