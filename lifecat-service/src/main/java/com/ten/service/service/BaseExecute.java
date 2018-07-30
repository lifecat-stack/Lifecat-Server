package com.ten.service.service;

import java.util.List;

/**
 * base service execute and type is DO
 *
 * @author Administrator
 */
public interface BaseExecute<DO> {
    /**
     * execute query all
     *
     * @return DO list
     */
    List<DO> exeQueryAll();

    /**
     * execute query list
     *
     * @param entity DO object
     * @return DO list
     */
    List<DO> exeQueryList(DO entity);

    /**
     * execute query one
     *
     * @param entity DO object
     * @return DO DO object
     */
    DO exeQuery(DO entity);

    /**
     * execute insert by selective
     *
     * @param entity DO object
     * @return int flag
     */
    int exeInsert(DO entity);

    /**
     * execute update by primarykey and selective
     *
     * @param entity DO object
     * @return int flag
     */
    int exeUpdate(DO entity);

    /**
     * execute delete by primary key
     *
     * @param entity DO object
     * @return int flag
     */
    int exeDelete(DO entity);
}
