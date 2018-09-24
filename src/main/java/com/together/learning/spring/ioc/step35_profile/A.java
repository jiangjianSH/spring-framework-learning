package com.together.learning.spring.ioc.step35_profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class A {
    public A() {
        System.out.println("new A");
    }
}
