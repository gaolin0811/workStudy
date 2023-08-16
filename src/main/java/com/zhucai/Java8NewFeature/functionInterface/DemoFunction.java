package com.zhucai.Java8NewFeature.functionInterface;

import org.junit.Test;

import java.util.Random;
import java.util.function.Supplier;

/**
 * @Desc: 函数室接口调用测试
 * @Auth: GaoLin
 * @Date: 2023/6/28 18:13
 */
public class DemoFunction {

    @Test
    public void functionInterTest() {
        Calculator calc = (n1, n2) -> n1 + n2;
        System.out.println(calc.calculate(20,30));
    }


    /**
     * @Date 2023/6/29 11:10  @Author GaoLin  @Description :java.util.function.Supplier 测试学习
     * @Description: Supplier：包含一个无参的方法
     *  T get()：获得结果
     * 	该方法不需要参数，它会按照某种实现逻辑（由Lambda表达式实现）返回一个数据。
     *  Supplier接口也称为生产型接口，如果我们指定了接口的泛型是什么类型，
     *  那么接口中的get方法就会生产什么类型的数据供我们使用。
    **/

    @Test
    public void supplierTest() {
        Supplier<String> s = () -> "Hello World";
        System.out.println(s.get());

        Random random = new Random();
        Supplier<Integer> s2 = () -> random.nextInt(10);
        System.out.println(s2.get());

    }
}
