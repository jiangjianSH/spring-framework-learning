package com.together.learning.spring.ioc.step30;

import javax.annotation.Resource;

public class A {
    @Resource
    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
