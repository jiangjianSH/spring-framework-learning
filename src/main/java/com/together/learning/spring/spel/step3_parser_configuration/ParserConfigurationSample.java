package com.together.learning.spring.spel.step3_parser_configuration;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.SpelParserConfiguration;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author jiangjian
 */
public class ParserConfigurationSample {
    public static void main(String[] args) {
        SpelParserConfiguration parserConfiguration = new SpelParserConfiguration(true, true);
        SpelExpressionParser expressionParser = new SpelExpressionParser(parserConfiguration);
        Expression expression = expressionParser.parseExpression("storage[2]");
        Storage storage = new Storage();
        expression.getValue(storage);
        System.out.println(storage.getStorage() == null);
        if(storage.getStorage() != null) {
            System.out.println(storage.getStorage().size());
        }
    }
}
