package com.zhucai.designPattern.TemplateMethodPattern;

/**
 * @Desc: 悍马1实现类使用场景
 * @Auth: GaoLin
 * @Date: 2021/1/4 17:01
 */
public class Client1 {
    public static void main(String[] args) {
        HummerModel1 h1 = new Hummer1Model1();
        h1.run();
        HummerModel1 h2 = new Hummer2Model1();
        h2.run();
    }
}
