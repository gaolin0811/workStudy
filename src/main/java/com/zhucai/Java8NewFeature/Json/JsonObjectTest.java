package com.zhucai.Java8NewFeature.Json;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.Map;

/**
 * @Desc: fastjson 测试
 * @Auth: GaoLin
 * @Date: 2022/8/2 10:23
 */
public class JsonObjectTest {

    @Test
    public void stringToMap () {
        String s = "{\"bidWarningCount\":0,\"decidedWarningCount\":1}";
        Map<String,Integer> map = (Map<String,Integer>)JSONObject.parse(s);
        System.out.println(map.get("bidWarningCount"));
        System.out.println(map.get("decidedWarningCount"));
    }
}
