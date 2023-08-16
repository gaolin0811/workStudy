package com.zhucai.Java8NewFeature.functionInterface;

import org.junit.Test;

/**
 * @Desc:
 * @Auth: GaoLin
 * @Date: 2023/6/29 15:32
 */
public class TaskHandlerTest {

    @Test
    public void demoOne() {
        TaskHandler taskHandler = Utility::new;
        taskHandler.get("Task1");
    }
}
