package com.zhucai.designPattern.strategyPattern;

/**
 * @Desc: 锦囊
 * @Auth: GaoLin
 * @Date: 2020/12/8 11:24
 */
@SuppressWarnings("all")
public class Content {
    private Istrategy istrategy;

    public Content(Istrategy istrategy) {
        this.istrategy = istrategy;
    }

    //使用计谋，看我的
    public void operate() {
        this.istrategy.operate();
    }
}
