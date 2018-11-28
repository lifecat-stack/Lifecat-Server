package com.ten.lifecat.server.service;

import com.ten.lifecat.server.mapper.ImageDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.entity.Image;

@Service
public class ImageService {

    @Resource
    private ImageDao imageDao;

    public int insert(Image pojo) {
        return imageDao.insert(pojo);
    }

    public int insertList(List<Image> pojos) {
        return imageDao.insertList(pojos);
    }

    public List<Image> select(Image pojo) {
        return imageDao.select(pojo);
    }

    public int update(Image pojo) {
        return imageDao.update(pojo);
    }

}
