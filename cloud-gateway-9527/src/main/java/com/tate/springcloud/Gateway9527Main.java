package com.tate.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author tangmf
 * @Date 2021/5/11 8:56 下午
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Gateway9527Main {
    public static void main(String[] args) {
        SpringApplication.run(Gateway9527Main.class, args);
    }
}
