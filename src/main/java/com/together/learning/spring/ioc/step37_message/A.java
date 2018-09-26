package com.together.learning.spring.ioc.step37_message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * @author jiangjian
 */
@Component
public class A {
    @Autowired
    private MessageSource messageSource;

    public MessageSource getMessageSource() {
        return messageSource;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void output(Locale locale) {
        System.out.println(messageSource.getMessage("author.name", null, locale));
    }

    public void output(String message, Locale locale) {
        System.out.println(messageSource.getMessage(message, null, locale));
    }
}
