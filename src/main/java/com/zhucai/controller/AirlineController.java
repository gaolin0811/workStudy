package com.zhucai.controller;

import com.zhucai.Entity.Airline;
import com.zhucai.Vo.AirlineVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc: 航班查询Controller
 * @Auth: GaoLin
 * @Date: 2021/12/15 14:01
 */
@Controller
public class AirlineController {

    @RequestMapping("/searchAirline")
    public List<AirlineVo> searchAirline(String name) {
        List<AirlineVo> airlineVos = new ArrayList<>();

        return airlineVos;
    }
}
