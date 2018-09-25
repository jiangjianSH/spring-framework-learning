package com.together.learning.spring.spel.step22_navigation_operator;

import org.springframework.expression.spel.standard.SpelExpressionParser;

public class NavigationOperationSample {
    public static void main(String[] args) {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        A a = new A(null);
        String value  = expressionParser.parseExpression("b?.c?.value").getValue(a, String.class);
        System.out.println(value);

        A a1 = new A(new B(new C("jiangjian")));
        String value1  = expressionParser.parseExpression("b?.c?.value").getValue(a1, String.class);
        System.out.println(value1);
    }
}
