package com.paopao.mango.admin.service.impl;

import com.paopao.mango.admin.dao.SysDictMapper;
import com.paopao.mango.admin.model.SysDict;
import com.paopao.mango.admin.service.SysDictService;
import com.paopao.mango.core.page.MybatisPageHelper;
import com.paopao.mango.core.page.PageRequest;
import com.paopao.mango.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by paopao on 2019-11-15 20:04
 */
@Service
public class SysDictServiceImpl implements SysDictService {

    @Autowired
    private SysDictMapper sysDictMapper;

    @Override
    public List<SysDict> findByLabel(String label) {
        return sysDictMapper.findByLabel(label);
    }

    @Override
    public int save(SysDict record) {
        if (record.getId() == null || record.getId() == 0) {
            return sysDictMapper.insertSelective(record);
        }
        return sysDictMapper.updateByPrimaryKey(record);
    }

    @Override
    public int delete(SysDict record) {
        return sysDictMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysDict> records) {
        for (SysDict record : records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public SysDict findById(Long id) {
        return sysDictMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        Object label=pageRequest.getParam("label");
        if (label!=null){
            return MybatisPageHelper.findPage(pageRequest,sysDictMapper,"findPageByLabel",label);
        }
        return MybatisPageHelper.findPage(pageRequest,sysDictMapper);
    }
}
