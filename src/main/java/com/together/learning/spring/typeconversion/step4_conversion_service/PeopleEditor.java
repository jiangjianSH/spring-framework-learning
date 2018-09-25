package com.together.learning.spring.typeconversion.step4_conversion_service;

import java.beans.PropertyEditorSupport;

/**
 * @author jiangjian
 */
public class PeopleEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
       setValue(new People(text.toUpperCase(), "no"));
    }
}
