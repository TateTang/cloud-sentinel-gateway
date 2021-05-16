package com.tate.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tangmf
 * @Date 2021/5/12 3:54 下午
 * @Description
 */
@RestController
@Slf4j
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() {
        ////暂停毫秒，测试线程数直接失败
        //try {
        //    TimeUnit.MILLISECONDS.sleep(800);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        log.info(Thread.currentThread().getName() + "\t" + "....A");
        return "---testA";
    }
}
