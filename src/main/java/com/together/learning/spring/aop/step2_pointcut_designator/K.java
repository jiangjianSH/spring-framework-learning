package com.together.learning.spring.aop.step2_pointcut_designator;

import org.springframework.stereotype.Component;

/**
 * @author jiangjian
 */
@Component("k")
public class K {
    public void display() {
        System.out.println("I am K");
    }
}
