package com.zhu.mm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MmApplication {

    public static void main(String[] args) {
        SpringApplication.run(MmApplication.class, args);
    }

}
