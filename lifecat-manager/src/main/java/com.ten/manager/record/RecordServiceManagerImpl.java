package com.ten.manager.record;

import com.ten.service.service.record.RecordCommentService;
import com.ten.service.service.record.RecordPostService;
import com.ten.service.service.record.RecordService;
import com.ten.vo.RecordCommentVO;
import com.ten.vo.RecordPostVO;
import com.ten.vo.RecordVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * record manager for :
 * record service
 * record create service
 * record comment service
 *
 * @author Administrator
 */
@Service
public class RecordServiceManagerImpl implements RecordServiceManager {

    private final RecordService recordService;
    private final RecordPostService postService;
    private final RecordCommentService commentService;

    @Autowired
    public RecordServiceManagerImpl(RecordService recordService, RecordPostService postService, RecordCommentService commentService) {
        this.recordService = recordService;
        this.postService = postService;
        this.commentService = commentService;
    }

    @Override
    public List<RecordVO> getUserRecordListByUserId(Integer userId) {
        // 1.获取record list
        RecordVO entity = new RecordVO();
        entity.setUserId(userId);
        List<RecordVO> recordVOList = recordService.list(entity);

        // 2.根据record获取对应post,comments
        for (RecordVO record : recordVOList) {
            setPostByPostId(record);
            setCommentsByRecordId(record);
        }

        return recordVOList;
    }

    @Override
    public RecordVO getRecordByEntity(RecordVO entity) {
        RecordVO recordVO = recordService.get(entity);
        setPostByPostId(recordVO);
        setCommentsByRecordId(recordVO);
        return recordVO;
    }

    @Override
    public int createRecord(RecordVO entity) {
        int result1 = recordService.create(entity);
        int result2 = postService.create(entity.getPost());
        return result1 > 0 ? (result2 > 0 ? 1 : 0) : 0;
    }

    @Override
    public int deleteRecordByPrimaryKey(Integer recordId) {
        RecordVO entity = new RecordVO();
        entity.setRecordId(recordId);
        return recordService.delete(entity);
    }

    @Override
    public int updateRecord(RecordVO entity) {
        int result1 = recordService.update(entity);
        int result2 = postService.update(entity.getPost());
        return result1 > 0 ? (result2 > 0 ? 1 : 0) : 0;
    }

    @Override
    public int createRecordComment(RecordCommentVO entity) {
        return commentService.create(entity);
    }

    @Override
    public int updateRecordComment(RecordCommentVO entity) {
        return commentService.update(entity);
    }

    @Override
    public int deleteRecordCommentByPrimaryKey(Integer commentId) {
        RecordCommentVO entity = new RecordCommentVO();
        entity.setCommentId(commentId);
        return commentService.delete(entity);
    }

    /**
     * 为RecordVO设置Post属性
     *
     * @param record RecordVO
     */
    private void setPostByPostId(RecordVO record) {
        int postId = record.getPostId();
        RecordPostVO entity = new RecordPostVO();
        entity.setPostId(postId);
        RecordPostVO recordPostVO = postService.get(entity);
        record.setPost(recordPostVO);
    }

    /**
     * 为RecordVO设置Comments属性
     *
     * @param record RecordVO
     */
    private void setCommentsByRecordId(RecordVO record) {
        int recordId = record.getRecordId();
        RecordCommentVO entity = new RecordCommentVO();
        entity.setCommentRecordId(recordId);
        List<RecordCommentVO> commentVOS = commentService.list(entity);
        record.setComments(commentVOS);
    }
}
