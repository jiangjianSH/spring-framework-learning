package com.together.learning.spring.ioc.step33_jsr330;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class A {
    @Inject
    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
