package com.zhucai.Java8NewFeature.Date;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * @Desc: LocalDateTest
 * @Auth: GaoLin
 * @Date: 2022/7/28 16:07
 * Java 8中表示日期和时间的类有多个，主要的有：
 * Instant：表示时刻，不直接对应年月日信息，需要通过时区转换
 * LocalDateTime: 表示与时区无关的日期和时间信息，不直接对应时刻，需要通过时区转换
 * LocalDate：表示与时区无关的日期，与LocalDateTime相比，只有日期信息，没有时间信息
 * LocalTime：表示与时区无关的时间，与LocalDateTime相比，只有时间信息，没有日期信息
 * ZonedDateTime： 表示特定时区的日期和时间
 * ZoneId/ZoneOffset：表示时区
 */
public class LocalDateTest {


    @Test
    public void createLocalDate() {
        //获取当前时间
        LocalDate newLocalDate1 = LocalDate.now();
        System.out.println("newLocalDate1 = " + newLocalDate1);
        //输入年月日设置时间
        LocalDate newLocalDate2 = LocalDate.of(2020, Month.JANUARY,12);
        System.out.println("newLocalDate2 = " + newLocalDate2);
        //String类型转换成LocalDate类型
        LocalDate newLocalDate3 = LocalDate.parse("2019-12-07");
        System.out.println("newLocalDate3 = " + newLocalDate3);
    }
    
