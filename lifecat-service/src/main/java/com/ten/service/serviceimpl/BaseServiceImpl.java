package com.ten.service.serviceimpl;

import com.ten.service.service.BaseExecute;
import com.ten.service.service.BaseService;
import com.ten.utils.DateTimeUtil;
import org.slf4j.LoggerFactory;
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
public abstract class BaseServiceImpl<VO, DO> implements BaseService<VO>, BaseExecute<DO> {

    protected DateTimeUtil dateTimeUtil = DateTimeUtil.getInstance();

    /**
     * base mapper
     */
    @Autowired
    private Mapper<DO> mapper;

    /* **********************************/
    /* ********** base service***********/
    /* **********************************/

    /**
     * select all
     */
    @Override
    public abstract List<VO> all();

    /**
     * select list
     *
     * @param entity VO object
     */
    @Override
    public abstract List<VO> list(VO entity);

    /**
     * select
     *
     * @param entity VO object
     */
    @Override
    public abstract VO get(VO entity);

    /**
     * create
     *
     * @param entity VO object
     */
    @Override
    public abstract int create(VO entity);

    /**
     * update
     *
     * @param entity VO object
     */
    @Override
    public abstract int update(VO entity);

    /**
     * delete
     *
     * @param entity VO object
     */
    @Override
    public abstract int delete(VO entity);

    /* **********************************/
    /* ********** base execute***********/
    /* **********************************/

    /**
     * execute query all
     *
     * @return DO list
     */
    @Override
    public List<DO> exeQueryAll() {
        return mapper.selectAll();
    }

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