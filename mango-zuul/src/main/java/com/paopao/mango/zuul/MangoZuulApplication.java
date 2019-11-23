package com.paopao.mango.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Create by paopao on 2019-11-23 19:17
 */
@EnableZuulProxy
@SpringBootApplication
public class MangoZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangoZuulApplication.class, args);
    }
}
