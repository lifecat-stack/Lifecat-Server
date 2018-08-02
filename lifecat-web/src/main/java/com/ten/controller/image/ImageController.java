package com.ten.controller.image;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.manager.image.ImageServiceManager;
import com.ten.service.service.image.ImageService;
import com.ten.vo.ImageVO;
import com.ten.vo.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.ten.utils.ControllerCheckUtil.*;

/**
 * album
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/image")
public class ImageController extends BaseController<ImageVO, ResponseResult> {

    private final ImageServiceManager imageServiceManager;

    @Autowired
    public ImageController(ImageServiceManager imageServiceManager) {
        this.imageServiceManager = imageServiceManager;
    }

    /**
     * listById
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
     * create
     * <p>
     * 上传Image到相册
     *
     * @param entity ImageVO
     * @return result
     */
    @RequestMapping(method = RequestMethod.POST)
    @Override
    public ResponseResult post(@RequestBody ImageVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        int result = imageServiceManager.uploadImageToAlbum(entity);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    /**
     * update
     * <p>
     * 更新Image信息
     *
     * @param entity ImageVO
     * @return result
     */
    @RequestMapping(method = RequestMethod.PUT)
    @Override
    public ResponseResult put(@RequestBody ImageVO entity) {
        // check
        checkRequestDataNotNull(entity);
        // execute
        int result = imageServiceManager.updateImage(entity);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }


    /**
     * deleteById
     * <p>
     * 删除Image
     *
     * @param imageId image_id
     * @return result
     */
    @RequestMapping(value = "/{imageId}", method = RequestMethod.DELETE)
    @Override
    public ResponseResult deleteById(@PathVariable String imageId) {
        // check
        checkRequestDataNotNull(imageId);
        checkRequestDataFormatInt(imageId);
        // execute
        int id = Integer.parseInt(imageId);
        int result = imageServiceManager.deleteImageByPrimaryKey(id);
        // return
        checkExecuteResultSuccess(result);
        return new ResponseResult();
    }

    @Override
    public ResponseResult delete(ImageVO entity) {
        return null;
    }
}
