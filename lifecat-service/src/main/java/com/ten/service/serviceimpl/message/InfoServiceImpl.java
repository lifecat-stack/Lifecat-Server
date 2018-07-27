package com.ten.service.serviceimpl.message;

import com.ten.entity.InfoDO;
import com.ten.service.service.message.InfoService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.InfoVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoServiceImpl extends BaseServiceImpl<InfoVO, InfoDO> implements InfoService {
    @Override
    public List<InfoVO> list(InfoDO entity) {
        return null;
    }

    @Override
    public InfoVO get(InfoDO entity) {
        return null;
    }

    @Override
    public int post(InfoDO entity) {
        return 0;
    }

    @Override
    public int put(InfoDO entity) {
        return 0;
    }

    @Override
    public int delete(InfoDO entity) {
        return 0;
    }
}
