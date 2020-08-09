package com.micro.demo.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 使用 @ConfigurationProperties 的方式获取配置<br>
 * 配合调用 actuator/refresh 接口实现配置自动刷新
 * http://localhost:8089/actuator/refresh (POST方式，用postman调用)
 */
@Component
@ConfigurationProperties(prefix = "data")
public class TestGitAutoRefreshConfig {
    public static class UserInfo {
        private String userName;

        private String mobile;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        @Override
        public String toString() {
            return "UserInfo{" +
                    "username='" + userName + '\'' +
                    ", mobile='" + mobile + '\'' +
                    '}';
        }
    }

    private float version;

    private UserInfo user;

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }
}
