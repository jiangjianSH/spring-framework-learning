package com.together.learning.spring.ioc.step36_environment.propertysource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 下面的${switch:dev} 指定了默认值是dev
 */
@Configuration
@PropertySource("classpath:ioc/step36_environment/propertysource/config-${switch:dev}.properties")
public class Config {
}
