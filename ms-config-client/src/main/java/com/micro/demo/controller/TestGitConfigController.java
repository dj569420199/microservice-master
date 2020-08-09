package com.micro.demo.controller;

import com.micro.demo.config.TestGitAutoRefreshConfig;
import com.micro.demo.config.TestGitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //自动刷新配置的注解，不过不配置这个注解也能自动刷新
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
