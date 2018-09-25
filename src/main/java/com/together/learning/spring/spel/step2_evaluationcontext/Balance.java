package com.together.learning.spring.spel.step2_evaluationcontext;

import java.math.BigDecimal;

/**
 * @author jiangjian
 */
public class Balance {
    private BigDecimal value;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "value=" + value +
                '}';
    }
}
