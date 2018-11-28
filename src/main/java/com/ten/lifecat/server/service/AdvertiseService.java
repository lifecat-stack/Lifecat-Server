package com.ten.lifecat.server.service;

import com.ten.lifecat.server.entity.Advertise;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.mapper.AdvertiseDao;

@Service
public class AdvertiseService {

    @Resource
    private AdvertiseDao advertiseDao;

    public int insert(Advertise pojo) {
        return advertiseDao.insert(pojo);
    }

    public int insertList(List<Advertise> pojos) {
        return advertiseDao.insertList(pojos);
    }

    public List<Advertise> select(Advertise pojo) {
        return advertiseDao.select(pojo);
    }

    public int update(Advertise pojo) {
        return advertiseDao.update(pojo);
    }

}
