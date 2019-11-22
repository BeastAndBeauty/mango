package com.paopao.mango.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Create by paopao on 2019-11-22 16:58
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MangoProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangoProducerApplication.class, args);
    }
}
