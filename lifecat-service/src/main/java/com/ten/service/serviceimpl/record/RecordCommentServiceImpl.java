package com.ten.service.serviceimpl.record;

import com.ten.entity.RecordCommentDO;
import com.ten.service.service.record.RecordCommentService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.RecordCommentVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * record service
 *
 * @author Administrator
 * @table c_record_comment
 */
@Service
public class RecordCommentServiceImpl extends BaseServiceImpl<RecordCommentVO, RecordCommentDO> implements RecordCommentService {


    @Override
    public List<RecordCommentVO> all() {
        return null;
    }

    @Override
    public List<RecordCommentVO> list(RecordCommentVO entity) {
        return null;
    }

    @Override
    public RecordCommentVO get(RecordCommentVO entity) {
        return null;
    }

    @Override
    public int create(RecordCommentVO entity) {
        RecordCommentDO recordCommentDO = new RecordCommentDO(entity);
        recordCommentDO.setCommentId(null);
        return exeInsert(recordCommentDO);
    }

    @Override
    public int update(RecordCommentVO entity) {
        return 0;
    }

    @Override
    public int delete(RecordCommentVO entity) {
        return 0;
    }
}
