package com.zhucai.designPattern.abstractFactoryPattern;

/**
 * @Desc:女性黑种人
 * @Auth: GaoLin
 * @Date: 2020/12/14 14:09
 */
public class BlackFemaleHuman extends AbstractBlackHuman{
    @Override
    public void sex() {
        System.out.println("该黑种人性别为女性......");
    }
}
