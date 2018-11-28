package com.ten.lifecat.server.mapper;

import com.ten.lifecat.server.entity.UserAccount;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAccountDao {

    int insert(@Param("pojo") UserAccount pojo);

    int insertList(@Param("pojos") List<UserAccount> pojo);

    List<UserAccount> select(@Param("pojo") UserAccount pojo);

    int update(@Param("pojo") UserAccount pojo);

}
