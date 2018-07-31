package com.ten.service.service;

import java.util.List;

/**
 * base service and type is VO
 *
 * @author Administrator
 */
public interface BaseService<VO> {
    /**
     * select all
     */
    List<VO> all();

    /**
     * select list
     *
     * @param entity VO object
     */
    List<VO> list(VO entity);

    /**
     * select
     *
     * @param entity VO object
     */
    VO get(VO entity);

    /**
     * create
     *
     * @param entity VO object
     */
    int create(VO entity);

    /**
     * update
     *
     * @param entity VO object
     */
    int update(VO entity);

    /**
     * delete
     *
     * @param entity VO object
     */
    int delete(VO entity);
}
