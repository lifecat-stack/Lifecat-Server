package com.ten.lifecat.server.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.ten.lifecat.server.entity.Info;

public interface InfoDao {

    int insert(@Param("pojo") Info pojo);

    int insertList(@Param("pojos") List<Info> pojo);

    List<Info> select(@Param("pojo") Info pojo);

    int update(@Param("pojo") Info pojo);

}
