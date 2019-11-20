package com.paopao.mango.backup.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 数据源
 * Create by paopao on 2019-11-20 15:47
 */
@Component
@ConfigurationProperties(prefix = "mango.backup.datasource")
public class BackupDataSourceProperties {

    private String host;
    private String username;
    private String password;
    private String database;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }
}
