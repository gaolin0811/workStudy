package com.zhucai.Java8NewFeature.functionInterface;

import org.junit.Test;

/**
 * @Desc:
 * @Auth: GaoLin
 * @Date: 2023/6/29 16:05
 */
public class WorshipTest {

    @Test
    public void exampleOne () {
        Worship worship = (name) -> System.out.println(name);  //调用Worship的抽象chant()方法打印一次
        worship.again(worship).again(worship).chant("Ram");
    }

    @Test
    public void exampleTwo () {
        Worship worship = (name) -> { //调用Worship的抽象chant()方法打印两次
            System.out.println(name);
            System.out.println(name);
        };
        worship.again(worship).again(worship).chant("Ram");
    }
}
