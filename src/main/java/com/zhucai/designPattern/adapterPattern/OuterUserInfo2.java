package com.zhucai.designPattern.adapterPattern;

import java.util.Map;

/**
 * @Desc: 外部员工信息转换类（对象适配器）
 * @Auth: GaoLin
 * @Date: 2021/1/4 15:24
 */
public class OuterUserInfo2 implements IUserInfo {

    OuterUser outerUser = new OuterUser();

    private Map<String,String> baseInfo = outerUser.getUserBaseInfo();

    private Map<String,String> officeInfo = outerUser.getUserOfficeInfo();

    private Map<String,String> homeInfo = outerUser.getUserHomeInfo();

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
