package com.zhucai.designPattern.adapterPattern;

/**
 * @Desc: 外部员工应用场景类
 * @Auth: GaoLin
 * @Date: 2021/1/4 15:08
 */
public class AppOut {
    public static void main(String[] args) {
        IUserInfo youngGirl = new OuterUserInfo();
        for (int i = 0; i < 101; i++) {
            System.out.println(youngGirl.getMobileNumber());
        }
    }
}
