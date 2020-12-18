package com.zhucai.designPattern.abstractFactoryPattern;

/**
 * @Desc: 女娲造人类
 * @Auth: GaoLin
 * @Date: 2020/12/14 15:04
 * 抽象工厂模式讲完了，那我们再思考一些问题：工厂模式有哪些优缺点？先说优点，我这人一般先看
 * 人优点，非常重要的有点就是，工厂模式符合 OCP 原则，也就是开闭原则，怎么说呢，比如就性别的问题，
 * 这个世界上还存在双性人，是男也是女的人，那这个就是要在我们的产品族中增加一类产品，同时再增加
 * 一个工厂就可以解决这个问题，不需要我再来实现了吧，很简单的大家自己画下类图，然后实现下。
 * 那还有没有其他好处呢？抽象工厂模式，还有一个非常大的有点，高内聚，低耦合，在一个较大的项
 * 目组，产品是由一批人定义开发的，但是提供其他成员访问的时候，只有工厂方法和产品的接口，也就是
 * 说只需要提供 Product Interface 和 Concrete Factory 就可以产生自己需要的对象和方法，Java 的高内聚
 * 低耦合的特性表现的一览无遗，哈哈。
 */
public class NvWa {
    public static void main(String[] args) {
        //第一条生产线，男性生产线
        MaleHumanFactory maleHumanFactory = new MaleHumanFactory();

        //第二条生产线，女性生产线
        FemaleHumanFactory femaleHumanFactory = new FemaleHumanFactory();

        Human maleYellowHuman =  maleHumanFactory.createYellowHuman();

        maleYellowHuman.laugh();
        maleYellowHuman.cry();
        maleYellowHuman.talk();
        maleYellowHuman.sex();

        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        femaleYellowHuman.laugh();
        femaleYellowHuman.cry();
        femaleYellowHuman.talk();
        femaleYellowHuman.sex();
    }

}
