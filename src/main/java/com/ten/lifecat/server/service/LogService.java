package com.ten.lifecat.server.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.entity.Log;
import com.ten.lifecat.server.mapper.LogDao;

@Service
public class LogService {

    @Resource
    private LogDao logDao;

    public int insert(Log pojo) {
        return logDao.insert(pojo);
    }

    public int insertList(List<Log> pojos) {
        return logDao.insertList(pojos);
    }

    public List<Log> select(Log pojo) {
        return logDao.select(pojo);
    }

    public int update(Log pojo) {
        return logDao.update(pojo);
    }

}
