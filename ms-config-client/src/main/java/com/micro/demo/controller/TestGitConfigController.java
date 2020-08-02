package com.micro.demo.controller;

import com.micro.demo.config.TestGitAutoRefreshConfig;
import com.micro.demo.config.TestGitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestGitConfigController {

    @Autowired
    private TestGitConfig testGitConfig;

    @Autowired
    private TestGitAutoRefreshConfig testGitAutoRefreshConfig;

    @GetMapping("/show")
    public Object show() {
        return testGitConfig;
    }

    @GetMapping(value = "autoShow")
    public Object autoShow() {
        return testGitAutoRefreshConfig;
    }

}
