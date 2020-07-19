package com.micro.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class DemoController {

    @Autowired
    private DemoFeign demoFeign;

    @RequestMapping("/getDemoInfo1")
    public String getDemoInfo1() {
        return demoFeign.getDemoInfo1("Demo feign");
    }
}
