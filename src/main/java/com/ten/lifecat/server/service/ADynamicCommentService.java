package com.ten.lifecat.server.service;

import com.ten.lifecat.server.entity.ADynamicComment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.mapper.ADynamicCommentDao;

@Service
public class ADynamicCommentService {

    @Resource
    private ADynamicCommentDao aDynamicCommentDao;

    public int insert(ADynamicComment pojo) {
        return aDynamicCommentDao.insert(pojo);
    }

    public int insertList(List<ADynamicComment> pojos) {
        return aDynamicCommentDao.insertList(pojos);
    }

    public List<ADynamicComment> select(ADynamicComment pojo) {
        return aDynamicCommentDao.select(pojo);
    }

    public int update(ADynamicComment pojo) {
        return aDynamicCommentDao.update(pojo);
    }

}
