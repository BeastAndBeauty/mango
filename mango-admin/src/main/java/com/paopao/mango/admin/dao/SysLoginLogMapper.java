package com.paopao.mango.admin.dao;

import com.paopao.mango.admin.model.SysLoginLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLoginLog record);

    int insertSelective(SysLoginLog record);

    SysLoginLog selectByPrimaryKey(Long id);

    List<SysLoginLog> selectAll();

    int updateByPrimaryKeySelective(SysLoginLog record);

    int updateByPrimaryKey(SysLoginLog record);

    List<SysLoginLog> findPage();

    List<SysLoginLog> findPageByUserName(@Param(value="userName") String userName);

    List<SysLoginLog> findPageByStatus(@Param(value="status") String status);
}