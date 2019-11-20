package com.paopao.mango.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Create by paopao on 2019-11-20 20:07
 */
@EnableAdminServer
@SpringBootApplication
public class MangoMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangoMonitorApplication.class, args);
    }
}
