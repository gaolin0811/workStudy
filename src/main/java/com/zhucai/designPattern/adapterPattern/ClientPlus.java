package com.zhucai.designPattern.adapterPattern;

/**
 * @Desc: 使用场景Plus
 * @Auth: GaoLin
 * @Date: 2020/12/18 14:38
 * 看到没，客户简单了很多，提供这种模式后，系统的扩展性也有了很大的提高，突然一个非常时期，
 * 寄往 God Province（上帝省）的邮件都必须进行安全检查，那我们这个就很好处理了
 */
public class ClientPlus {
    public static void main(String[] args) {
        ModenPostOffice hellRoadPostOffice = new ModenPostOffice();

        String content = "Hello, This is our first lesson, so I don't know your names.I have fun learning and speaking English this term ........";

        String address = "Happy Road NO.666......";

        hellRoadPostOffice.sendLetter(content,address);
    }
}
