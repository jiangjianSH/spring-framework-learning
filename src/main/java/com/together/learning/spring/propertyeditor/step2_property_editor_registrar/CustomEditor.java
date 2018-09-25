package com.together.learning.spring.propertyeditor.step2_property_editor_registrar;

import java.beans.PropertyEditorSupport;

/**
 * @author jiangjian
 */
public class CustomEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) {
        setValue(new A(text.toUpperCase()));
    }
}
