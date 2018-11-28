package com.ten.lifecat.server.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.ten.lifecat.server.entity.AUserGroup;

public interface AUserGroupDao {

    int insert(@Param("pojo") AUserGroup pojo);

    int insertList(@Param("pojos") List<AUserGroup> pojo);

    List<AUserGroup> select(@Param("pojo") AUserGroup pojo);

    int update(@Param("pojo") AUserGroup pojo);

}
