package com.zhucai.Java8NewFeature.Date;

import org.junit.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

/**
 * @Desc: LocalDateTime学习
 * @Auth: GaoLin
 * @Date: 2022/7/28 17:26
 */
public class LocalDateTimeTest {

    @Test
    public void createLocalDateTime() {

        //获取当前时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        //自定义时间
        LocalDateTime localDateTime1  = LocalDateTime.of(2020,9,16,14,34,55);
        LocalDateTime localDateTime2  = LocalDateTime.of(2020, Month.SEPTEMBER,16,14,34,55);
        System.out.println("localDateTime1 = " + localDateTime1);
        System.out.println("localDateTime2 = " + localDateTime2);

        LocalDateTime localDateTime3  = LocalDateTime.of(2020,9,16,14,34,55,55);
        System.out.println("localDateTime3 = " + localDateTime3);
        
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime4 = LocalDateTime.of(localDate,localTime);
        System.out.println("localDateTime4 = " + localDateTime4);

    }

    /**
     * @Date 2022/7/28 17:27  @Author GaoLin  @Description :LocalDateTime与String相互专换
    **/
    @Test
    public void stringConvertToLocalDateTime () {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //LocalDateTime转成String类型的时间
        LocalDateTime time = LocalDateTime.now();
        String localTime = df.format(time);
        System.out.println("LocalDateTime转成String类型的时间："+localTime);

        //String类型的时间转成LocalDateTime
        LocalDateTime ldt = LocalDateTime.parse("2018-06-01 10:12:05",df);
        System.out.println("String类型的时间转成LocalDateTime："+ldt);
    }

    /**
     * @Date 2022/7/29 13:43  @Author GaoLin  @Description :LocalDateTime与Date相互专换
    **/
    @Test
    public void localDateTimeConvertToDate () {
        //Date 转换成 LocalDateTime
        Date date = new Date();
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        System.out.println("Date 转换成 LocalDateTime ---> " + localDateTime);

        //LocalDateTime 转换成 Date
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        ZoneId zone1 = ZoneId.systemDefault();
        Instant instant1 = localDateTimeNow.atZone(zone1).toInstant();
        Date date2 = Date.from(instant1);
        System.out.println("LocalDateTime 转换成 Date -->" + date2);

    }

    /**
     * @Date 2022/7/29 13:55  @Author GaoLin  @Description :LocalDateTime与LocalDate相互专换
    **/
    @Test
    public void LocalDateTimeConvertToLocalDate() {
        //LocalDateTime转换成LocalDate
        LocalDateTime now = LocalDateTime.now();
        LocalDate localDate = now.toLocalDate();
        System.out.println("LocalDateTime转换成LocalDate --> " + localDate);

        //LocalDate转换成LocalDateTime
        LocalDate localDate2 = LocalDate.now();
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDate2.atStartOfDay().atZone(zone).toInstant();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        System.out.println("LocalDate转换成LocalDateTime --> " + localDateTime);

    }

    /**
     * @Date 2022/7/29 14:03  @Author GaoLin  @Description :LocalDateTime与时间戳的相互专换
    **/
    @Test
    public void localDateTimeConvertToTime() {
        long time = new Date().getTime();
        System.out.println("java时间戳：" + time);
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Instant instant = Instant.ofEpochMilli(time);
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(instant, zoneId);
        System.out.println("时间戳转LocalDateTime:" + localDateTime1.format(dateTimeFormatter3));


        LocalDateTime localDateTime2 = LocalDateTime.now();
        ZoneId zoneId1 = ZoneId.systemDefault();
        Instant instant1 = localDateTime2.atZone(zoneId1).toInstant();
        System.out.println("LocalDateTime转时间戳:" + instant1.toEpochMilli());
    }

    /**
     * @Date 2022/7/29 14:06  @Author GaoLin  @Description :LocalDateTime调整
    **/
    @Test
    public void changeLocalDateTime() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        
        LocalDateTime plusYear = now.plusYears(1);
        System.out.println("plusYear = " + plusYear);
        
