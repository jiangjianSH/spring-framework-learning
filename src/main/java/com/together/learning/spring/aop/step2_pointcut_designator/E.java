package com.together.learning.spring.aop.step2_pointcut_designator;

import org.springframework.stereotype.Component;

/**
 * @author jiangjian
 */
@Component
public class E implements Display {
    @Override
    public void display() {
        System.out.println("I am E");
    }
}
