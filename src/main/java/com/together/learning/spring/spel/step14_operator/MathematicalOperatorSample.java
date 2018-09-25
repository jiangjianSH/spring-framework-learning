package com.together.learning.spring.spel.step14_operator;

import org.springframework.expression.spel.standard.SpelExpressionParser;

public class MathematicalOperatorSample {
    public static void main(String[] args) {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        System.out.println(expressionParser.parseExpression("1 + 1").getValue(Integer.class));
        System.out.println(expressionParser.parseExpression("1 - 1").getValue(Integer.class));
        System.out.println(expressionParser.parseExpression("1 * 1").getValue(Integer.class));
        System.out.println(expressionParser.parseExpression("1 / 1").getValue(Integer.class));
        System.out.println(expressionParser.parseExpression("5 % 2").getValue(Integer.class));

    }
}
