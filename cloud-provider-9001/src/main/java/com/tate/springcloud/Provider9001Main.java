package com.tate.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author tangmf
 * @Date 2021/5/11 6:28 下午
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider9001Main {
    public static void main(String[] args) {
        SpringApplication.run(Provider9001Main.class, args);
    }
}
