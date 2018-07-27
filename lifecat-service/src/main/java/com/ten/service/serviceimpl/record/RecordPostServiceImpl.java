package com.ten.service.serviceimpl.record;

import com.ten.entity.RecordPostDO;
import com.ten.service.service.record.RecordPostService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.PostVO;
import com.ten.vo.RecordVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordPostServiceImpl extends BaseServiceImpl<PostVO, RecordPostDO> implements RecordPostService {

    @Override
    public List<PostVO> list(RecordPostDO entity) {
        return null;
    }

    @Override
    public PostVO get(RecordPostDO entity) {
        return null;
    }

    @Override
    public int post(RecordPostDO entity) {
        return 0;
    }

    @Override
    public int put(RecordPostDO entity) {
        return 0;
    }

    @Override
    public int delete(RecordPostDO entity) {
        return 0;
    }
}
