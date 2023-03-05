package com.day1.springCloudAlibabaww.fegin;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author ljh
 * @date 2023/3/5
 *
 * name   指定调用rest接口所对应的服务
 * path 指定调用rest 接口所在的stockController指定的requestMapping
 */

@FeignClient(name = "stock-service",path = "/stock")
public interface StorkFeignService {

    //声明需要调用的rest接口对应的方
    @RequestMapping("/reduce")
    String reduce();

}
