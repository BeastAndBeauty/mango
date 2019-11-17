package com.paopao.mango.admin.service;

import com.paopao.mango.admin.model.SysConfig;
import com.paopao.mango.core.service.CurdService;

import java.util.List;

public interface SysConfigService extends CurdService<SysConfig> {

    /**
     * 根据名称查询
     * @param label
     * @return
     */
    List<SysConfig> findByLabel(String label);
}
