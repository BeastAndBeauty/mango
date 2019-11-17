package com.paopao.mango.admin.service;

import com.paopao.mango.admin.model.SysDict;
import com.paopao.mango.core.service.CurdService;

import java.util.List;

/**
 * 字典管理
 * Create by paopao on 2019-11-15 20:02
 */
public interface SysDictService extends CurdService<SysDict> {

    /**
     * 根据名称查询
     *
     * @param label
     * @return
     */
    List<SysDict> findByLabel(String label);
}
