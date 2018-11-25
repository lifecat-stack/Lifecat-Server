package com.ten.lifecat.service.image;

import com.ten.lifecat.entity.entity.ImageDO;
import com.ten.lifecat.service.BaseService;
import com.ten.lifecat.entity.vo.ImageVO;

/**
 * list   :获取用户的album的c_image集合
 * get    :获取用户的album中的单个c_image
 * create :添加c_image到用户的album
 * update :更新c_image信息
 * delete :删除c_image
 *
 * @author Administrator
 */
public interface ImageService extends BaseService<ImageVO> {
}
