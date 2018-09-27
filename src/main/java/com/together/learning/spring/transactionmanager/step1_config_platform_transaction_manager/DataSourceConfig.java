package com.together.learning.spring.transactionmanager.step1_config_platform_transaction_manager;

import org.springframework.context.annotation.*;

/**
 * @author jiangjian
 */
@Configuration
@ComponentScan
@ImportResource("classpath:transactionmanager/step1_config_platform_transaction_manager/spring-tx.xml")
public class DataSourceConfig {
//    @Autowired
//    private Environment env;
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
//        dataSource.setUrl(env.getProperty("spring.datasource.url"));
//        dataSource.setUsername(env.getProperty("spring.datasource.username"));
//        dataSource.setPassword(env.getProperty("spring.datasource.password"));
//        return dataSource;
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        return new DataSourceTransactionManager(dataSource());
//    }
}
