package com.zhucai.soulFifteenQuestions.questionOne;

import lombok.Data;

import java.util.Date;

/**
 * @Desc: PersonDO类
 * @Auth: GaoLin
 * @Date: 2023/8/16 16:16
 */
@Data
public class PersonDO {
    private Integer id;
    private String name;
    private Integer age;
    private Date birthday;
}
