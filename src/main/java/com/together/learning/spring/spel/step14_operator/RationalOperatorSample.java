package com.together.learning.spring.spel.step14_operator;

import org.springframework.expression.spel.standard.SpelExpressionParser;

public class RationalOperatorSample {
    public static void main(String[] args) {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        System.out.println(expressionParser.parseExpression(" 1 > 2").getValue(Boolean.class));

        System.out.println(expressionParser.parseExpression(" 1 >= 2").getValue(Boolean.class));

        System.out.println(expressionParser.parseExpression(" 1 < 2").getValue(Boolean.class));

        System.out.println(expressionParser.parseExpression(" 1 <= 2").getValue(Boolean.class));

        System.out.println(expressionParser.parseExpression(" 1 != 2").getValue(Boolean.class));

    }
}
