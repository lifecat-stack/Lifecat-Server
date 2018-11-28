package com.ten.lifecat.server.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.ten.lifecat.server.entity.Dynamic;

public interface DynamicDao {

    int insert(@Param("pojo") Dynamic pojo);

    int insertList(@Param("pojos") List<Dynamic> pojo);

    List<Dynamic> select(@Param("pojo") Dynamic pojo);

    int update(@Param("pojo") Dynamic pojo);

}
