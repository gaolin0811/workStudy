package com.zhucai.designPattern.proxyPattern;

/**
 * @Desc: 贾氏
 * @Auth: GaoLin
 * @Date: 2020/12/8 15:20
 */
@SuppressWarnings("all")
public class JiaShi implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("贾氏抛媚眼......");
    }

    @Override
    public void makeHappyWithMan() {
        System.out.println("贾氏和那个男人.....");
    }
}
