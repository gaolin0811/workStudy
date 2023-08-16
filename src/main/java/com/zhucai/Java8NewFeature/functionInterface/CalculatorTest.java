package com.zhucai.Java8NewFeature.functionInterface;

import org.junit.Test;

import java.util.List;

/**
 * @Desc:
 * @Auth: GaoLin
 * @Date: 2023/6/29 14:55
 */
public class CalculatorTest {

    private List<MyNumber> list = MyNumber.getMyNumberList();


    @Test
    public void exampleOne() {
        Calculator calc = (n1,n2) -> n1 + n2;
        for (MyNumber myNumber : list) {
            System.out.println(myNumber.process(calc));
        }
    }

    @Test
    public void exampleTwo() {
        for (MyNumber myNumber : list) {
            System.out.println(myNumber.process((n1,n2) -> n1*n2));
        }
    }

    @Test
    public void exampleThree() {
        for (MyNumber myNumber : list) {
            System.out.println(myNumber.process((n1,n2) -> n1/n2));
        }
    }


    @Test
    public void exampleFour() {
        Calculator calc = Utility :: add;
        System.out.println(calc.calculate(30,50));
    }


    @Test
    public void exampleOnePlus() {
        Calculator calc = Utility :: add;
        for (MyNumber myNumber : list) {
            System.out.println(myNumber.process(calc));
        }
    }

    @Test
    public void exampleOnePlus1() {
        for (MyNumber myNumber : list) {
            System.out.println(myNumber.process(Utility :: add));
        }
    }

    @Test
    public void exampleTwoPlus() {
        for (MyNumber myNumber : list) {
            System.out.println(myNumber.process(Utility::multiply));
        }
    }

    @Test
    public void exampleThreePlus() {
        for (MyNumber myNumber : list) {
            System.out.println(myNumber.process(Utility::divide));
        }
    }

}
