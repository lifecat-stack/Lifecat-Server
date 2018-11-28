package com.ten.lifecat.server.mapper;

import com.ten.lifecat.server.entity.ADynamicComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ADynamicCommentDao {

    int insert(@Param("pojo") ADynamicComment pojo);

    int insertList(@Param("pojos") List<ADynamicComment> pojo);

    List<ADynamicComment> select(@Param("pojo") ADynamicComment pojo);

    int update(@Param("pojo") ADynamicComment pojo);

}
