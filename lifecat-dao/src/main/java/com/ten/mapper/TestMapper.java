package com.ten.mapper;

import com.ten.entity.TestDO;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * c_test
 *
 * @author Administrator
 */
@Repository
public interface TestMapper extends Mapper<TestDO> {
}
