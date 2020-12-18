package com.zhucai.designPattern.abstractFactoryPattern;

/**
 * @Desc: 男性黄种人
 * @Auth: GaoLin
 * @Date: 2020/12/14 14:02
 */
public class YellowMaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("该黄种人性别为男性......");
    }
}
