package com.zhucai.designPattern.singletonPattern;

/**
 * @Desc: 改进后的单例模式
 * @Auth: GaoLin
 * @Date: 2020/12/8 15:52
 * 对SingletonPattern存在的风险进行改进
 */
@SuppressWarnings("all")
public class SingletonPatternPlus {
    private static final SingletonPatternPlus singletonPatternPlus = new SingletonPatternPlus();

    private SingletonPatternPlus() {

    }

    //加锁防止多线程操作造成创建出多个实例
    public synchronized static SingletonPatternPlus getInstance() {
        return singletonPatternPlus;
    }
}
