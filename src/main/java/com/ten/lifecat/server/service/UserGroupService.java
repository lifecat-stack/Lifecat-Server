package com.ten.lifecat.server.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.entity.UserGroup;
import com.ten.lifecat.server.mapper.UserGroupDao;

@Service
public class UserGroupService {

    @Resource
    private UserGroupDao userGroupDao;

    public int insert(UserGroup pojo) {
        return userGroupDao.insert(pojo);
    }

    public int insertList(List<UserGroup> pojos) {
        return userGroupDao.insertList(pojos);
    }

    public List<UserGroup> select(UserGroup pojo) {
        return userGroupDao.select(pojo);
    }

    public int update(UserGroup pojo) {
        return userGroupDao.update(pojo);
    }

}
