package com.ten.lifecat.server.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.entity.ADynamicImage;
import com.ten.lifecat.server.mapper.ADynamicImageDao;

@Service
public class ADynamicImageService {

    @Resource
    private ADynamicImageDao aDynamicImageDao;

    public int insert(ADynamicImage pojo) {
        return aDynamicImageDao.insert(pojo);
    }

    public int insertList(List<ADynamicImage> pojos) {
        return aDynamicImageDao.insertList(pojos);
    }

    public List<ADynamicImage> select(ADynamicImage pojo) {
        return aDynamicImageDao.select(pojo);
    }

    public int update(ADynamicImage pojo) {
        return aDynamicImageDao.update(pojo);
    }

}
