package cn.texous.open.base.commons.exception.annotation;

import cn.texous.open.base.commons.enums.HttpStatus;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * insert description here
 *
 * @author texousliu
 * @since 2022-08-18
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface RespStatus {

    HttpStatus value() default HttpStatus.OK;

}
