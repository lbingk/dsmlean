package org.dsm.annotation;

import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.*;

/**
 * @program: dsmlean
 * @description:
 * @author: luobingkai
 * @create: 2019-10-14 15:26
 */

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Transactional
public @interface TxManagerFlag {
}
