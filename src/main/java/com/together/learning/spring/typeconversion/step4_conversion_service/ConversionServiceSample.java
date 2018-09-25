package com.together.learning.spring.typeconversion.step4_conversion_service;

import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

/**
 * @author jiangjian
 */
public class ConversionServiceSample {
    public static void main(String[] args) {
        ConversionService conversionService = new DefaultConversionService();
        ((DefaultConversionService) conversionService).addConverter(new StringToAddress());
        Address address = conversionService.convert("china/anhui/hefei", Address.class);
        System.out.println(address);

        /**
         * Following use ObjectToObjectConverter
         */
        People people = conversionService.convert("jiangjian", People.class);
        System.out.println(people);
    }
}
