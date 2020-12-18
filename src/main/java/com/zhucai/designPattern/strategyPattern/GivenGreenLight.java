package com.zhucai.designPattern.strategyPattern;

/**
 * @Desc: 开绿灯
 * @Auth: GaoLin
 * @Date: 2020/12/8 11:21
 */
@SuppressWarnings("all")
public class GivenGreenLight implements Istrategy {
    @Override
    public void operate() {
        System.out.println("开绿灯。。。。。。");
    }
}
