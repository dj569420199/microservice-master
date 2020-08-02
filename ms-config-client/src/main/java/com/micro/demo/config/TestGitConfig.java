package com.micro.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//使用 @Value 的方式获取配置
@Component
public class TestGitConfig {
    @Value("${configName}")
    private String configName;

    @Value("${env}")
    private String env;

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
}
