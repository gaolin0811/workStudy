package com.zhucai.designPattern.adapterPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @Desc: 外部员工实现类
 * @Auth: GaoLin
 * @Date: 2021/1/4 14:36
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        Map<String,String> baseInfo = new HashMap<>();
        baseInfo.put("userName","这个员工姓名张三......");
        baseInfo.put("mobileNumber","这个员工电话是13764510755......");
        return baseInfo;
    }

    @Override
    public Map getUserOfficeInfo() {
        Map<String,String> officeInfo = new HashMap<>();
        officeInfo.put("jobPosition","Boss");
        officeInfo.put("officeTelNumber","员工办公电话1234567.......");
        return officeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        Map<String,String> homeInfo = new HashMap<>();
        homeInfo.put("homeTelNumber","这个员工家庭电话02166244710......");
        homeInfo.put("homeAddress","家庭住址陕西渭南......");
        return homeInfo;
    }
}
