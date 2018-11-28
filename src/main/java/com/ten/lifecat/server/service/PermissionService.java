package com.ten.lifecat.server.service;

import com.ten.lifecat.server.entity.Permission;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.mapper.PermissionDao;

@Service
public class PermissionService {

    @Resource
    private PermissionDao permissionDao;

    public int insert(Permission pojo) {
        return permissionDao.insert(pojo);
    }

    public int insertList(List<Permission> pojos) {
        return permissionDao.insertList(pojos);
    }

    public List<Permission> select(Permission pojo) {
        return permissionDao.select(pojo);
    }

    public int update(Permission pojo) {
        return permissionDao.update(pojo);
    }

}
