package com.zhucai.Java8NewFeature.functionInterface;

/**
 * @Desc: 函数式接口Demo
 * @Auth: GaoLin
 * @Date: 2023/6/28 18:12
 */
@FunctionalInterface
public interface Calculator {
    //抽象方法
    long calculate(long num1, long num2);

    //多个默认方法
    default void defaultMethod1(){
        System.out.println("这是函数式接口的默认方法----->defaultMethod1");
    }

    default void defaultMethod2(){
        System.out.println("这是函数式接口的默认方法----->defaultMethod2");
    }

    //多个静态方法
    static void staticMethod1() {
        System.out.println("这是函数式接口的静态方法----->staticMethod1");
    }

    static void staticMethod2() {
        System.out.println("这是函数式接口的静态方法----->staticMethod2");
    }

    //因为任何一个函数式接口的实现，默认都继承了 Object 类，
    // 包含了来自 java.lang.Object 里对这些抽象方法的实现。
    @Override
    boolean equals(Object obj);

    @Override
    String toString();

    @Override
    int hashCode();

}
