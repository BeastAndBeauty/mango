package com.paopao.mango.comsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Create by paopao on 2019-11-22 19:46
 */
@RestController
public class RibbonHelloController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ribbon/call")
    public String call() {
        //调用服务，service-producer为注册的服务名称
        //LoadBalancerInterceptor会拦截调用并根据服务名找到对应的服务
        String callServiceResult = restTemplate.getForObject("http://mango-producer/hello", String.class);
        return callServiceResult;
    }
}
