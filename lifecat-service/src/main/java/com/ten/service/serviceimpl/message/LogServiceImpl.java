package com.ten.service.serviceimpl.message;

import com.ten.entity.LogDO;
import com.ten.service.service.message.LogService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.LogVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * log service
 *
 * @author Administrator
 * @table c_log
 */
@Service
public class LogServiceImpl extends BaseServiceImpl<LogVO, LogDO> implements LogService {

    @Override
    public List<LogVO> all() {
        return null;
    }

    @Override
    public List<LogVO> list(LogVO entity) {
        return null;
    }

    @Override
    public LogVO get(LogVO entity) {
        return null;
    }

    @Override
    public int create(LogVO entity) {
        return 0;
    }

    @Override
    public int update(LogVO entity) {
        return 0;
    }

    @Override
    public int delete(LogVO entity) {
        return 0;
    }
}
