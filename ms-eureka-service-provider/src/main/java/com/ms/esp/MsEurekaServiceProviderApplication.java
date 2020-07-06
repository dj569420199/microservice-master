package com.ms.esp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsEurekaServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsEurekaServiceProviderApplication.class, args);
    }

}
