package com.together.learning.spring.spel.step23_collection_selection;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Arrays;
import java.util.List;

public class CollectionSelectionSample {
    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5);
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        EvaluationContext evaluationContext = new StandardEvaluationContext();
        evaluationContext.setVariable("lists", lists);
        List<Integer> even = expressionParser.parseExpression("#lists.?[#this % 2 == 0]").getValue(evaluationContext, List.class);
        even.forEach(System.out::println);

        Integer firstEven = expressionParser.parseExpression("#lists.^[#this % 2 == 0]").getValue(evaluationContext, Integer.class);
        System.out.println(firstEven);

        Integer lastEven = expressionParser.parseExpression("#lists.$[#this % 2 == 0]").getValue(evaluationContext, Integer.class);
        System.out.println(lastEven);

    }
}
