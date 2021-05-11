package com.tate.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author tangmf
 * @Date 2021/5/11 8:05 下午
 * @Description
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Provider9002Main {
    public static void main(String[] args) {
        SpringApplication.run(Provider9002Main.class, args);
    }
}
