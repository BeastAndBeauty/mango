package com.paopao.mango.comsumer.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Create by paopao on 2019-11-22 20:15
 */
@Component
public class MangoProducerHystrix implements MangoProducerService {

    @RequestMapping("/hello")
    @Override
    public String hello() {
        return "sorry,hello service call failed.";
    }
}
