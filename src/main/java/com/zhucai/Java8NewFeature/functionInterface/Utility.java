package com.zhucai.Java8NewFeature.functionInterface;

/**
 * @Desc:
 * @Auth: GaoLin
 * @Date: 2023/6/29 15:10
 */
public class Utility {

    public static long add (long num1,long num2) {
        return num1+num2;
    }

    public static long multiply (long num1,long num2) {
        return num1*num2;
    }

    public static long divide (long num1,long num2) {
        return num1/num2;
    }

    public Utility(String taskName) {
        System.out.println(taskName);
    }
}
