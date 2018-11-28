package com.ten.lifecat.server.service;

import com.ten.lifecat.server.mapper.CommentDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.ten.lifecat.server.entity.Comment;

@Service
public class CommentService {

    @Resource
    private CommentDao commentDao;

    public int insert(Comment pojo) {
        return commentDao.insert(pojo);
    }

    public int insertList(List<Comment> pojos) {
        return commentDao.insertList(pojos);
    }

    public List<Comment> select(Comment pojo) {
        return commentDao.select(pojo);
    }

    public int update(Comment pojo) {
        return commentDao.update(pojo);
    }

}
