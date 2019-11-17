package com.paopao.mango.admin.dao;

import com.paopao.mango.admin.model.SysRoleMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRoleMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);

    SysRoleMenu selectByPrimaryKey(Long id);

    List<SysRoleMenu> selectAll();

    int updateByPrimaryKeySelective(SysRoleMenu record);

    int updateByPrimaryKey(SysRoleMenu record);

    List<SysRoleMenu> findRoleMenus(@Param(value="roleId") Long roleId);

    List<SysRoleMenu> findAll();

    int deleteByRoleId(@Param(value="roleId") Long roleId);
}