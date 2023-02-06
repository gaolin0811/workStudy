package com.zhucai.Java8NewFeature.SpringAnnotation;

import org.junit.Test;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

/**
 * @Desc: @Scheduled用法测试
 * @Auth: GaoLin
 * @Date: 2022/8/10 9:59
 */
@Configuration
@EnableScheduling
public class ScheduledTest {

    /**
     *  Long fixedDelay：定时任务每隔多久执行一次，单位是毫秒，上一次任务结束后开始计算下次执行的时间。
    **/
    private int index = 0;
    @Test
    @Scheduled(fixedDelay = 1000 * 10)
    public void fixedDelayTest() {
        index += 1;
        System.out.println("scheduledFixedDelay"+index+"开始执行" + LocalDateTime.now());
    }
}
