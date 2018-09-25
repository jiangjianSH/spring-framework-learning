package com.together.learning.spring.spel.step16_constructor;

import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ConstructorSample {
    public static void main(String[] args) {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        People people = expressionParser.parseExpression("new com.together.learning.spring.spel.step16_constructor.People('jiangjian', 27)")
                .getValue(People.class);
        System.out.println(people);
    }
}
