package com.together.learning.spring.spel.step9_navigator_map;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiangjian
 */
public class NavigatorMapSample {
    public static void main(String[] args) {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("maps['name']");
        Map<String, String> maps = new HashMap<>();
        maps.put("name", "jiangjian");
        A a = new A();
        a.setMaps(maps);
        System.out.println(expression.getValue(a));
    }
}
