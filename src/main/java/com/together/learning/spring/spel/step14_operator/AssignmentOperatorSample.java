package com.together.learning.spring.spel.step14_operator;

import org.springframework.expression.spel.standard.SpelExpressionParser;

public class AssignmentOperatorSample {
    public static void main(String[] args) {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        People p = new People();
        p.setName("alice");
        System.out.println(expressionParser.parseExpression("name = 'bob'").getValue(p, String.class));
        System.out.println(p);
    }
}
