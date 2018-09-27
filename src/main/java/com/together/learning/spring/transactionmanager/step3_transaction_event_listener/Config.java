package com.together.learning.spring.transactionmanager.step3_transaction_event_listener;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author jiangjian
 */
@Configuration
@ComponentScan
@ImportResource("classpath:transactionmanager/step3_transaction_event_listener/spring-tx.xml")
public class Config {

}
