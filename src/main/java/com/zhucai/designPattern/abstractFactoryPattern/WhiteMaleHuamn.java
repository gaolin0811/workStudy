package com.zhucai.designPattern.abstractFactoryPattern;

/**
 * @Desc: 男性白种人
 * @Auth: GaoLin
 * @Date: 2020/12/14 14:06
 */
public class WhiteMaleHuamn extends AbstractWhiteHuman {
    @Override
    public void sex() {
        System.out.println("该白种人的性别为男性......");
    }
}
