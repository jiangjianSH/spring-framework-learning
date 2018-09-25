package com.together.learning.spring.propertyeditor.step1_custom_property_editor;

import java.beans.PropertyEditorSupport;

/**
 * @author jiangjian
 */
public class AEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) {
        setValue(new A(text.toUpperCase()));
    }
}
