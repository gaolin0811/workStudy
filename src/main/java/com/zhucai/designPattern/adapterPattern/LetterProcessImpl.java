package com.zhucai.designPattern.adapterPattern;

/**
 * @Desc: 邮递接口实现类
 * @Auth: GaoLin
 * @Date: 2020/12/14 15:51
 */
public class LetterProcessImpl implements LetterProcess {
    @Override
    public void writeContent(String content) {
        System.out.println("写信.....");
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写信封......");
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把心放到信封中......");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件......");
    }
}
