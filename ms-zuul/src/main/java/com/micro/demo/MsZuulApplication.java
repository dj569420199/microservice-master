package com.micro.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class MsZuulApplication {
    //通过网关访问服务提供
    //规则：网关服务ip:port/服务提供者名称(小写)/服务路径
    //http://localhost:8086/ms-eureka-service-provider/getInfo
    public static void main(String[] args) {
        SpringApplication.run(MsZuulApplication.class, args);
    }
}
