package org.dsm;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author luobingkai
 * @create 2019/10/11
 * @since 1.0.0
 */
@SpringBootApplication
@EnableDubboConfiguration
@ImportResource(locations = "classpath:META-INF/dubbo/dubbo-consumer.xml")
public class DsmleanConsumer {

    public static void main(String[] args) {
        SpringApplication.run(DsmleanConsumer.class);
    }
}

