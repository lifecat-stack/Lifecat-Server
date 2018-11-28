package com.ten.lifecat.server.service;

import com.ten.lifecat.server.entity.UserFavorite;
import com.ten.lifecat.server.mapper.UserFavoriteDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserFavoriteService {

    @Resource
    private UserFavoriteDao userFavoriteDao;

    public int insert(UserFavorite pojo){
        return userFavoriteDao.insert(pojo);
    }

    public int insertList(List< UserFavorite> pojos){
        return userFavoriteDao.insertList(pojos);
    }

    public List<UserFavorite> select(UserFavorite pojo){
        return userFavoriteDao.select(pojo);
    }

    public int update(UserFavorite pojo){
        return userFavoriteDao.update(pojo);
    }

}
