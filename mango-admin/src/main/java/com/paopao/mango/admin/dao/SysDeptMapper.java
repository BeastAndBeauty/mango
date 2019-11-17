package com.paopao.mango.admin.dao;

import com.paopao.mango.admin.model.SysDept;

import java.util.List;

public interface SysDeptMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    SysDept selectByPrimaryKey(Long id);

    List<SysDept> selectAll();

    int updateByPrimaryKey(SysDept record);

    List<SysDept> findPage();

    List<SysDept> findAll();
}