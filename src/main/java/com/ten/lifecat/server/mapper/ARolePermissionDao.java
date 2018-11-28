package com.ten.lifecat.server.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.ten.lifecat.server.entity.ARolePermission;

public interface ARolePermissionDao {

    int insert(@Param("pojo") ARolePermission pojo);

    int insertList(@Param("pojos") List<ARolePermission> pojo);

    List<ARolePermission> select(@Param("pojo") ARolePermission pojo);

    int update(@Param("pojo") ARolePermission pojo);

}
