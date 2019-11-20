package com.paopao.mango.backup.service;

/**
 * MYSQL命令行备份恢复服务
 * Create by paopao on 2019-11-20 15:53
 */
public interface MysqlBackupService {

    /**
     * 备份数据库
     *
     * @param host             地址，可以是本机也可以是远程
     * @param username         数据库用户名
     * @param password         数据库密码
     * @param backupFolderPath 备份的路径
     * @param fileName         备份的文件名
     * @param database         数据库的名称
     * @return
     * @throws Exception
     */
    boolean backup(String host, String username, String password,
                   String backupFolderPath, String fileName, String database) throws Exception;

    /**
     * 恢复数据库
     *
     * @param restoreFilePath 数据库备份的脚本路径
     * @param host            IP地址
     * @param username        数据库用户名
     * @param password        数据库密码
     * @param database        数据库名称
     * @return
     * @throws Exception
     */
    boolean restore(String restoreFilePath, String host, String username,
                    String password, String database) throws Exception;
}
