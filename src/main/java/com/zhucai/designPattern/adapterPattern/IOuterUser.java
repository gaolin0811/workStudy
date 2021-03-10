package com.zhucai.designPattern.adapterPattern;

import java.util.Map;

/**
 * @Desc: 外部人员信息接口
 * @Auth: GaoLin
 * @Date: 2021/1/4 14:32
 */
public interface IOuterUser {

    //员工基本信息，姓名、性别、手机号
    public Map getUserBaseInfo();

    //员工工作信息
    public Map getUserOfficeInfo();

    //员工家庭信息
    public Map getUserHomeInfo();
}
