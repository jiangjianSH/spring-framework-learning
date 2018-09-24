package com.together.learning.spring.ioc.step35_profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class B {

    public B() {
        System.out.println("new B");
    }
}
