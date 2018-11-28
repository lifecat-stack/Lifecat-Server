package com.ten.lifecat.server.service;

import com.ten.lifecat.server.entity.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.mapper.RoleDao;

@Service
public class RoleService {

    @Resource
    private RoleDao roleDao;

    public int insert(Role pojo) {
        return roleDao.insert(pojo);
    }

    public int insertList(List<Role> pojos) {
        return roleDao.insertList(pojos);
    }

    public List<Role> select(Role pojo) {
        return roleDao.select(pojo);
    }

    public int update(Role pojo) {
        return roleDao.update(pojo);
    }

}
