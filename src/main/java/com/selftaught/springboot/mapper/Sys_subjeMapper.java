package com.selftaught.springboot.mapper;

import com.selftaught.springboot.entity.Sys_subje;

public interface Sys_subjeMapper {
    int deleteByPrimaryKey(String id);

    int insert(Sys_subje record);

    int insertSelective(Sys_subje record);

    Sys_subje selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Sys_subje record);

    int updateByPrimaryKey(Sys_subje record);
}