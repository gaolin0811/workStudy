package com.zhucai.Java8NewFeature.functionInterface;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Desc:
 * @Auth: GaoLin
 * @Date: 2023/6/29 14:51
 */
public class MyNumber {
    private long firstNum;
    private long secondNum;

    public MyNumber(long firstNum, long secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public long process(Calculator calc) {
        return calc.calculate(this.firstNum,this.secondNum);
    }

    public  static List<MyNumber> getMyNumberList() {
        List<MyNumber> list = Lists.newArrayList();
        list.add(new MyNumber(100,40));
        list.add(new MyNumber(300,60));
        list.add(new MyNumber(60,20));
        return list;
    }
}
