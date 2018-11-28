package com.ten.lifecat.server.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.entity.AGroupPermission;
import com.ten.lifecat.server.mapper.AGroupPermissionDao;

@Service
public class AGroupPermissionService {

    @Resource
    private AGroupPermissionDao aGroupPermissionDao;

    public int insert(AGroupPermission pojo) {
        return aGroupPermissionDao.insert(pojo);
    }

    public int insertList(List<AGroupPermission> pojos) {
        return aGroupPermissionDao.insertList(pojos);
    }

    public List<AGroupPermission> select(AGroupPermission pojo) {
        return aGroupPermissionDao.select(pojo);
    }

    public int update(AGroupPermission pojo) {
        return aGroupPermissionDao.update(pojo);
    }

}
