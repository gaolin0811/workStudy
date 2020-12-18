package com.zhucai.designPattern.factoryMethodPattern;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @Desc: 人类工厂类改进 (在类初始化很消耗资源的情况比较实用 ， 比如你要连接硬
 *件 ， 或者是为了初始化一个类需要准备比较多条件 （ 参数 ） ， 通过这种方式可以很好的减少项目的复杂程度 。)
 * @Auth: GaoLin
 * @Date: 2020/12/11 15:41
 */
public class HumanFactoryPlus {

    // 定义一个 MAP, 初始化过的 Human 对象都放在这里
    private static Map<String, Human> humanMap = Maps.newHashMap();

    public static Human createHuman(Class c) {
        Human human = null;
        try {
            if(humanMap.containsKey(c.getSimpleName())) {
                human = humanMap.get(c.getSimpleName());
            }else {
                // 如果 MAP 中有，则直接从取出，不用初始化了
                human = (Human) Class.forName(c.getName()).newInstance();
                // 放到 MAP 中
                humanMap.put(c.getSimpleName(),human);
            }
        }catch (InstantiationException e) {
            System.out.println("必须指定人类颜色！");
        }catch (IllegalAccessException e) {
            System.out.println("人类定义错误！");
        }catch (ClassNotFoundException e) {
            System.out.println("指定的人不存在！");
        }
        return human;
    }
}
