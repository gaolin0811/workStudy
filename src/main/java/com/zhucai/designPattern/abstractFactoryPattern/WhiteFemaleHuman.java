package com.zhucai.designPattern.abstractFactoryPattern;

/**
 * @Desc: 女性白种人
 * @Auth: GaoLin
 * @Date: 2020/12/14 14:05
 */
public class WhiteFemaleHuman extends AbstractWhiteHuman {
    @Override
    public void sex() {
        System.out.println("该白种人的性别为女性.......");
    }
}
