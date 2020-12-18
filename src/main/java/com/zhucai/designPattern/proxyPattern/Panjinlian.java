package com.zhucai.designPattern.proxyPattern;

/**
 * @Desc: 潘金莲
 * @Auth: GaoLin
 * @Date: 2020/12/8 15:03
 */
@SuppressWarnings("all")
public class Panjinlian implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("潘金莲抛媚眼........");
    }

    @Override
    public void makeHappyWithMan() {
        System.out.println("潘金莲和那个男人......");
    }
}
