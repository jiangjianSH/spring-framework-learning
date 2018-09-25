package com.together.learning.spring.spel.step4_expression_compiler_mode;

/**
 * @author jiangjian
 */
public class C {
    private String value;

    public C(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "C{" +
                "value='" + value + '\'' +
                '}';
    }
}
