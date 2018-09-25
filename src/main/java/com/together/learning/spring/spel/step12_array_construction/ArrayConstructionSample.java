package com.together.learning.spring.spel.step12_array_construction;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

/**
 * You cannot currently supply an initializer when you construct multi-dimensional array.
 */
public class ArrayConstructionSample {
    public static void main(String[] args) {
        SpelExpressionParser expressionParser = new SpelExpressionParser();
        EvaluationContext context = new StandardEvaluationContext();
        int[] numbers1 = (int[]) expressionParser.parseExpression("new int[4]").getValue(context);

        // Array with initializer
        int[] numbers2 = (int[]) expressionParser.parseExpression("new int[]{1,2,3}").getValue(context);

        // Multi dimensional array
        int[][] numbers3 = (int[][]) expressionParser.parseExpression("new int[4][5]").getValue(context);
    }
}
