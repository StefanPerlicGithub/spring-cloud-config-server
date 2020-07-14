package com.ftn.put;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PutApplication {

    public static void main(String[] args) {
        SpringApplication.run(PutApplication.class, args);
    }

}
