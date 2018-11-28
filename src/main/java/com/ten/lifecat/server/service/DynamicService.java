package com.ten.lifecat.server.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.entity.Dynamic;
import com.ten.lifecat.server.mapper.DynamicDao;

@Service
public class DynamicService {

    @Resource
    private DynamicDao dynamicDao;

    public int insert(Dynamic pojo) {
        return dynamicDao.insert(pojo);
    }

    public int insertList(List<Dynamic> pojos) {
        return dynamicDao.insertList(pojos);
    }

    public List<Dynamic> select(Dynamic pojo) {
        return dynamicDao.select(pojo);
    }

    public int update(Dynamic pojo) {
        return dynamicDao.update(pojo);
    }

}
