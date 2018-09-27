package com.together.learning.spring.dataaccess.step2_mix_transaction_advice;

import com.together.learning.spring.dataaccess.step2_mix_transaction_advice.entity.Foo;
import com.together.learning.spring.dataaccess.step2_mix_transaction_advice.service.FooService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiangjian
 */
public class MixTransactionAdviceSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        FooService fooService = ac.getBean(FooService.class);

        fooService.insertFoo(new Foo());
    }
}
