package com.ten.lifecat.server.service;

import com.ten.lifecat.server.mapper.AUserGroupDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.entity.AUserGroup;

@Service
public class AUserGroupService {

    @Resource
    private AUserGroupDao aUserGroupDao;

    public int insert(AUserGroup pojo) {
        return aUserGroupDao.insert(pojo);
    }

    public int insertList(List<AUserGroup> pojos) {
        return aUserGroupDao.insertList(pojos);
    }

    public List<AUserGroup> select(AUserGroup pojo) {
        return aUserGroupDao.select(pojo);
    }

    public int update(AUserGroup pojo) {
        return aUserGroupDao.update(pojo);
    }

}
