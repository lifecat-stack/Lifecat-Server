package com.ten.lifecat.server.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.ten.lifecat.server.entity.AGroupPermission;

public interface AGroupPermissionDao {

    int insert(@Param("pojo") AGroupPermission pojo);

    int insertList(@Param("pojos") List<AGroupPermission> pojo);

    List<AGroupPermission> select(@Param("pojo") AGroupPermission pojo);

    int update(@Param("pojo") AGroupPermission pojo);

}
