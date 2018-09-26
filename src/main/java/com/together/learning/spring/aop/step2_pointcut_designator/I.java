package com.together.learning.spring.aop.step2_pointcut_designator;

import org.springframework.stereotype.Component;

/**
 * @author jiangjian
 */
@Component
public class I {
    @Lucky
    public void display() {
        System.out.println("I am I");
    }
}
