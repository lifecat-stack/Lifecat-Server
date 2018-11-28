package com.ten.lifecat.server.service;

import com.ten.lifecat.server.mapper.InfoDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.entity.Info;

@Service
public class InfoService {

    @Resource
    private InfoDao infoDao;

    public int insert(Info pojo) {
        return infoDao.insert(pojo);
    }

    public int insertList(List<Info> pojos) {
        return infoDao.insertList(pojos);
    }

    public List<Info> select(Info pojo) {
        return infoDao.select(pojo);
    }

    public int update(Info pojo) {
        return infoDao.update(pojo);
    }

}
