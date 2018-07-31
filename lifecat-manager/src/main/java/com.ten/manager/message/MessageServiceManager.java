package com.ten.manager.message;

import com.ten.vo.AlbumVO;
import com.ten.vo.InfoVO;
import com.ten.vo.LogVO;

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
