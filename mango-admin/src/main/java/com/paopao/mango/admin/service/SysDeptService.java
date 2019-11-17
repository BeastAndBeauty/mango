package com.paopao.mango.admin.service;

import com.paopao.mango.admin.model.SysDept;
import com.paopao.mango.core.service.CurdService;

import java.util.List;

/**
 * Create by paopao on 2019-11-17 12:25
 */
public interface SysDeptService extends CurdService<SysDept> {

    /**
     * 查询机构树
     * @return
     */
    List<SysDept> findTree();
}
