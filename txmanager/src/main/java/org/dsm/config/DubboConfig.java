package org.dsm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @program: dsmlean
 * @description:
 * @author: luobingkai
 * @create: 2019-10-14 16:54
 */

@Configuration
@ImportResource({"META-INF/dubbo/dubbo-filter.xml"})
public class DubboConfig {
}
