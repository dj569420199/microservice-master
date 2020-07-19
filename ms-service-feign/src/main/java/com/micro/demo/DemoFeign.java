package com.micro.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//feign默认集成了ribbon负载均衡
//声明代理哪个微服务
@FeignClient(name = "ms-eureka-service-provider")
public interface DemoFeign {

    //FeignClient中的方法有参数传递一般要加@RequestParam（“xxx”）注解
    @RequestMapping("/provider/getInfo1")
    String getDemoInfo1(@RequestParam("name") String name);
}
