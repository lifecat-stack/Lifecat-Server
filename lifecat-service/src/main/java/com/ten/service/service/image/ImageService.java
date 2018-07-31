package com.ten.service.service.image;

import com.ten.entity.ImageDO;
import com.ten.service.service.BaseService;
import com.ten.vo.ImageVO;

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
