package org.dsm;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author luobingkai
 * @create 2019/10/11
 * @since 1.0.0
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DsmleanConsumer {

    public static void main(String[] args) {
        SpringApplication.run(DsmleanConsumer.class);
    }
}

