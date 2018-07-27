package com.ten.service.service;

import java.util.List;

/**
 * base service and type is VO-DO
 *
 * @author Administrator
 */
public interface BaseService<VO, DO> {
    /**
     * select list
     *
     * @param entity DO object
     */
    List<VO> list(DO entity);

    /**
     * select
     *
     * @param entity DO object
     */
    VO get(DO entity);

    /**
     * create
     *
     * @param entity DO object
     */
    int post(DO entity);

    /**
     * update
     *
     * @param entity DO object
     */
    int put(DO entity);

    /**
     * delete
     *
     * @param entity DO object
     */
    int delete(DO entity);
}
