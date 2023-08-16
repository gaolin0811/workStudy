package com.zhucai.soulFifteenQuestions.questionOne;

import lombok.Data;

import java.util.Date;

/**
 * @Desc: PersonDTO
 * @Auth: GaoLin
 * @Date: 2023/8/16 16:14
 */
@Data
public class PersonDTO {
    private String name;
    private Integer age;
    private Date birthday;
}
