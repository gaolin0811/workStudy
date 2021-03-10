package com.zhucai.designPattern.facadePattern;

/**
 * @Desc:使用场景类
 * @Auth: GaoLin
 * @Date: 2020/12/14 15:53
 * 那这个过程与高内聚的要求相差甚远，你想，你要知道这四个步骤，而且还要知道这四个步骤的顺序，
 * 一旦出错，信就不可能邮寄出去
 */
@SuppressWarnings("all")
public class Client {
    public static void main(String[] args) {
        LetterProcess letterProcess = new LetterProcessImpl();

        letterProcess.writeContent("Hello, This is our first lesson, so I don't know your names.I have fun learning and speaking English this term ........");

        letterProcess.fillEnvelope("Happy Road NO.666......");

        letterProcess.letterIntoEnvelope();

        letterProcess.sendLetter();

    }
}
