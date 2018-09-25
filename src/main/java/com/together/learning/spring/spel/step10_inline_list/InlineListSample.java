package com.together.learning.spring.spel.step10_inline_list;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.List;

/**
 * @author jiangjian
 */
public class InlineListSample {
    public static void main(String[] args) {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("{1,2,3,4}");
        List<Integer> values = (List<Integer>) expression.getValue();
        values.forEach(System.out::println);
    }
}
