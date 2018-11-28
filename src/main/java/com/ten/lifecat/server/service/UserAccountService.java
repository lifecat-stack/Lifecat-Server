package com.ten.lifecat.server.service;

import com.ten.lifecat.server.entity.UserAccount;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.mapper.UserAccountDao;

@Service
public class UserAccountService {

    @Resource
    private UserAccountDao userAccountDao;

    public int insert(UserAccount pojo) {
        return userAccountDao.insert(pojo);
    }

    public int insertList(List<UserAccount> pojos) {
        return userAccountDao.insertList(pojos);
    }

    public List<UserAccount> select(UserAccount pojo) {
        return userAccountDao.select(pojo);
    }

    public int update(UserAccount pojo) {
        return userAccountDao.update(pojo);
    }

}
