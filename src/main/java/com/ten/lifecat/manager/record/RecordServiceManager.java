package com.ten.lifecat.manager.record;

import com.ten.lifecat.entity.vo.AlbumVO;
import com.ten.lifecat.entity.vo.RecordCommentVO;
import com.ten.lifecat.entity.vo.RecordVO;

import java.util.List;

/**
 * Record模块管理器
 *
 * @author Administrator
 */
public interface RecordServiceManager {

    /* **********************************/
    /* ************ record **************/
    /* **********************************/

    List<RecordVO> getUserRecordListByUserId(Integer userId);

    RecordVO getRecordByEntity(RecordVO entity);

    int createRecord(RecordVO entity);

    int deleteRecordByPrimaryKey(Integer recordId);

    int updateRecord(RecordVO entity);

    /* **********************************/
    /* ************ comment *************/
    /* **********************************/

    int createRecordComment(RecordCommentVO entity);

    int updateRecordComment(RecordCommentVO entity);

    int deleteRecordCommentByPrimaryKey(Integer commentId);
}
