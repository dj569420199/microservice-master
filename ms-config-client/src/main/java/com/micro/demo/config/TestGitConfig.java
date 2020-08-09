package com.micro.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 使用 @Value 的方式获取配置 <br>
 * 这种方式不能配合调用 actuator/refresh 接口实现配置自动刷新，
 * 这与@Value 注解的实现有关，所以项目中可不用这种方式
 */
@Component
public class TestGitConfig {
    @Value("${configName}")
    private String configName;

    @Value("${env}")
    private String env;

    //测试在本地applicationXXX.properties获取配置中心的配置
    @Value("${config-configName}")
    private String tConfigName;

    //测试获取配置中心公共配置
    @Value("${common-config-name}")
    private String commonConfigName;

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

    public String gettConfigName() {
        return tConfigName;
    }

    public void settConfigName(String tConfigName) {
        this.tConfigName = tConfigName;
    }

    public String getCommonConfigName() {
        return commonConfigName;
    }

    public void setCommonConfigName(String commonConfigName) {
        this.commonConfigName = commonConfigName;
    }
}
