package com.paopao.mango.backup.service.impl;

import com.paopao.mango.backup.service.MysqlBackupService;
import com.paopao.mango.backup.util.MySqlBackupRestoreUtils;
import org.springframework.stereotype.Service;

/**
 * Create by paopao on 2019-11-20 16:01
 */
@Service
public class MysqlBackupServiceImpl implements MysqlBackupService {


    @Override
    public boolean backup(String host, String username, String password, String backupFolderPath, String fileName, String database) throws Exception {
        return MySqlBackupRestoreUtils.backup(host, username, password, backupFolderPath, fileName, database);
    }

    @Override
    public boolean restore(String restoreFilePath, String host, String username, String password, String database) throws Exception {
        return MySqlBackupRestoreUtils.restore(restoreFilePath, host, username, password, database);
    }
}
