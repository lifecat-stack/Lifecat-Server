package com.ten.service.service;

import com.ten.entity.TestDO;
import com.ten.vo.TestVO;

/**
 * list   :测试-获取所有test信息
 * get    :测试-获取单条test信息
 * post   :测试-上传test
 * put    :测试-更新test
 * delete :测试-删除test
 *
 * @author Administrator
 */
public interface TestService extends BaseService<TestVO, TestDO> {
}
