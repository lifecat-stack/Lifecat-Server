package com.ten.mapper;

import com.ten.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * c_user
 *
 * @author Administrator
 */
@Repository
public interface UserMapper {

    @Select("select user form user where user_id = #{userId}")
    UserDO getUserById(Integer userId);
}
