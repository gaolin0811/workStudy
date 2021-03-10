package com.zhucai.designPattern.adapterPattern;


import java.util.Map;

/**
 * @Desc: 外部员工信息转换类（类适配器）
 * @Auth: GaoLin
 * @Date: 2021/1/4 14:55
 */
@SuppressWarnings("all")
public class OuterUserInfo extends OuterUser implements IUserInfo {

    private Map<String,String> baseInfo = super.getUserBaseInfo();

    private Map<String,String> officeInfo = super.getUserOfficeInfo();

    private Map<String,String> homeInfo = super.getUserHomeInfo();

    @Override
    public String getUserName() {
        System.out.println(baseInfo.get("userName"));
        return baseInfo.get("userName");
    }

    @Override
    public String getHomeAddress() {
        System.out.println(homeInfo.get("homeAddress"));
        return homeInfo.get("homeAddress");
    }

    @Override
    public String getMobileNumber() {
        System.out.println(baseInfo.get("mobileNumber"));
        return baseInfo.get("mobileNumber");
    }

    @Override
    public String getOfficeTelNumber() {
        System.out.println(officeInfo.get("officeTelNumber"));
        return officeInfo.get("jobPosition");
    }

    @Override
    public String getJobPosition() {
        System.out.println(officeInfo.get("mobileNumber"));
        return officeInfo.get("mobileNumber");
    }

    @Override
    public String getHomeTelNumber() {
        System.out.println(homeInfo.get("homeTelNumber"));
        return homeInfo.get("homeTelNumber");
    }
}
