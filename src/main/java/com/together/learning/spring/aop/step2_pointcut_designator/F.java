package com.together.learning.spring.aop.step2_pointcut_designator;

import org.springframework.stereotype.Component;

/**
 * @author jiangjian
 */
@Component
public class F {
    public void display(Object storage) {
        System.out.println("I am F");
    }

    public void display(String name, Storage storage) {
        System.out.println("I am F, name is " + name);
    }
}
