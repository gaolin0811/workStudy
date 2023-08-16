package com.zhucai.Java8NewFeature.functionInterface.concrete.testClasses;

import lombok.Data;

/**
 * @Desc:
 * @Auth: GaoLin
 * @Date: 2023/6/29 17:10
 */
@Data
public class Project {
    private String pName;
    private String teamLead;
    private String location;

    public Project(String pName, String teamLead) {
        this.pName = pName;
        this.teamLead = teamLead;
    }
}
