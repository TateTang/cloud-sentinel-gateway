package com.tate.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @Author tangmf
 * @Date 2021/5/5 7:03 下午
 * @Description
 */
@Service
public class PaymentFallbackService implements ProviderService {
    @Override
    public String getProvider(Integer id) {
        return "错误了 ku";
    }
}
