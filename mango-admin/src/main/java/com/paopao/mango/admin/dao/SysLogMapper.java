package com.paopao.mango.admin.dao;

import com.paopao.mango.admin.model.SysLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(Long id);

    List<SysLog> selectAll();

    int updateByPrimaryKey(SysLog record);

    int updateByPrimaryKeySelective(SysLog record);

    List<SysLog> findPage();

    List<SysLog> findPageByUserName(@Param(value="userName") String userName);
}