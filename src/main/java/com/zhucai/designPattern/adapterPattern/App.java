package com.zhucai.designPattern.adapterPattern;

/**
 * @Desc: 应用场景类
 * @Auth: GaoLin
 * @Date: 2021/1/4 14:27
 * 大家看，使用了适配器模式只修改了一句话，其他的业务逻辑都不用修改就解决了系统对接的问题，
 * 而且在我们实际系统中只是增加了一个业务类的继承，就实现了可以查本公司的员工信息，也可以查人力
 * 资源公司的员工信息，尽量少的修改，通过扩展的方式解决了该问题。
 * 适配器模式分为类适配器和对象适配器，这个区别不大，上边的例子就是类适配器，那对象适配器是
 * 什么样子呢？对象适配器的类图是这个样子滴：
 */
public class App {
    public static void main(String[] args) {
        IUserInfo youngGirl = new UserInfo();

        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}
