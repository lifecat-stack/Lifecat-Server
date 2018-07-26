package com.ten.mapper;

import com.ten.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * c_user
 *
 * @author Administrator
 */
@Component
@Mapper
public interface UserMapper {

    String getTest(String test);
}
