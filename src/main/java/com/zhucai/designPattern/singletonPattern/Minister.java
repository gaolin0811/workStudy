package com.zhucai.designPattern.singletonPattern;

/**
 * @Desc: 大臣是天天要面见皇帝，今天见的皇帝和昨天的，前天不一样那就出问题了！
 * @Auth: GaoLin
 * @Date: 2020/12/8 15:42
 * 看到没，大臣天天见到的都是同一个皇帝，不会产生错乱情况，反正都是一个皇帝，是好是坏就这一
 * 个，只要提到皇帝，大家都知道指的是谁，清晰，而又明确。问题是这是通常情况，还有个例的，如同一
 * 个时期同一个朝代有两个皇帝，怎么办？
 */
@SuppressWarnings("all")
public class Minister {
    public static void main(String[] args) {
        //第一天
        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperorInfo();

        //第二天
        Emperor emperor2 = Emperor.getInstance();
        emperor2.emperorInfo();

        //第三天
        Emperor emperor3 = Emperor.getInstance();
        emperor3.emperorInfo();
    }
}
