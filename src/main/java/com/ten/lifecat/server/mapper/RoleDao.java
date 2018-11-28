package com.ten.lifecat.server.mapper;

import com.ten.lifecat.server.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDao {

    int insert(@Param("pojo") Role pojo);

    int insertList(@Param("pojos") List<Role> pojo);

    List<Role> select(@Param("pojo") Role pojo);

    int update(@Param("pojo") Role pojo);

}
