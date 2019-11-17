package com.paopao.mango.admin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Create by paopao on 2019-11-14 19:12
 * 每当客服端发送请求的时候，都会在头部附上跨域信息，从而支持跨域请求
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**") //允许跨域访问的路径
                .allowedOrigins("*") //允许跨域访问的源
                .allowedMethods("POST","GET","PUT","OPTIONS","DELETE") //允许请求方法
                .maxAge(168000) //预检间隔时间
                .allowedHeaders("*") //允许头部设置
                .allowCredentials(true); //是否发送cookies
    }
}
