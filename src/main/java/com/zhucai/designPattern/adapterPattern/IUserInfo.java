package com.zhucai.designPattern.adapterPattern;

/**
 * @Desc: 内部员工信息接口
 * @Auth: GaoLin
 * @Date: 2021/1/4 14:16
 */
@SuppressWarnings("all")
public interface IUserInfo {

    //获取员工姓名
    public String getUserName();

    //获取家庭地址
    public String getHomeAddress();

    //获取手机号码
    public String getMobileNumber();

    //获取办公电话
    public String getOfficeTelNumber();

    //获取职位
    public String getJobPosition();

    //获取家庭电话
    public String getHomeTelNumber();
}
