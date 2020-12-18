package com.zhucai.designPattern.multitionPattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Desc: 多例皇帝类
 * @Auth: GaoLin
 * @Date: 2020/12/8 16:34
 * 中国的历史上一般都是一个朝代一个皇帝，有两个皇帝的话，必然要PK出一个皇帝出来。
 * 问题出来了：如果真在一个时间，中国出现了两个皇帝怎么办？比如明朝土木堡之变后，
 * 明英宗被俘虏，明景帝即位，但是明景帝当上皇帝后乐疯了，竟然忘记把他老哥明英宗削为太上皇，
 * 也就是在这一个多月的时间内，中国竟然有两个皇帝！
 */
@SuppressWarnings("all")
public class MultEmperor {
    //最多只能有连个皇帝
    private static int MaxNumEmperor = 2;
    //皇帝叫什么名字
    private static ArrayList emperorInfoList = new ArrayList(MaxNumEmperor);
    //装皇帝的列表；
    private static ArrayList emperorList = new ArrayList(MaxNumEmperor);
    //当前参拜的皇帝
    private static int countNumOfEmperor = 0;

    //先把2个皇帝产生出来
    static {
        //把所有的皇帝都产生出来
        for (int i=0; i< MaxNumEmperor; i++) {
            emperorList.add(new MultEmperor("皇"+(i+1)+"帝"));
        }
    }

    //就这么多皇帝了，不允许再推举一个皇帝(new 一个皇帝）
    private MultEmperor() {
        //世俗和道德约束你，目的就是不让你产生第二个皇帝
    }

    private MultEmperor(String info) {
        emperorInfoList.add(info);
    }

    //随意产生实例
    public static MultEmperor getInstance() {
        Random rd = new Random();
        //随机拉出一个皇帝，只要是个精神领袖就成
        countNumOfEmperor = rd.nextInt(MaxNumEmperor);
        return (MultEmperor)emperorList.get(countNumOfEmperor);
    }

    //产生指定的实例

    public static MultEmperor getInstance(int num) {
        if(num >= MaxNumEmperor) {
            return getInstance();
        }
        return (MultEmperor)emperorList.get(num);
    }

    public static void getEmperorInfo() {
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }
}
