package com.selftaught.springboot.mapper;

import com.selftaught.springboot.entity.Sys_type;

public interface Sys_typeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Sys_type record);

    int insertSelective(Sys_type record);

    Sys_type selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Sys_type record);

    int updateByPrimaryKey(Sys_type record);
}