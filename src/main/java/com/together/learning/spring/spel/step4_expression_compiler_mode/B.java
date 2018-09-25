package com.together.learning.spring.spel.step4_expression_compiler_mode;

/**
 * @author jiangjian
 */
public class B {
    private C c;

    public B(C c) {
        this.c = c;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "AFactoryBean{" +
                "c=" + c +
                '}';
    }
}
