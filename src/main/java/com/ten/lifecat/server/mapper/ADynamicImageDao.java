package com.ten.lifecat.server.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.ten.lifecat.server.entity.ADynamicImage;

public interface ADynamicImageDao {

    int insert(@Param("pojo") ADynamicImage pojo);

    int insertList(@Param("pojos") List<ADynamicImage> pojo);

    List<ADynamicImage> select(@Param("pojo") ADynamicImage pojo);

    int update(@Param("pojo") ADynamicImage pojo);

}
