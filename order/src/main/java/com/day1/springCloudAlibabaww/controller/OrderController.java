package com.day1.springCloudAlibabaww.controller;


import com.day1.springCloudAlibabaww.fegin.StorkFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired(required = false)
    RestTemplate restTemplate;
    @Autowired
    StorkFeignService storkFeignService;

    @RequestMapping("add")
    public String add() {
        System.out.println("下单成功");
        String reduce = storkFeignService.reduce();
        return reduce + "openFeign";
    }

}
