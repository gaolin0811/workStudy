package com.zhucai.designPattern.abstractFactoryPattern;


/**
 * @Desc:工厂抽象类
 * @Auth: GaoLin
 * @Date: 2020/12/14 14:28
 * 编写一个抽象类，根据enum创建一个人类出来
 */
public abstract class AbstractHumanFactory implements HumanFactory {

    Human human = null;
    /**
     * 给定一个性别人类，创建一个人类出来 专业术语是产生产品等级
    **/
    protected Human createHuman(HumanEnum humanEnum) {
        if(!"".equals(humanEnum.getValue())) {
            try {
                human = (Human)Class.forName(humanEnum.getValue()).newInstance();
            } catch (Exception e) {
                //因为使用了enum，这个种异常情况不会产生了，除非你的enum有问题；
                e.printStackTrace();
                System.out.println("创建的人类不存在！");
            }
        }

        return human;
    }
//    这就是引入 enum 的好处，createHuman(HumanEnum humanEnum)这个方法定义了输入参数必须
//    是 HumanEnum 类型，然后直接使用 humanEnum.getValue()方法就能获得具体传递进来的值
}
