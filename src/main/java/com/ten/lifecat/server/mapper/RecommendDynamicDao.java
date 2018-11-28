package com.ten.lifecat.server.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.ten.lifecat.server.entity.RecommendDynamic;

public interface RecommendDynamicDao {

    int insert(@Param("pojo") RecommendDynamic pojo);

    int insertList(@Param("pojos") List<RecommendDynamic> pojo);

    List<RecommendDynamic> select(@Param("pojo") RecommendDynamic pojo);

    int update(@Param("pojo") RecommendDynamic pojo);

}
