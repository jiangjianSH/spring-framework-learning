package com.together.learning.spring.ioc.step27;

import org.springframework.beans.factory.annotation.Required;

public class A {
    private B b;

    public B getB() {
        return b;
    }

    @Required
    public void setB(B b) {
        System.out.println("call setB");
        this.b = b;
    }
}
