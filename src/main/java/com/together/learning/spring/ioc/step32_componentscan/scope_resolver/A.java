package com.together.learning.spring.ioc.step32_componentscan.scope_resolver;

import org.springframework.stereotype.Component;

@Component
public class A {
    public A() {
        System.out.println("A constructor");
    }

    public void sayWhat() {
        System.out.println("what");
    }
}
