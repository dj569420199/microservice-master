package com.ms.esp.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoService {
    @RequestMapping("/getInfo")
    public String getDemoInfo(){
        return "this is a provider service";
    }

    @RequestMapping("/getString")
    public String getDemoInfo1(String userId){
        return userId+",this is a provider service";
    }

}
