package com.zhucai.designPattern.abstractFactoryPattern;

/**
 * @Desc: 男性工厂类
 * @Auth: GaoLin
 * @Date: 2020/12/14 14:49
 */
public class MaleHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowMaleHuman);
    }

    @Override
    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteMaleHuman);
    }

    @Override
    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackMaleHuman);
    }
}
