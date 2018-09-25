package com.together.learning.spring.spel.step13_method;

import org.springframework.expression.spel.standard.SpelExpressionParser;

public class MethodSample {
    public static void main(String[] args) {
        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        String value = (String) spelExpressionParser.parseExpression("'jiangjian'.substring(1, 3)").getValue(String.class);
        System.out.println(value);
    }
}
