package com.ten.manager.record;

import com.ten.service.service.record.RecordCommentService;
import com.ten.service.service.record.RecordPostService;
import com.ten.service.service.record.RecordService;
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

    private final RecordService recordService;
    private final RecordPostService recordPostService;
    private final RecordCommentService recordCommentService;

    @Autowired
    public RecordServiceManagerImpl(RecordService recordService,
                                    RecordPostService recordPostService,
                                    RecordCommentService recordCommentService) {
        this.recordService = recordService;
        this.recordPostService = recordPostService;
        this.recordCommentService = recordCommentService;
    }

    @Override
    public List<RecordVO> getUserRecordListByUserId(int userId) {
        RecordVO record = new RecordVO();
        record.setUserId(userId);
        List<RecordVO> recordVOS = recordService.list(record);
        for (RecordVO recordVO:recordVOS){
        }
        return null;
    }
}
