package com.zhucai.designPattern.adapterPattern;

/**
 * @Desc: 邮递信件接口
 * @Auth: GaoLin
 * @Date: 2020/12/14 15:40
 */
public interface LetterProcess {

    public void writeContent(String content);

    public void fillEnvelope(String address);

    public void letterIntoEnvelope();

    public void sendLetter();
}
