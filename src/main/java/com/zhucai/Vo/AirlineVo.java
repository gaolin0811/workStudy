package com.zhucai.Vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Desc: 航班Vo
 * @Auth: GaoLin
 * @Date: 2021/12/15 14:05
 */
@Data
public class AirlineVo implements Serializable {

    private Integer airlineNo;

    private String companyNo;

    private String startCity;

    private String endCity;

    private Date leaveTime;
}
