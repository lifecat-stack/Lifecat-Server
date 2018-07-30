package com.ten.manager.record;

import com.ten.vo.RecordVO;

import java.util.List;

/**
 * manager for :
 * record service
 * record post service
 * record comment service
 *
 * @author Administrator
 */
public interface RecordServiceManager {

    List<RecordVO> getUserRecordListByUserId(int userId);
}
