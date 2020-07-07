package com.ms.esrc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MsEurekaServiceRibbonConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsEurekaServiceRibbonConsumeApplication.class, args);
    }

    //添加负载均衡注解,这样RestTemplate就集成了ribbon的负载均衡功能
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
