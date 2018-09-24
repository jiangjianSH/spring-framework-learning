package com.together.learning.spring.ioc.step25;

import java.math.BigDecimal;

public class A {
    private String strVal;
    private Float floatVal;
    private int intVal;
    private Double doubleVal;
    private BigDecimal bigDecimalVal;
    private boolean booleanVal;

    public String getStrVal() {
        return strVal;
    }

    public void setStrVal(String strVal) {
        this.strVal = strVal;
    }

    public Float getFloatVal() {
        return floatVal;
    }

    public void setFloatVal(Float floatVal) {
        this.floatVal = floatVal;
    }

    public int getIntVal() {
        return intVal;
    }

    public void setIntVal(int intVal) {
        this.intVal = intVal;
    }

    public Double getDoubleVal() {
        return doubleVal;
    }

    public void setDoubleVal(Double doubleVal) {
        this.doubleVal = doubleVal;
    }

    public BigDecimal getBigDecimalVal() {
        return bigDecimalVal;
    }

    public void setBigDecimalVal(BigDecimal bigDecimalVal) {
        this.bigDecimalVal = bigDecimalVal;
    }

    public boolean isBooleanVal() {
        return booleanVal;
    }

    public void setBooleanVal(boolean booleanVal) {
        this.booleanVal = booleanVal;
    }

    @Override
    public String toString() {
        return "A{" +
                "strVal='" + strVal + '\'' +
                ", floatVal=" + floatVal +
                ", intVal=" + intVal +
                ", doubleVal=" + doubleVal +
                ", bigDecimalVal=" + bigDecimalVal +
                ", booleanVal=" + booleanVal +
                '}';
    }
}
