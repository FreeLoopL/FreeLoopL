package com.day1.springCloud.springCloudAlibaba.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/stock")
public class StockController {

    @Value("${server.port}")
    String port;


    @RequestMapping("/reduce")
    public  String  reduce(){
        System.out.println("扣减库存");
        return "扣减库存成功"+port;
    }

}
