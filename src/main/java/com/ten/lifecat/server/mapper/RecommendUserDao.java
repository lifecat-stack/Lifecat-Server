package com.ten.lifecat.server.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.ten.lifecat.server.entity.RecommendUser;

public interface RecommendUserDao {

    int insert(@Param("pojo") RecommendUser pojo);

    int insertList(@Param("pojos") List<RecommendUser> pojo);

    List<RecommendUser> select(@Param("pojo") RecommendUser pojo);

    int update(@Param("pojo") RecommendUser pojo);

}
