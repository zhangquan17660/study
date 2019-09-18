package com.zq.anno.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Spring配置类相当于xml
 */
@Configuration
@ComponentScan(value = {"com.zq.anno"})
@Import({JdbcConfig.class,TransationConfig.class})
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
public class SpringConfiguration {
}
