package com.zzhl.cloudnoob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudnoobApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudnoobApplication.class, args);
    }

}
