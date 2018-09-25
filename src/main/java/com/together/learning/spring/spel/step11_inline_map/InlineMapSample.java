package com.together.learning.spring.spel.step11_inline_map;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.Map;

/**
 * @author jiangjian
 */
public class InlineMapSample {
    public static void main(String[] args) {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("{name:'jiangian',age:'27'}");
        Map<String, String> values = (Map<String, String>) expression.getValue();
        values.forEach((k, v) -> System.out.println(k + "--->" + v));
    }
}
