package com.ten.service.serviceimpl.record;

import com.ten.entity.RecordCommentDO;
import com.ten.service.service.record.RecordCommentService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.CommentVO;
import com.ten.vo.RecordVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordCommentServiceImpl extends BaseServiceImpl<CommentVO, RecordCommentDO> implements RecordCommentService {


    @Override
    public List<CommentVO> list(CommentVO entity) {
        return null;
    }

    @Override
    public CommentVO get(CommentVO entity) {
        return null;
    }

    @Override
    public int post(CommentVO entity) {
        return 0;
    }

    @Override
    public int put(CommentVO entity) {
        return 0;
    }

    @Override
    public int delete(CommentVO entity) {
        return 0;
    }
}
