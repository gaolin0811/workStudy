package com.zhucai.designPattern.abstractFactoryPattern;

/**
 * @Desc: 女性黄种人
 * @Auth: GaoLin
 * @Date: 2020/12/14 14:00
 */
public class YellowFemaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("该黄种人的性别是女性.......");
    }
}
