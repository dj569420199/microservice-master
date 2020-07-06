package com.ms.esc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MsEurekaServiceConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsEurekaServiceConsumeApplication.class, args);
    }

    //向spring里注入一个RestTemplate对象
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
