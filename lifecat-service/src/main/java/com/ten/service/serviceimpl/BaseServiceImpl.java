package com.ten.service.serviceimpl;

import com.ten.service.service.BaseExecute;
import com.ten.service.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * support base service to child, and child must impl the abstact service methods
 * support base execute to child, and child can run them directly, they can execute mapper
 * the VO type is view-object, which is support to front
 * thi DO type is data-object, which is support to mapper
 *
 * @author Administrator
 * @see BaseService,BaseExecute
 */
public abstract class BaseServiceImpl<VO, DO> implements BaseService<VO, DO>, BaseExecute<DO> {
    /**
     * base mapper
     */
    @Autowired
    private Mapper<DO> mapper;

    /* **********************************/
    /* ********** base service***********/
    /* **********************************/

    /**
     * select list
     *
     * @param entity DO object
     */
    @Override
    public abstract List<VO> list(DO entity);

    /**
     * select
     *
     * @param entity DO object
     */
    @Override
    public abstract VO get(DO entity);

    /**
     * create
     *
     * @param entity DO object
     */
    @Override
    public abstract int post(DO entity);

    /**
     * update
     *
     * @param entity DO object
     */
    @Override
    public abstract int put(DO entity);

    /**
     * delete
     *
     * @param entity DO object
     */
    @Override
    public abstract int delete(DO entity);

    /* **********************************/
    /* ********** base execute***********/
    /* **********************************/

    /**
     * execute query list
     *
     * @param entity DO object
     * @return DO list
     */
    @Override
    public List<DO> exeQueryList(DO entity) {
        return mapper.select(entity);
    }

    /**
     * execute query one
     *
     * @param entity DO object
     * @return DO DO object
     */
    @Override
    public DO exeQuery(DO entity) {
        return mapper.selectOne(entity);
    }

    /**
     * execute insert by selective
     *
     * @param entity DO object
     * @return int flag
     */
    @Override
    public int exeInsert(DO entity) {
        return mapper.insertSelective(entity);
    }

    /**
     * execute update by primarykey and selective
     *
     * @param entity DO object
     * @return int flag
     */
    @Override
    public int exeUpdate(DO entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    /**
     * execute delete by primary key
     *
     * @param entity DO object
     * @return int flag
     */
    @Override
    public int exeDelete(DO entity) {
        return mapper.deleteByPrimaryKey(entity);
    }

}