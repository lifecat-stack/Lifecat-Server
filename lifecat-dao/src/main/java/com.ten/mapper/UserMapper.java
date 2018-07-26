package com.ten.mapper;

import com.ten.entity.UserDO;
import org.apache.ibatis.annotations.Select;

/**
 * c_user
 *
 * @author Administrator
 */

public interface UserMapper {

    @Select("select user form user where user_id = #{userId}")
    UserDO getUserById(Integer userId);
}
