package org.dsm.annotation;

import java.lang.annotation.*;

/**
 * @author luobingkai
 * @create 2019/10/11
 * @since 1.0.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@com.alibaba.dubbo.config.annotation.Service
@org.springframework.stereotype.Service
public @interface Service {
}

