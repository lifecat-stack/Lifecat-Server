package com.ten.lifecat.server.service;

import com.ten.lifecat.server.mapper.RecommendDynamicDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.entity.RecommendDynamic;

@Service
public class RecommendDynamicService {

    @Resource
    private RecommendDynamicDao recommendDynamicDao;

    public int insert(RecommendDynamic pojo) {
        return recommendDynamicDao.insert(pojo);
    }

    public int insertList(List<RecommendDynamic> pojos) {
        return recommendDynamicDao.insertList(pojos);
    }

    public List<RecommendDynamic> select(RecommendDynamic pojo) {
        return recommendDynamicDao.select(pojo);
    }

    public int update(RecommendDynamic pojo) {
        return recommendDynamicDao.update(pojo);
    }

}
