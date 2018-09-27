package com.together.learning.spring.transactionmanager.step3_transaction_event_listener;

import com.together.learning.spring.transactionmanager.step3_transaction_event_listener.entity.Foo;
import com.together.learning.spring.transactionmanager.step3_transaction_event_listener.service.FooService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiangjian
 */
public class TransactionEventListenerSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        FooService fooService = ac.getBean(FooService.class);
        fooService.insertFoo(new Foo());
        ((AnnotationConfigApplicationContext) ac).registerShutdownHook();
    }
}
