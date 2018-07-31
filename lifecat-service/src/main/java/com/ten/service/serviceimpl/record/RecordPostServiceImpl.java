package com.ten.service.serviceimpl.record;

import com.ten.entity.RecordPostDO;
import com.ten.service.service.record.RecordPostService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.RecordPostVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordPostServiceImpl extends BaseServiceImpl<RecordPostVO, RecordPostDO> implements RecordPostService {

    @Override
    public List<RecordPostVO> all() {
        return null;
    }

    @Override
    public List<RecordPostVO> list(RecordPostVO entity) {
        return null;
    }

    @Override
    public RecordPostVO get(RecordPostVO entity) {
        return null;
    }

    @Override
    public int create(RecordPostVO entity) {
        return 0;
    }

    @Override
    public int update(RecordPostVO entity) {
        return 0;
    }

    @Override
    public int delete(RecordPostVO entity) {
        return 0;
    }
}
