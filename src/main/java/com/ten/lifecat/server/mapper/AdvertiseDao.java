package com.ten.lifecat.server.mapper;

import com.ten.lifecat.server.entity.Advertise;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdvertiseDao {

    int insert(@Param("pojo") Advertise pojo);

    int insertList(@Param("pojos") List<Advertise> pojo);

    List<Advertise> select(@Param("pojo") Advertise pojo);

    int update(@Param("pojo") Advertise pojo);

}
