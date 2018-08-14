package com.ten.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Model Object Conversion
 * example : VO <-> DO
 *
 * @author wshten
 * @date 2018/8/14 0014
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Convertible {

    /**
     * source model  VO/DO
     */
    Class<?> source() default Object.class;

    /**
     * target model  DO/VO
     */
    Class<?> target() default Object.class;
}
