package com.ms.esc.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/test1")
    public String getEurekaServiceInfo() {
        /**
         * exchange(url,type,paras,resutType)
         * url：请求地址
         * type：请求类型 get,post
         * paras：参数
         * resutType：返回值类型
         */
        String url = "http://localhost:8082/getInfo";
        HttpMethod type = HttpMethod.GET;
        RequestEntity<String> paras = null;
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, type, paras, String.class);
        return responseEntity.getBody();
    }

    @RequestMapping("/test2")
    public String getString1() {
        //getForObject 调用无参方法，返回结果为String的方法
        String url = "http://localhost:8082/getInfo";
        String res = restTemplate.getForObject(url, String.class);
        return res;
    }

    @RequestMapping("/test3")
    public String getString2() {
        //getForObject 调用有参方法，路径添加参数。返回结果为String的方法
        String url = "http://localhost:8082/getString?userId=sn001";
        String res = restTemplate.getForObject(url, String.class);
        return res;
    }
}
