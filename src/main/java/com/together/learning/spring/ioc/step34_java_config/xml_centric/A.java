package com.together.learning.spring.ioc.step34_java_config.xml_centric;

public class A {
    private B b;

    public A(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
