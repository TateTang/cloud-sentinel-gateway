package com.tate.springcloud.service;

import com.tata.springcloud.entities.CommonResult;
import com.tata.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author tangmf
 * @Date 2021/5/11 8:31 下午
 * @Description
 */
@FeignClient(value = "cloud-provider", fallback = PaymentFallbackService.class)
public interface ProviderService {
    /*
        openFeign调用其他服务，保证调用一致性
     */
    @GetMapping("provider/{id}")
    CommonResult<Payment> getProvider(@PathVariable("id") Long id);
}
