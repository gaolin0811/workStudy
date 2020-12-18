package com.zhucai.designPattern.abstractFactoryPattern;

/**
 * @Desc: 工厂接口
 * @Auth: GaoLin
 * @Date: 2020/12/14 14:26
 * 这次定一个接口，应该要造不同性别的人，需要不同的生产线
 * 那这个八卦炉必须可以制造男人和女人
 */
public interface HumanFactory {

    public Human createYellowHuman();

    public Human createWhiteHuman();

    public Human createBlackHuman();
}
