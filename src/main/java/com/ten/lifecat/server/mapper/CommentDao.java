package com.ten.lifecat.server.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.ten.lifecat.server.entity.Comment;

public interface CommentDao {

    int insert(@Param("pojo") Comment pojo);

    int insertList(@Param("pojos") List<Comment> pojo);

    List<Comment> select(@Param("pojo") Comment pojo);

    int update(@Param("pojo") Comment pojo);

}
