package com.together.learning.spring.transactionmanager.step1_config_platform_transaction_manager;

import com.together.learning.spring.transactionmanager.step1_config_platform_transaction_manager.entity.Foo;
import com.together.learning.spring.transactionmanager.step1_config_platform_transaction_manager.service.FooService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiangjian
 */
public class PlatformTransactionManagerSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(DataSourceConfig.class);
        FooService fooService = ac.getBean(FooService.class);
        try {
            fooService.updateFoo(new Foo());
        }catch (Exception e) {}

        try {
            fooService.insertFoo(new Foo());
        }catch (Exception e){}
    }
}
