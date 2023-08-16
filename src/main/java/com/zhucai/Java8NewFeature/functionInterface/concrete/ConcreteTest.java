package com.zhucai.Java8NewFeature.functionInterface.concrete;

import com.zhucai.Java8NewFeature.functionInterface.concrete.inter.DataCombiner;
import com.zhucai.Java8NewFeature.functionInterface.concrete.inter.ExtraInfoProvider;
import com.zhucai.Java8NewFeature.functionInterface.concrete.inter.InfoProvider;
import com.zhucai.Java8NewFeature.functionInterface.concrete.testClasses.Employee;
import com.zhucai.Java8NewFeature.functionInterface.concrete.testClasses.Project;
import org.junit.Test;

/**
 * @Desc: 实践测试
 * @Auth: GaoLin
 * @Date: 2023/6/29 17:15
 */
public class ConcreteTest {

    @Test
    public void exampleOne() {
        DataCombiner<Project> dataCombiner = (Project p) -> {
            if(p.getLocation() == null) {
                return p.getPName()+" : " + p.getTeamLead();
            } else {
                return p.getPName()+" : " + p.getTeamLead() + " : " + p.getLocation();
            }
        };

        InfoProvider<Employee, Project> infoProvider = (Employee emp) -> {
            if(emp.getId() > 100) {
                return new Project("ABCD", emp.getName());
            } else {
                return new Project("PQRS", emp.getName());
            }
        };

        ExtraInfoProvider<Project> extraInfoProvider = (Project p) -> {
            p.setLocation("Noida");
            return p;
        };

        String s = infoProvider.addMore(extraInfoProvider)
                .addCombiner(dataCombiner).combine(new Employee(50, "Mahesh"));

        System.out.println(s);

    }
}
