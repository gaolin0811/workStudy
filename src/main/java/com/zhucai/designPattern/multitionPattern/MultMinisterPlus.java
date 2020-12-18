package com.zhucai.designPattern.multitionPattern;

/**
 * @Desc: 那各位看官就可能会不屑了：有的大臣可是有骨气，只拜一个真神，你怎么处理？这个问题太简单， 懒的详细回答你，getInstance(param)是不是就解决了这个问题？！自己思考，太 Easy 了。
 * @Auth: GaoLin
 * @Date: 2020/12/8 17:20
 */
@SuppressWarnings("all")
public class MultMinisterPlus {
    public static void main(String[] args) {
        int maxNum = 10; //10个大臣
        for(int i=0; i<10; i++) {
            MultEmperor me = MultEmperor.getInstance(i);
            System.out.println("第"+(i+1)+"大臣参拜！");
            me.getEmperorInfo();
        }
    }
}
