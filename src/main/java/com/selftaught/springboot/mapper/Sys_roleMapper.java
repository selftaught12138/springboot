package com.selftaught.springboot.mapper;

import com.selftaught.springboot.entity.Sys_role;

public interface Sys_roleMapper {
    int deleteByPrimaryKey(String id);

    int insert(Sys_role record);

    int insertSelective(Sys_role record);

    Sys_role selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Sys_role record);

    int updateByPrimaryKey(Sys_role record);
}