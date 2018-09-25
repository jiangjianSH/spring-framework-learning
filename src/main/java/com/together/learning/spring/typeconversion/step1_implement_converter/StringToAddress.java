package com.together.learning.spring.typeconversion.step1_implement_converter;

import org.springframework.core.convert.converter.Converter;

/**
 * @author jiangjian
 */
public class StringToAddress implements Converter<String, Address> {
    @Override
    public Address convert(String source) {
        String[] infos = source.split("/");
        Address address = new Address();
        if(infos.length >= 1) {
            address.setCountry(infos[0]);
        }
        if(infos.length >= 2) {
            address.setProvince(infos[1]);
        }
        if(infos.length >=3) {
            address.setCity(infos[2]);
        }
        return address;
    }
}
