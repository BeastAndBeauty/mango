package com.paopao.mango.admin.dao;

import com.paopao.mango.admin.model.SysConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    SysConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysConfig record);

    List<SysConfig> selectAll();

    int updateByPrimaryKey(SysConfig record);

    List<SysConfig> findPage();

    List<SysConfig> findPageByLabel(@Param(value="label") String label);

    List<SysConfig> findByLabel(@Param(value="label") String label);
}