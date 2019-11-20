package com.paopao.mango.backup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Create by paopao on 2019-11-20 15:39
 */
@SpringBootApplication(scanBasePackages = {"com.paopao.mango"})
public class MangoBackupApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangoBackupApplication.class, args);
    }

}
