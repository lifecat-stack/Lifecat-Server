package com.ten.controller.image;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.service.service.image.AlbumService;
import com.ten.vo.AlbumVO;
import com.ten.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * album
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/album")
public class AlbumController extends BaseController<AlbumVO, ResponseResult> {

    @Autowired
    private AlbumService albumService;

    @Override
    public ResponseResult list(AlbumVO entity) {
        return null;
    }

    @Override
    public ResponseResult get(AlbumVO entity) {
        return null;
    }

    @Override
    public ResponseResult post(AlbumVO entity) {
        return null;
    }

    @Override
    public ResponseResult put(AlbumVO entity) {
        return null;
    }

    @Override
    public ResponseResult delete(AlbumVO entity) {
        return null;
    }
}
