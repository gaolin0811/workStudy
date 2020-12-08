package com.zhucai.designPattern.strategyPattern;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

/**
 * @Desc: 走后门
 * @Auth: GaoLin
 * @Date: 2020/12/8 11:19
 */
public class BackDoor implements Istrategy {
    @Override
    public void operate() {
        System.out.println("走后门");
    }
}
