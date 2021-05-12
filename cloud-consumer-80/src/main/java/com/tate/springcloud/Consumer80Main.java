package com.tate.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author tangmf
 * @Date 2021/5/11 8:24 下午
 * @Description
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class Consumer80Main {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80Main.class, args);
    }
}
