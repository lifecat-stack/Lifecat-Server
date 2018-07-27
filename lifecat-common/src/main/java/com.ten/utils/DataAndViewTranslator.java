package com.ten.utils;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * DO <---> VO translator
 * <p>
 * VO :View Object
 * DO :Data Object
 *
 * @author Administrator
 */
@Component
public class DataAndViewTranslator<DO, VO> {

    /**
     * DO ---> VO
     *
     * @param data DO
     * @return VO
     */
    public VO transDataToView(DO data) {
        return null;
    }

    /**
     * {@literal List<DO> ---> List<VO>}
     *
     * @param datas {@literal List<DO>}
     * @return {@literal List<VO>}
     */
    public List<VO> listTransDatasToViews(List<DO> datas) {
        return null;
    }

    /**
     * VO ---> DO
     *
     * @param view VO
     * @return DO
     */
    public DO transViewToData(VO view) {
        return null;
    }

    /**
     * {@literal List<VO> ---> List<DO>}
     *
     * @param views {@literal List<VO>}
     * @return {@literal List<DO>}
     */
    public List<DO> listTransViewsToDatas(List<VO> views) {
        return null;
    }

}
