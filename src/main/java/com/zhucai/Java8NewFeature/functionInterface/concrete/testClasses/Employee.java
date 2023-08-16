package com.zhucai.Java8NewFeature.functionInterface.concrete.testClasses;

import lombok.Data;

/**
 * @Desc:
 * @Auth: GaoLin
 * @Date: 2023/6/29 17:11
 */
@Data
public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
