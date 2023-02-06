package com.zhucai.Java8NewFeature.Lambda;

import org.junit.Test;

import javax.swing.text.DateFormatter;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.function.BinaryOperator;

/**
 * @Desc: Lambda的各种表达方式
 * @Auth: GaoLin
 * @Date: 2022/7/25 11:31
 * Lambda表达式是一个匿名方法，将行为像数据一样进行传递。
 * Lambda表达式的常见结构：BinaryOperator<Integer>add=(x,y)→x+y。
 * 函数接口指仅具有单个抽象方法的接口，用来表示Lambda表达式的类型。
 */
public class LambdaExpressions {

    /**
     * @Date 2022/7/25 11:39  @Author GaoLin  @Description :无参数的lambda,新建一个线程
    **/
    @Test
    public void expressionOne() {
        Runnable noArguments = () -> System.out.println("Hello Lambda");
    }

    /**
     * @Date 2022/7/25 13:29  @Author GaoLin  @Description :一个参数的lambda
    **/
    @Test
    public void expressionTwo() {
        ActionListener oneArguments = event -> System.out.println("button clicked");
    }

    /**
     * @Date 2022/7/25 13:29  @Author GaoLin  @Description :一个代码块的lambda
     **/
    @Test
    public void expressionThree() {
        Runnable multiStatement = () -> {
            System.out.println("Hello");
            System.out.println("Lambda");
        };

    }

    @Test
    public void expressionFour() {
        BinaryOperator<Long> add = (x,y) -> x+y;
        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x+y;
    }

    @Test
    public void testThreadLocal() {
        ThreadLocal<DateFormatter> threadLocal1 = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MM-yyyy")));
        System.out.println("date --->" + threadLocal1.get().getFormat().format(new Date()));

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1970);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);

        ThreadLocal<DateFormatter> threadLocal2 = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));
        System.out.println("date2 --->" + threadLocal2.get().getFormat().format(cal.getTime()));
    }


}
