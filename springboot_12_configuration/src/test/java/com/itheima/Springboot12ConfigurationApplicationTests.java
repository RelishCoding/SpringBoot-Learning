package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Springboot12ConfigurationApplicationTests {
    //@Value("${servers.ipAddress}")
    @Value("${servers.ip-address}")
    private String ipAddress;

    @Value("${datasource.password}")
    private String password;

    @Test
    void contextLoads() {
        System.out.println(ipAddress);
        System.out.println(password);
    }
}
