package com.together.learning.spring.ioc.step28;

import org.springframework.beans.factory.annotation.Autowired;

public class MainBean {
    private A a;

    @Autowired
    private B[] bArray;

    private C c;

    private D d;

    @Autowired
    public MainBean(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public B[] getbArray() {
        return bArray;
    }

    public void setbArray(B[] bArray) {
        this.bArray = bArray;
    }

    public C getC() {
        return c;
    }

    @Autowired
    public void setC(C c) {
        this.c = c;
    }

    public D getD() {
        return d;
    }

    @Autowired(required = false)
    public void setD(D d) {
        this.d = d;
    }
}
