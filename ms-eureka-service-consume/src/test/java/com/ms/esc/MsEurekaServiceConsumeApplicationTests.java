package com.ms.esc;

import com.ms.esc.demo.DemoController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MsEurekaServiceConsumeApplicationTests {

    @Autowired
    DemoController demoController;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testGetEurekaServiceInfo() {
        System.out.println(demoController.getEurekaServiceInfo());
    }
}
