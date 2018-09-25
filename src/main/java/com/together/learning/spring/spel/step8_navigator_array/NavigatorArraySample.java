package com.together.learning.spring.spel.step8_navigator_array;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author jiangjian
 */
public class NavigatorArraySample {
    public static void main(String[] args) {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("bs[0].value");
        A a = new A(new B[]{new B("jiangjian")});
        System.out.println(expression.getValue(a));
    }
}
