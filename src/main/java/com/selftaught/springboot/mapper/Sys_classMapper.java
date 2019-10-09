package com.selftaught.springboot.mapper;

import com.selftaught.springboot.entity.Sys_class;

public interface Sys_classMapper {
    int deleteByPrimaryKey(String cId);

    int insert(Sys_class record);

    int insertSelective(Sys_class record);

    Sys_class selectByPrimaryKey(String cId);

    int updateByPrimaryKeySelective(Sys_class record);

    int updateByPrimaryKey(Sys_class record);
}