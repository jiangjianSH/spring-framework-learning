package com.together.learning.spring.step9;

public class Outer {
    private Inner inner;

    public Inner getInner() {
        return inner;
    }

    public void setInner(Inner inner) {
        this.inner = inner;
    }

    @Override
    public String toString() {
        return "Outer{" +
                "inner=" + inner +
                '}';
    }
}
