package com.ten.lifecat.server.service;

import com.ten.lifecat.server.mapper.AUserRoleDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.entity.AUserRole;

@Service
public class AUserRoleService {

    @Resource
    private AUserRoleDao aUserRoleDao;

    public int insert(AUserRole pojo) {
        return aUserRoleDao.insert(pojo);
    }

    public int insertList(List<AUserRole> pojos) {
        return aUserRoleDao.insertList(pojos);
    }

    public List<AUserRole> select(AUserRole pojo) {
        return aUserRoleDao.select(pojo);
    }

    public int update(AUserRole pojo) {
        return aUserRoleDao.update(pojo);
    }

}
