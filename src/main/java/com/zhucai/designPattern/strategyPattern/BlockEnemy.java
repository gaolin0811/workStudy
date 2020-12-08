package com.zhucai.designPattern.strategyPattern;

/**
 * @Desc: 阻断追兵
 * @Auth: GaoLin
 * @Date: 2020/12/8 11:22
 */
public class BlockEnemy implements Istrategy {
    @Override
    public void operate() {
        System.out.println("阻断追兵。。。。。。");
    }
}
