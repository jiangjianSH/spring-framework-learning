package com.together.learning.spring.typeconversion.step4_conversion_service;

import org.springframework.context.support.AbstractRefreshableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

/**
 * @author jiangjian
 */
public class ConversionServiceSample {
    public static void main(String[] args) {
        AbstractRefreshableApplicationContext ac = new ClassPathXmlApplicationContext("typeconversion/step4_conversion_service/spring-application.xml");
        ConversionService conversionService = ac.getBeanFactory().getConversionService();
        ((DefaultConversionService) conversionService).addConverter(new StringToAddress());
        Address address = conversionService.convert("china/anhui/hefei", Address.class);
        System.out.println(address);

        /**
         * Following use ObjectToObjectConverter
         */
        Country country = conversionService.convert("china", Country.class);
        System.out.println(country);

        /**
         * if we use ConversionService, then PropertyEditor mechanism does not work
         */
        People people = conversionService.convert("jiangjian", People.class);
        System.out.println(people);
    }
}
