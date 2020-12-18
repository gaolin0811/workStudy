package com.zhucai.designPattern.singletonPattern;

/**
 * @Desc: 皇帝类
 * @Auth: GaoLin
 * @Date: 2020/12/8 15:36
 * 这个模式是很有意思，而且比较简单，但是我还是要说因为它使用的是如此的广泛，如此的有人缘，
 * 单例就是单一、独苗的意思，那什么是独一份呢？你的思维是独一份，除此之外还有什么不能山寨的呢？
 * 我们举个比较难复制的对象：皇帝
 */
@SuppressWarnings("all")
public class Emperor {
    private static Emperor emperor = null;

    //单例模式核心构造方法私有化
    private Emperor() {
        //世俗和道德约束你，目的就是不让你产生第二个皇帝
    };

    public static Emperor  getInstance() {
        if(emperor == null) {
            emperor = new Emperor();
        }
        return emperor;
    }

    //皇帝叫什么名字呀
    public static void emperorInfo(){
        System.out.println("我就是皇帝某某某....");
    }
}
