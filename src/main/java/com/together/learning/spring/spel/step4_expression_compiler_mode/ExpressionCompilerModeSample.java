package com.together.learning.spring.spel.step4_expression_compiler_mode;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author jiangjian
 */
public class ExpressionCompilerModeSample {
    public static void main(String[] args) {
//        SpelParserConfiguration parserConfiguration = new SpelParserConfiguration(SpelCompilerMode.IMMEDIATE, null);
        SpelParserConfiguration parserConfiguration = new SpelParserConfiguration();

        A a = new A(new B[] {new B(new C("h"))});
        SpelExpressionParser expressionParser = new SpelExpressionParser(parserConfiguration);
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) {
            Expression expression = expressionParser.parseExpression("b[0].c.value");
            expression.setValue(a, "g");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

    }
}
