package com.together.learning.spring.spel.step5_use_in_bean_definition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiangjian
 */
public class SpELUseInBeanDefinitionSample {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext();
        ((AnnotationConfigApplicationContext) ac).register(Lucky.class);
        ((AnnotationConfigApplicationContext) ac).refresh();

        Lucky lucky = ac.getBean(Lucky.class);
        System.out.println(lucky.getLotteryCount());
    }
}
