package com.ten.lifecat.server.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.ten.lifecat.server.entity.UserFavorite;

public interface UserFavoriteDao {

    int insert(@Param("pojo") UserFavorite pojo);

    int insertList(@Param("pojos") List< UserFavorite> pojo);

    List<UserFavorite> select(@Param("pojo") UserFavorite pojo);

    int update(@Param("pojo") UserFavorite pojo);

}
