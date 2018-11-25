package com.ten.lifecat.serviceimpl.record;

import com.ten.lifecat.entity.entity.RecordPostDO;
import com.ten.lifecat.service.record.RecordPostService;
import com.ten.lifecat.serviceimpl.BaseServiceImpl;
import com.ten.lifecat.entity.vo.RecordPostVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * record post
 *
 * @author Administrator
 * @table c_record_post
 */
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
        RecordPostDO recordPostDO = new RecordPostDO(entity);
        recordPostDO.setPostId(null);
        return exeInsert(recordPostDO);
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
