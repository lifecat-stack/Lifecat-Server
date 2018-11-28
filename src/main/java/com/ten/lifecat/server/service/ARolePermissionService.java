package com.ten.lifecat.server.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.entity.ARolePermission;
import com.ten.lifecat.server.mapper.ARolePermissionDao;

@Service
public class ARolePermissionService {

    @Resource
    private ARolePermissionDao aRolePermissionDao;

    public int insert(ARolePermission pojo) {
        return aRolePermissionDao.insert(pojo);
    }

    public int insertList(List<ARolePermission> pojos) {
        return aRolePermissionDao.insertList(pojos);
    }

    public List<ARolePermission> select(ARolePermission pojo) {
        return aRolePermissionDao.select(pojo);
    }

    public int update(ARolePermission pojo) {
        return aRolePermissionDao.update(pojo);
    }

}
