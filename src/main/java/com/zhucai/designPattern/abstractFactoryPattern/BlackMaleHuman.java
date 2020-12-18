package com.zhucai.designPattern.abstractFactoryPattern;

/**
 * @Desc: 男性黑种人
 * @Auth: GaoLin
 * @Date: 2020/12/14 14:11
 */
public class BlackMaleHuman extends AbstractBlackHuman {
    @Override
    public void sex() {
        System.out.println("该黑种人性别为男性......");
    }
}
