package com.ten.lifecat.server.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.entity.RecommendUser;
import com.ten.lifecat.server.mapper.RecommendUserDao;

@Service
public class RecommendUserService {

    @Resource
    private RecommendUserDao recommendUserDao;

    public int insert(RecommendUser pojo) {
        return recommendUserDao.insert(pojo);
    }

    public int insertList(List<RecommendUser> pojos) {
        return recommendUserDao.insertList(pojos);
    }

    public List<RecommendUser> select(RecommendUser pojo) {
        return recommendUserDao.select(pojo);
    }

    public int update(RecommendUser pojo) {
        return recommendUserDao.update(pojo);
    }

}
