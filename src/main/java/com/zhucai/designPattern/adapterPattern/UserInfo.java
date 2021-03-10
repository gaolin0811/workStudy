package com.zhucai.designPattern.adapterPattern;

/**
 * @Desc: 员工信息类
 * @Auth: GaoLin
 * @Date: 2021/1/4 14:23
 */
@SuppressWarnings("all")
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("这里是员工的姓名......");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("这里是员工的家庭住址......");
        return null;
    }

    @Override
    public String getMobileNumber() {
        System.out.println("这里是员工的手机号码......");
        return null;
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println("这里是员工的办公室电话......");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("这里是员工的职位.......");
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println("这里是员工的家庭电话......");
        return null;
    }
}
