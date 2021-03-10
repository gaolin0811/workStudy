package com.zhucai.designPattern.adapterPattern;

/**
 * @Desc: 外部员工使用场景类2
 * @Auth: GaoLin
 * @Date: 2021/1/4 15:26
 */
public class AppOut2 {
    public static void main(String[] args) {
        IUserInfo youngGirl = new OuterUserInfo2();

        for (int i = 0; i < 101; i++) {
            System.out.println(youngGirl.getMobileNumber());
        }
    }
}
