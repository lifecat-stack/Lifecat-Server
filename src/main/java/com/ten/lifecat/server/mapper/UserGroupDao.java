package com.ten.lifecat.server.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.ten.lifecat.server.entity.UserGroup;

public interface UserGroupDao {

    int insert(@Param("pojo") UserGroup pojo);

    int insertList(@Param("pojos") List<UserGroup> pojo);

    List<UserGroup> select(@Param("pojo") UserGroup pojo);

    int update(@Param("pojo") UserGroup pojo);

}
