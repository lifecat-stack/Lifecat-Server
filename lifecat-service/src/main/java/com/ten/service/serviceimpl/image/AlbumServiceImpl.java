package com.ten.service.serviceimpl.image;

import com.ten.entity.AlbumDO;
import com.ten.service.service.image.AlbumService;
import com.ten.service.serviceimpl.BaseServiceImpl;
import com.ten.vo.AlbumVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * album service
 *
 * @author Administrator
 * @table c_album
 */
@Service
public class AlbumServiceImpl extends BaseServiceImpl<AlbumVO, AlbumDO> implements AlbumService {

    @Override
    public List<AlbumVO> all() {
        return null;
    }

    @Override
    public List<AlbumVO> list(AlbumVO entity) {
        return null;
    }

    @Override
    public AlbumVO get(AlbumVO entity) {
        return null;
    }

    @Override
    public int create(AlbumVO entity) {
        return 0;
    }

    @Override
    public int update(AlbumVO entity) {
        return 0;
    }

    @Override
    public int delete(AlbumVO entity) {
        return 0;
    }
}
