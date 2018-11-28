package com.ten.lifecat.server.mapper;

import com.ten.lifecat.server.entity.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PermissionDao {

    int insert(@Param("pojo") Permission pojo);

    int insertList(@Param("pojos") List<Permission> pojo);

    List<Permission> select(@Param("pojo") Permission pojo);

    int update(@Param("pojo") Permission pojo);

}
