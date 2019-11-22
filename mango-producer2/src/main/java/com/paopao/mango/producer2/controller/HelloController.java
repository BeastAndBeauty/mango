package com.paopao.mango.producer2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by paopao on 2019-11-22 17:07
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello mango 2!";
    }
}
