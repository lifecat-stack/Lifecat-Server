package com.ten.lifecat.server.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.ten.lifecat.server.entity.Log;

public interface LogDao {

    int insert(@Param("pojo") Log pojo);

    int insertList(@Param("pojos") List<Log> pojo);

    List<Log> select(@Param("pojo") Log pojo);

    int update(@Param("pojo") Log pojo);

}
