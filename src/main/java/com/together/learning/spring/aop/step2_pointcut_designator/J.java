package com.together.learning.spring.aop.step2_pointcut_designator;

import org.springframework.stereotype.Component;

/**
 * @author jiangjian
 */
@Component
public class J {
    public void display(User user) {
        System.out.println("I am J, name is " + user.getName());
    }
}
