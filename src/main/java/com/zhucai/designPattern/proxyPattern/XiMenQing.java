package com.zhucai.designPattern.proxyPattern;

/**
 * @Desc: 西门庆调用类
 * @Auth: GaoLin
 * @Date: 2020/12/8 15:08
 */
@SuppressWarnings("all")
public class XiMenQing {
    public static void main(String[] args) {
        WangPo wp = new WangPo();
        wp.makeEyesWithMan();
        wp.makeHappyWithMan();

        JiaShi js = new JiaShi();

        WangPo wp2 = new WangPo(js);
        wp2.makeEyesWithMan();
        wp2.makeHappyWithMan();
    }
}
