package com.ten.manager.record;

import com.ten.service.service.record.RecordCommentService;
import com.ten.service.service.record.RecordPostService;
import com.ten.service.service.record.RecordService;
import com.ten.vo.RecordCommentVO;
import com.ten.vo.RecordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * record manager for :
 * record service
 * record post service
 * record comment service
 *
 * @author Administrator
 */
@Service
public class RecordServiceManagerImpl implements RecordServiceManager {


    @Override
    public List<RecordVO> getUserRecordListByUserId(Integer userId) {
        return null;
    }

    @Override
    public RecordVO getRecordByEntity(RecordVO entity) {
        return null;
    }

    @Override
    public int createRecord(RecordVO entity) {
        return 0;
    }

    @Override
    public int deleteRecordByPrimaryKey(Integer recordId) {
        return 0;
    }

    @Override
    public int updateRecord(RecordVO entity) {
        return 0;
    }

    @Override
    public int createRecordComment(RecordCommentVO entity) {
        return 0;
    }

    @Override
    public int updateRecordComment(RecordCommentVO entity) {
        return 0;
    }

    @Override
    public int deleteRecordCommentByPrimaryKey(Integer id) {
        return 0;
    }
}