        LocalDateTime plusMonth = now.plusMonths(3);
        System.out.println("plusMonth = " + plusMonth);
        //明天
        LocalDateTime plusDays = now.plusDays(1);
        System.out.println("明天 = " + plusDays);
        //昨天
        LocalDateTime plusDays2 = now.plusDays(-1);
        System.out.println("昨天 = " + plusDays2);
        //还有时分等同理
        LocalDateTime plusHours1 = now.plusHours(1);
        System.out.println("plusHours1 = " + plusHours1);
        LocalDateTime plusHours2 = now.plusHours(-1);
        System.out.println("plusHours2 = " + plusHours2);

        LocalDateTime plusMinutes1 = now.plusMinutes(5);
        System.out.println("plusMinutes1 = " + plusMinutes1);
        LocalDateTime plusMinutes2 = now.plusMinutes(-5);
        System.out.println("plusMinutes2 = " + plusMinutes2);

        LocalDateTime minutes = now.minusMinutes(-5);
        System.out.println("minutes = " + minutes);
    }

    /**
     * @Date 2022/7/29 14:12  @Author GaoLin  @Description :LocalDateTime 比较
     * 然后比较long就可以了，默认时区是ZoneId.systemDefault()
    **/
    @Test
    public void localDateTimeCompare() {
       LocalDateTime now = LocalDateTime.now();
       Long epochMilli1 = now.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
       LocalDateTime plusDays = now.plusDays(1);
       Long epochMilli2 = plusDays.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
       System.out.println("两个时间比较大小 = " + epochMilli1.compareTo(epochMilli2));

        //北京时区
        ZoneId bjZone = ZoneId.of("GMT+08:00");

        LocalDateTime localDateTime1 = LocalDateTime.of(2022,8,23,5,45,55);
        LocalDateTime localDateTime2 = LocalDateTime.of(2022,9,23,5,45,55);
        LocalDateTime localDateTime3 = LocalDateTime.of(2022,9,23,5,45,55);
        boolean result = localDateTime1.isAfter(localDateTime2);
        System.out.println("比较结果result = " + result);

        boolean result1 = localDateTime1.isBefore(localDateTime2);
        System.out.println("比较结果result1 = " + result1);

        boolean result2 = localDateTime2.isEqual(localDateTime3);
        System.out.println("比较结果result2 = " + result2);
    }

    /**
     * @Date 2022/7/29 14:16  @Author GaoLin  @Description :时间间隔计算
     * 使用Duration进行 day,hour,minute,second等的计算
     * 使用Period进行Year,Month的计算
    **/
    @Test
    public void countLocalDateTime () {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        LocalDateTime plusDays = now.plusDays(1);
        Duration duration = Duration.between(now,plusDays);
        duration.toDays();
        duration.toHours();
        duration.toMinutes();
        System.out.println("天 = " + duration.toDays() + "; 时 = " + duration.toHours() + "; 分 = " + duration.toMinutes());

        Period period2 = Period.between(now.toLocalDate(),plusDays.toLocalDate());
        period2.getYears();
        period2.getMonths();
        period2.toTotalMonths();

        System.out.println("年 = " + period2.getYears() + "; 月 = " + period2.getMonths() + "; 日 = " + period2.toTotalMonths());
    }

    /**
     * @Date 2022/7/29 14:33  @Author GaoLin  @Description :判断是否是今天或昨天
    **/
    @Test
    public void validYesterdayOrTomorrow() {

        String time = "2018-08-09 11:20:45";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
        LocalDateTime localTime = LocalDateTime.parse(time, dtf);
        System.out.println("localTime = " + localTime);
        LocalDateTime startTime = LocalDate.now().atTime(0, 0, 0);
        System.out.println("startTime = " + startTime);
        LocalDateTime endTime = LocalDate.now().atTime(23, 59, 59);
        System.out.println("endTime = " + endTime);
        LocalDateTime startYesterday = LocalDate.now().plusDays(-1).atTime(0, 0, 0);
        LocalDateTime endYesterday = LocalDate.now().plusDays(-1).atTime(23, 59, 59);

        //如果小于昨天的开始日期
        if (localTime.isBefore(startYesterday)) {
            System.out.println("时间是过去");
        }
        //时间是昨天
        if (localTime.isAfter(startYesterday) && localTime.isBefore(endYesterday)) {
            System.out.println("时间是昨天");
        }
        //如果大于今天的开始日期，小于今天的结束日期
        if (localTime.isAfter(startTime) && localTime.isBefore(endTime)) {
            System.out.println("时间是今天");
        }
        //如果大于今天的结束日期
        if (localTime.isAfter(endTime)) {
            System.out.println("时间是未来");
        }
    }

    @Test
    public void countCloseDays() {
        String closeTime = "2022-07-05 10:16:11";
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime closeDateTime = LocalDateTime.parse(closeTime,df);
        Duration duration = Duration.between(closeDateTime,LocalDateTime.now());
        System.out.println(duration.toDays());
    }

    @Test
    public void getDayOFWeek() {
        // 当前时间
        LocalDateTime localDateTime = LocalDateTime.now();
        //上周一
        LocalDateTime localDateTime4 = localDateTime.minusWeeks(1).with(DayOfWeek.MONDAY);
        System.out.println("上周一零点1 = " + localDateTime4.format(DateTimeFormatter.ofPattern("yyyy-MM-dd 00:00:00")));

        System.out.println("上周一MM/dd格式 = " + localDateTime4.format(DateTimeFormatter.ofPattern("MM/dd")));
        //上周日
        LocalDateTime localDateTime3 = localDateTime.minusWeeks(1).with(DayOfWeek.SUNDAY);
        System.out.println("上周日23:59:59 = " + localDateTime3.format(DateTimeFormatter.ofPattern("yyyy-MM-dd 23:59:59")));
        // 以yyyy-MM-dd输出
        System.out.println("上周日yyyy-MM-dd格式 = " + localDateTime3.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }

    @Test
    public void testNumberFormat(){
        NumberFormat numberFormat1 = NumberFormat.getNumberInstance();
        System.out.println(numberFormat1.format(31347));
    }


    @Test
    public void getDistanceTime() throws ParseException {
        Date dateStart = new Date();
        String dateEnd = "2022-09-18 22:20:20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dateEndTemp = sdf.parse(dateEnd);
        long nd = 1000 * 24 * 60 * 60;//一天的毫秒数
        long nh = 1000 * 60 * 60;//一小时的毫秒数
        long nm = 1000 * 60;//一分钟的毫秒数
        long ns = 1000;//一秒钟的毫秒数long diff;try {
//      获得两个时间的毫秒时间差异
        long diff = dateEndTemp.getTime() - dateStart.getTime() ;
        if(diff < 0){
            System.out.println( "已截标");
        }
        long day = diff / nd;//计算差多少天
        long hour = diff % nd / nh;//计算差多少小时
        long min = diff % nd % nh / nm;//计算差多少分钟
        long sec = diff % nd % nh % nm / ns;//计算差多少秒//输出结果
        if (sec < 0) {
            System.out.println( "已截标");
        } else {
            System.out.println( "仅剩" + day + "天" + hour + "小时" + min + "分钟");
        }

        System.out.println("比较------------------------------------------");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTimeEnd = LocalDateTime.parse(dateEnd,df);
        Duration duration = Duration.between(now.toLocalTime(),localDateTimeEnd.toLocalTime());
        System.out.println("duration.toDays()"+duration.toDays());
        duration.toHours();
        duration.toMinutes();
        System.out.println("天 = " + duration.toDays() + "; 时 = " + duration.toHours() + "; 分 = " + duration.toMinutes());

        System.out.println("-----"+now.until(localDateTimeEnd, DAYS));
        System.out.println("-----"+now.until(localDateTimeEnd, HOURS));
        System.out.println("-----"+now.until(localDateTimeEnd, MINUTES));
        System.out.println("-----"+HOURS.between(now,localDateTimeEnd));
        Period period2 = Period.between(now.toLocalDate(),localDateTimeEnd.toLocalDate());
        period2.getYears();
        period2.getMonths();
        period2.toTotalMonths();

        System.out.println("年 = " + period2.getYears() + "; 月 = " + period2.getMonths() + "; 日 = " + period2.toTotalMonths());

    }

}
