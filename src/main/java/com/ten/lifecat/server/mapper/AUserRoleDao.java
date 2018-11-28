package com.ten.lifecat.server.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.ten.lifecat.server.entity.AUserRole;

public interface AUserRoleDao {

    int insert(@Param("pojo") AUserRole pojo);

    int insertList(@Param("pojos") List<AUserRole> pojo);

    List<AUserRole> select(@Param("pojo") AUserRole pojo);

    int update(@Param("pojo") AUserRole pojo);

}
