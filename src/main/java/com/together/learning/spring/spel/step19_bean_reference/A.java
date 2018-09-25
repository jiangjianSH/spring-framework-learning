package com.together.learning.spring.spel.step19_bean_reference;

import org.springframework.stereotype.Component;

@Component(value = "a")
public class A {
    @Override
    public String toString() {
        return "a";
    }
}
