package com.ten.service.serviceimpl.image;

import com.ten.entity.AlbumDO;
import com.ten.service.service.image.AlbumService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.AlbumVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl extends BaseServiceImpl<AlbumVO, AlbumDO> implements AlbumService {
    @Override
    public List<AlbumVO> list(AlbumDO entity) {
        return null;
    }

    @Override
    public AlbumVO get(AlbumDO entity) {
        return null;
    }

    @Override
    public int post(AlbumDO entity) {
        return 0;
    }

    @Override
    public int put(AlbumDO entity) {
        return 0;
    }

    @Override
    public int delete(AlbumDO entity) {
        return 0;
    }
}
