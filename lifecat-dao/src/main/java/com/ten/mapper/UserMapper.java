package com.ten.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * c_user
 *
 * @author Administrator
 */
@Repository
public interface UserMapper {
    String getTest(String test);
}
