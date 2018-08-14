package com.ten.controller.wxcontroller;

import com.ten.controller.BaseController;
import com.ten.dto.ResponseResult;
import com.ten.manager.image.ImageServiceManager;
import com.ten.vo.AlbumVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.ten.check.ControllerCheckUtil.checkRequestDataNotNull;

/**
 * wechat controller
 * <p>
 * TODO
 *
 * @author wshten
 * @date 2018/8/2 0002
 */
@RestController
@RequestMapping(value = "/wx/album")
public class WxAlbumController extends BaseController<AlbumVO, ResponseResult> {

    private static Logger logger = LoggerFactory.getLogger(WxAlbumController.class);

    private final ImageServiceManager imageServiceManager;

    @Autowired
    public WxAlbumController(ImageServiceManager imageServiceManager) {
        this.imageServiceManager = imageServiceManager;
    }

    /**
     * 获取用户所有Album
     *
     * @param id user_id
     */
    @RequestMapping(value = "/list/{userId}", method = RequestMethod.GET)
    @Override
    public ResponseResult listByUrl(@PathVariable String id) {
        return super.listByUrl(id);
    }

    /**
     * 获取Album
     *
     * @param id album_id
     */
    @RequestMapping(value = "/get/{albumId}", method = RequestMethod.GET)
    @Override
    public ResponseResult getByUrl(String id) {
        return super.getByUrl(id);
    }

    /**
     * 创建Album
     *
     * @param entity Album
     */
    @RequestMapping(method = RequestMethod.POST)
    @Override
    public ResponseResult add(AlbumVO entity) {
        return super.add(entity);
    }

    /**
     * 删除Album
     *
     * @param id album_id
     */
    @RequestMapping(value = "/{albumId}", method = RequestMethod.DELETE)
    @Override
    public ResponseResult deleteByUrl(String id) {
        return super.deleteByUrl(id);
    }
}
