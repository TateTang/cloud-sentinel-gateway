package com.tate.springcloud.service;

import com.tata.springcloud.entities.CommonResult;
import com.tata.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

/**
 * @Author tangmf
 * @Date 2021/5/5 7:03 下午
 * @Description
 */
@Service
public class PaymentFallbackService implements ProviderService {
    @Override
    public CommonResult<Payment> getProvider(Long id) {
        return new CommonResult<>(44444, "服务降级返回，---PaymentFallbackService",
                new Payment(id, "errorSerial"));
    }
}
