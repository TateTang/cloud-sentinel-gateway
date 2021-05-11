package com.tate.springcloud.controller;

import com.tata.springcloud.entities.CommonResult;
import com.tata.springcloud.entities.Payment;
import com.tate.springcloud.service.ProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author tangmf
 * @Date 2021/5/11 8:25 下午
 * @Description
 */
@RequestMapping("/consumer")
@RestController
public class ConsumerController {
    @Resource
    private ProviderService providerService;

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("provider/{id}")
    public CommonResult<Payment> getProvider(@PathVariable("id") Long id) {
        return providerService.getProvider(id);
    }
}
