package com.zhucai.designPattern.abstractFactoryPattern;

/**
 * @Desc: 创建一个各种人类枚举类
 * @Auth: GaoLin
 * @Date: 2020/12/14 14:26
 * Enum 类型作为一个参数传递到一个方法中时，在 Junit 进行单元测试的时候，不用判断输入参数是否为空、长度为 0 的边界异
 * 常条件，如果方法传入的参数不是 Enum 类型的话，根本就传递不进来
 */
public enum HumanEnum {
    YellowFemaleHuman("com.zhucai.designPattern.abstractFactoryPattern.YellowFemaleHuman"),

    YellowMaleHuman("com.zhucai.designPattern.abstractFactoryPattern.YellowMaleHuman"),

    WhiteFemaleHuman("com.zhucai.designPattern.abstractFactoryPattern.WhiteFemalHuman"),

    WhiteMaleHuman("com.zhucai.designPattern.abstractFactoryPattern.WhiteMaleHuman"),

    BlackFemaleHuman("com.zhucai.designPattern.abstractFactoryPattern.BlackFemalHuman"),

    BlackMaleHuman("com.zhucai.designPattern.abstractFactoryPattern.BlackMaleHuman");


    private String value;
    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
