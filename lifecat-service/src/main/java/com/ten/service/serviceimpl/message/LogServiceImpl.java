package com.ten.service.serviceimpl.message;

import com.ten.entity.LogDO;
import com.ten.service.service.message.LogService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.LogVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl extends BaseServiceImpl<LogVO, LogDO> implements LogService {
    @Override
    public List<LogVO> list(LogDO entity) {
        return null;
    }

    @Override
    public LogVO get(LogDO entity) {
        return null;
    }

    @Override
    public int post(LogDO entity) {
        return 0;
    }

    @Override
    public int put(LogDO entity) {
        return 0;
    }

    @Override
    public int delete(LogDO entity) {
        return 0;
    }
}
