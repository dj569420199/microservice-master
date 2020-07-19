package com.ms.esrc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 邓建
 * @since 2020/7/7
 */
@RestController
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    //启动两个ms-eureka-service-provider，在浏览器多次运行http://localhost:8085/provider/getProviderDemoInfo可看到效果
    @RequestMapping("/getProviderDemoInfo")
    public String getProviderDemoInfo(String name) {
        return restTemplate.getForObject("http://ms-eureka-service-provider/provider/getInfo1?name=" + name, String.class);
    }
}
