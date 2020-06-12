package com.czz.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.czz.spring.mapper")
public class ClassMain8003 {
    public static void main(String[] args) {
        SpringApplication.run(ClassMain8003.class, args);
    }
}
