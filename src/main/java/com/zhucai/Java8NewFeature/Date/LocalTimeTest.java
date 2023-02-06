package com.zhucai.Java8NewFeature.Date;

import org.junit.Test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @Desc: LocalTime测试类
 * @Auth: GaoLin
 * @Date: 2022/9/15 20:00
 */
public class LocalTimeTest {

    @Test
    public void createLocalTime() {
        //获取当前时间
        LocalTime newLocalTime1 = LocalTime.now();
        System.out.println("newLocalTime1 = " + newLocalTime1);
        //输入年月日设置时间
        LocalTime newLocalTime2 = LocalTime.of(20,10,56);
        System.out.println("newLocalTime2 = " + newLocalTime2);
        //String类型转换成LocalTime类型
        LocalTime newLocalTime3 = LocalTime.parse("20:08:08");
        System.out.println("newLocalTime3 = " + newLocalTime3);
    }

    @Test
    public void getHourMinuteSecond() {
        LocalTime localTime = LocalTime.now();
        int hour1 = localTime.getHour();
        System.out.println("hour1 = " + hour1);
        int hour2 = localTime.get(ChronoField.HOUR_OF_DAY);
        System.out.println("hour2 = " + hour2);

        int minute1 = localTime.getMinute();
        System.out.println("minute1 = " + minute1);
        int minute2 = localTime.get(ChronoField.MINUTE_OF_DAY);
        System.out.println("minute2 = " + minute2);

        int second1 = localTime.getSecond();
        System.out.println("second1 = " + second1);
        int second2 = localTime.get(ChronoField.SECOND_OF_DAY);
        System.out.println("second2 = " + second2);
    }

    @Test
    public void localTimeAddMinus () {
        LocalTime localTime = LocalTime.now();
        //增加一小时
        LocalTime localTime1 = localTime.plusHours(1);
        System.out.println("localTime1 = " + localTime1);
        LocalTime localTime2 = localTime.plus(1, ChronoUnit.HOURS);
        System.out.println("localTime2 = " + localTime2);
        //减少一分钟
        LocalTime localTime3 = localTime.minusMinutes(1);
        System.out.println("localTime3 = " + localTime3);
        LocalTime localTime4 = localTime.minus(1, ChronoUnit.MINUTES);
        System.out.println("localTime4 = " + localTime4);
        //增减一秒
        LocalTime localTime5 = localTime.minusSeconds(1);
        System.out.println("localTime5 = " + localTime5);
        LocalTime localTime6 = localTime.minus(1, ChronoUnit.SECONDS);
        System.out.println("localTime6 = " + localTime6);

        //通过使用with方法进行修改
        LocalTime localTime7 = localTime.withHour(17);
        System.out.println("localTime7 = " + localTime7);
        //修改为2020
        LocalTime localTime8 = localTime.with(ChronoField.HOUR_OF_DAY, 16);
        System.out.println("localTime8 = " + localTime8);

    }
}
