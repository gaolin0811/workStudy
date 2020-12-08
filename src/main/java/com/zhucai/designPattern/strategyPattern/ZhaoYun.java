package com.zhucai.designPattern.strategyPattern;

/**
 * @Desc: 赵云使用妙计
 * @Auth: GaoLin
 * @Date: 2020/12/8 11:27
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Content content;

        System.out.println("使用第一个妙计start.......................");
        content = new Content(new BackDoor());
        content.operate();
        System.out.println("使用第一个妙计end.......................");


        System.out.println("使用第二个妙计start.......................");
        content = new Content(new GivenGreenLight());
        content.operate();
        System.out.println("使用第二个妙计end.......................");

        System.out.println("使用第三个妙计start.......................");
        content = new Content(new BlockEnemy());
        content.operate();
        System.out.println("使用第三个妙计end.......................");
    }
}
