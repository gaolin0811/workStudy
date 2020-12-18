package com.zhucai.designPattern.multitionPattern;

/**
 * @Desc: 多例大臣类
 * @Auth: GaoLin
 * @Date: 2020/12/8 17:06
 *  大臣们悲惨了，一个皇帝都伺候不过来了，现在还来了两个皇帝。TND，不管了，找到个皇帝，磕头，请按就成了！
 */
@SuppressWarnings("all")
public class MultMinister {

    public static void main(String[] args) {
        int maxNum = 10; //10个大臣
        for(int i=0; i<10; i++) {
            MultEmperor me = MultEmperor.getInstance();
            System.out.println("第"+(i+1)+"大臣参拜！");
            me.getEmperorInfo();
        }
    }
}
