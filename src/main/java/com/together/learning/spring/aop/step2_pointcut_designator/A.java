package com.together.learning.spring.aop.step2_pointcut_designator;

import org.springframework.stereotype.Component;

/**
 * @author jiangjian
 */
@Component
public class A {
    public Integer add(int a, int b) {
        return a + b;
    }
}
