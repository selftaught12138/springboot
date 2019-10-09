package com.selftaught.springboot.mapper;

import com.selftaught.springboot.entity.Sys_menu;

public interface Sys_menuMapper {
    int deleteByPrimaryKey(String id);

    int insert(Sys_menu record);

    int insertSelective(Sys_menu record);

    Sys_menu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Sys_menu record);

    int updateByPrimaryKey(Sys_menu record);
}