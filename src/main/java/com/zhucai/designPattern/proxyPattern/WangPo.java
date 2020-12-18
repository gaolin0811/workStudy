package com.zhucai.designPattern.proxyPattern;

/**
 * @Desc: 王婆
 * @Auth: GaoLin
 * @Date: 2020/12/8 15:05
 * 王婆这个人老聪明了，她太老了，是个男人都看不上，但是她有智慧有经验呀，她作为一类女人的代理！
 */
@SuppressWarnings("all")
public class WangPo implements KindWomen {
    private KindWomen kindWomen;

    //默认的话，是潘金莲的代理
    public WangPo() {
        this.kindWomen = new Panjinlian();
    }

    //她可以是KindWomen的任何一个女人的代理，只要你是这一类型
    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    @Override
    public void makeHappyWithMan() {
        this.kindWomen.makeHappyWithMan();
    }
}
