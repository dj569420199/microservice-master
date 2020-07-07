package com.ms.esp.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoService {

    @Value("${server.port}")
    String port;

    @RequestMapping("/getInfo")
    public String getDemoInfo(){
        return "this is a provider service";
    }

    @RequestMapping("/getInfo1")
    public String getDemoInfo1(String name){
        return name+",this is a provider service.  port=" + port;
    }

}
