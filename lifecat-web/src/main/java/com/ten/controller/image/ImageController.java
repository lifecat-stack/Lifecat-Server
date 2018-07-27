package com.ten.controller.image;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.service.service.image.ImageService;
import com.ten.vo.ImageVO;
import com.ten.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * image
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/image")
public class ImageController extends BaseController<ImageVO, ResponseResult> {

    @Autowired
    private ImageService imageService;

    /**
     * list
     */
    @Override
    public ResponseResult list(ImageVO entity) {
        return null;
    }

    /**
     * get
     */
    @Override
    public ResponseResult get(ImageVO entity) {
        return null;
    }

    /**
     * post
     */
    @Override
    public ResponseResult post(ImageVO entity) {
        return null;
    }

    /**
     * put
     */
    @Override
    public ResponseResult put(ImageVO entity) {
        return null;
    }

    /**
     * delete
     */
    @Override
    public ResponseResult delete(ImageVO entity) {
        return null;
    }
}
