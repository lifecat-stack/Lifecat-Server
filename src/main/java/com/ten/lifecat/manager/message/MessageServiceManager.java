package com.ten.lifecat.manager.message;

import com.ten.lifecat.entity.vo.AlbumVO;
import com.ten.lifecat.entity.vo.InfoVO;
import com.ten.lifecat.entity.vo.LogVO;

import java.util.List;

/**
 * 通知信息模块管理器
 *
 * @author Administrator
 */
public interface MessageServiceManager {

    /* **********************************/
    /* ************* info  **************/
    /* **********************************/

    List<InfoVO> getInfoListByUserId(Integer userId);

    int deleteInfoByPrimaryKey(Integer infoId);

    /* **********************************/
    /* ************* log   **************/
    /* **********************************/

    List<LogVO> getAllLogs();
}
