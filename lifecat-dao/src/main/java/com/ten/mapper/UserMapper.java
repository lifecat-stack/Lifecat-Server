package com.ten.mapper;

import com.ten.entity.UserDO;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * c_user
 *
 * @author Administrator
 */
@Repository
public interface UserMapper extends Mapper<UserDO> {


}
