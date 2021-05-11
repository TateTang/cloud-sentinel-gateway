package com.tate.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tangmf
 * @Date 2021/5/11 8:05 下午
 * @Description
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("nacos/{id}")
    public String getProvider(@PathVariable("id") Integer id) {
        return "nacos register,serverPort:" + serverPort + "\tid" + id;
    }
}
