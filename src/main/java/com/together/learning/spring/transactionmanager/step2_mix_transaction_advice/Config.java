package com.together.learning.spring.transactionmanager.step2_mix_transaction_advice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author jiangjian
 */
@Configuration
@ComponentScan
@ImportResource("classpath:transactionmanager/step2_mix_transaction_advice/spring-tx.xml")
public class Config {
}