    @Test
    public void getYearMonthDay() {
        LocalDate localDate = LocalDate.now();
        int year1 = localDate.getYear();
        System.out.println("year1 = " + year1);
        int year2 = localDate.get(ChronoField.YEAR);
        System.out.println("year2 = " + year2);
        //注意getMonth方法返回的是Month类，可通过getValue方法获得一个long类型的值，然后可以强转为int类型进行使用
        Month month = localDate.getMonth();
        System.out.println("month = " + month);
        int month1 = localDate.get(ChronoField.MONTH_OF_YEAR);
        System.out.println("month1 = " + month1);
        int day = localDate.getDayOfMonth();
        System.out.println("day = " + day);
        int day1 = localDate.get(ChronoField.DAY_OF_MONTH);
        System.out.println("day1 = " + day1);
        //注意getDayOfWeek方法返回的是DayOfWeek类，可通过getValue方法获得一个long类型的值，然后可以强转为int类型进行使用
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);
        int dayOfWeek1 = localDate.get(ChronoField.DAY_OF_WEEK);
        System.out.println("dayOfWeek1 = " + dayOfWeek1);
    }

    @Test
    public void baseLocalDateAndLocalTime (){


        //String转换成日期类型
        //String类型转换成LocalDate类型
        LocalDate localDate = LocalDate.parse("2019-12-07");

        //String类型转换为LocalTime类型
        LocalTime localTime = LocalTime.parse("17:26:00");

        //String类型转换为LocalDateTime类型
        //按照12小时计算
        DateTimeFormatter formatter12 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        LocalDate localDate1 = LocalDate.parse("2019-12-07 07:43:53",formatter12);
        System.out.println("localDate1 = " + localDate1);
        //按照24小时计算
        DateTimeFormatter formatter24 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDate localDate2 = LocalDate.parse("2019-12-07 07:43:53",formatter24);
        System.out.println("localDate2 = " + localDate2);

        //日期类型转换成String类型
        //localDate转换成String
        LocalDate localDate3 = LocalDate.now();
        //按照yyyyMMdd样式进行更改
        String format = localDate3.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("format = " + format);
        //按照yyyy-MM-dd样式进行更改
        String format1 = localDate.format(DateTimeFormatter.ISO_DATE);
        System.out.println("format1 = " + format1);
        //自定义样式进行更改
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String format2 = localDate.format(pattern);
        System.out.println("format2 = " + format2);
        //LocalTime类型转换为String类型
        //按照xx:xx:xx.xx样式进行转换
        LocalTime localTime2 = LocalTime.now();
        String format3 = localTime2.format(DateTimeFormatter.ISO_TIME);
        System.out.println("format3 = " + format3);
        //按照自定义样式进行转换
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("hh:mm:ss");
        String format4 = localTime.format(formatter4);
        System.out.println("format4 = " + format4);
        //LocalDateTime类型转换为String类型
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format5 = localDateTime.format(formatter2);
        System.out.println("format5 = " + format5);

    }

    @Test
    public void localDateCovertToString() {
        //String转换成日期类型
        //String类型转换成LocalDate类型
        LocalDate localDate = LocalDate.parse("2019-12-07");

        //String类型转换为LocalDateTime类型
        //按照12小时计算
        DateTimeFormatter formatter12 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        LocalDate localDate1 = LocalDate.parse("2019-12-07 07:43:53",formatter12);
        System.out.println("localDate1 = " + localDate1);
        //按照24小时计算
        DateTimeFormatter formatter24 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDate localDate2 = LocalDate.parse("2019-12-07 07:43:53",formatter24);
        System.out.println("localDate2 = " + localDate2);

        //日期类型转换成String类型
        //localDate转换成String
        LocalDate localDate3 = LocalDate.now();
        //按照yyyyMMdd样式进行更改
        String format = localDate3.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("format = " + format);
        //按照yyyy-MM-dd样式进行更改
        String format1 = localDate.format(DateTimeFormatter.ISO_DATE);
        System.out.println("format1 = " + format1);
        //自定义样式进行更改
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String format2 = localDate.format(pattern);
        System.out.println("format2 = " + format2);
        //LocalTime类型转换为String类型
        //按照xx:xx:xx.xx样式进行转换
        LocalTime localTime2 = LocalTime.now();
        String format3 = localTime2.format(DateTimeFormatter.ISO_TIME);
        System.out.println("format3 = " + format3);
    }

    @Test
    public void localDateAddMinus () {
        LocalDate localDate = LocalDate.now();
        //增加一年
        LocalDate localDate1 = localDate.plusYears(1);
        System.out.println("localDate1 = " + localDate1);
        LocalDate localDate2 = localDate.plus(1, ChronoUnit.YEARS);
        System.out.println("localDate2 = " + localDate2);
        //减少一个月
        LocalDate localDate3 = localDate.minusMonths(1);
        System.out.println("localDate3 = " + localDate3);
        LocalDate localDate4 = localDate.minus(1, ChronoUnit.MONTHS);
        System.out.println("localDate4 = " + localDate4);
        //减少一日
        LocalDate localDate5 = localDate.minusDays(1);
        System.out.println("localDate5 = " + localDate5);
        LocalDate localDate6 = localDate.minus(1, DAYS);
        System.out.println("localDate6 = " + localDate6);
        
        //通过使用with方法进行修改
        //修改年为2020(类似的方法可以改变月、日)
        LocalDate localDate7 = localDate.withYear(2020);
        System.out.println("localDate7 = " + localDate7);
        //修改为2020
        LocalDate localDate8 = localDate.with(ChronoField.YEAR, 2020);
        System.out.println("localDate8 = " + localDate8);

    }

    @Test
    public void countTwoLocalDateDays() {
        // 开始日期
        LocalDate startDate = LocalDate.parse("2020-05-08");
        // 结束日期
        LocalDate endDate = LocalDate.parse("2020-06-09");
        // 剩余天数
        int lastDayInt = (int) (endDate.toEpochDay() - startDate.toEpochDay());
        System.out.println("lastDayInt = " + lastDayInt);

        System.out.println("两个日期相隔天数 =" + DAYS.between(startDate,endDate));

    }
    
    @Test
    public void localDateUtilTest () {
        LocalDate localDate = LocalDate.parse("2018-02-18");

        Period period = localDate.until(LocalDate.parse("2018-03-28"));
        System.out.println(period.getDays());

        long val = localDate.until(LocalDate.parse("2018-03-28"), DAYS);
        System.out.println(val);
    }

    @Test
    public void localDateOthers() {
        LocalDate now = LocalDate.now();
        LocalDateTime zeroTime = now.atStartOfDay();
        System.out.println("zeroTime = " + zeroTime);
        
        LocalDateTime localDateTime = now.atTime(23,23,59);
        System.out.println("localDateTime = " + localDateTime);
        
        LocalDateTime localDateTime2 = now.atTime(2,30);
        System.out.println("localDateTime2 = " + localDateTime2);
        
        LocalTime localTime = LocalTime.of(15,55,40);
        LocalDateTime localDateTime3 = now.atTime(localTime);
        System.out.println("localDateTime3 = " + localDateTime3);

        ZoneId bjZone = ZoneId.of("GMT+08:00");
        ZonedDateTime zonedDateTime = now.atStartOfDay(bjZone);
        System.out.println("zonedDateTime = " + zonedDateTime);
    }



}
