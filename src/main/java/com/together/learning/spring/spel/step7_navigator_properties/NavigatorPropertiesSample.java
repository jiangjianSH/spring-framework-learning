package com.together.learning.spring.spel.step7_navigator_properties;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author jiangjian
 */
public class NavigatorPropertiesSample {
    public static void main(String[] args) {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("b.value");
        A a = new A(new B("jiangjian"));
        System.out.println(expression.getValue(a));
    }
}
