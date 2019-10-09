package com.selftaught.springboot.mapper;

import com.selftaught.springboot.entity.Sys_user;

public interface Sys_userMapper {
    int deleteByPrimaryKey(String id);

    int insert(Sys_user record);

    int insertSelective(Sys_user record);

    Sys_user selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Sys_user record);

    int updateByPrimaryKey(Sys_user record);
}