package com.zhucai.Entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Desc: 航班实体
 * @Auth: GaoLin
 * @Date: 2021/12/15 14:04
 */
@Data
public class Airline implements Serializable {

    private Integer airlineNo;

    private String companyNo;

    private String startCity;

    private String endCity;

    private Date leaveTime;

}
