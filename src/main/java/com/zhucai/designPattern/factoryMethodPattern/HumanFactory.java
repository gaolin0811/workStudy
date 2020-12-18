package com.zhucai.designPattern.factoryMethodPattern;

import com.google.common.collect.Lists;
import com.zhucai.util.ClassUtils;

import java.util.List;
import java.util.Random;

/**
 * @Desc: 人类工厂类
 * @Auth: GaoLin
 * @Date: 2020/12/9 10:12
 */
public class HumanFactory {

    //定一个烤箱，泥巴塞进去，人就出来，这个太先进了
    public static Human createHuman(Class c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        }catch (InstantiationException e) {
            System.out.println("必须指定人类颜色！");
        }catch (IllegalAccessException e) {
            System.out.println("人类定义错误！");
        }catch (ClassNotFoundException e) {
            System.out.println("指定的人不存在！");
        }
        return human;
    }

    //女娲生气了，把一团泥巴塞到八卦炉，哎产生啥人类就啥人类
    public static Human createHuman() {
        Human human = null;
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);

        //八卦炉自己开始想烧出什么人就什么人
        Random random = new Random();
        int rand = random.nextInt(concreteHumanList.size());
        human = createHuman(concreteHumanList.get(rand));

        return human;
    }
}
