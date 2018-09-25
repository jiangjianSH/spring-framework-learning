package com.together.learning.spring.spel.step24_collection_projection;

import com.together.learning.spring.ioc.step29.People;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.ArrayList;
import java.util.List;

public class CollectionProjectionSample {
    public static void main(String[] args) {
        List<People> peoples = new ArrayList<>();
        peoples.add(new People("alice"));
        peoples.add(new People("bob"));

        SpelExpressionParser expressionParser = new SpelExpressionParser();
        EvaluationContext evaluationContext = new StandardEvaluationContext();
        evaluationContext.setVariable("peoples", peoples);

        List<String> names = expressionParser.parseExpression("#peoples.![name]").getValue(evaluationContext, List.class);
        names.forEach(System.out::println);
    }
}
