package com.ten.manager.message;

import com.ten.vo.InfoVO;
import com.ten.vo.LogVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceManagerImpl implements MessageServiceManager{
    @Override
    public List<InfoVO> getInfoListByUserId(Integer userId) {
        return null;
    }

    @Override
    public int deleteInfoByPrimaryKey(Integer infoId) {
        return 0;
    }

    @Override
    public List<LogVO> getAllLogs() {
        return null;
    }
}
