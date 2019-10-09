package com.selftaught.springboot.mapper;

import com.selftaught.springboot.entity.Role_menu;

public interface Role_menuMapper {
    int deleteByPrimaryKey(String id);

    int insert(Role_menu record);

    int insertSelective(Role_menu record);

    Role_menu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Role_menu record);

    int updateByPrimaryKey(Role_menu record);
}