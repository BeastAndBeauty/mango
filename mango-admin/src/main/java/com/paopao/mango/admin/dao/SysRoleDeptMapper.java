package com.paopao.mango.admin.dao;

import com.paopao.mango.admin.model.SysRoleDept;
import java.util.List;

public interface SysRoleDeptMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleDept record);

    int insertSelective(SysRoleDept record);

    SysRoleDept selectByPrimaryKey(Long id);

    List<SysRoleDept> selectAll();

    int updateByPrimaryKeySelective(SysRoleDept record);

    int updateByPrimaryKey(SysRoleDept record);
}