package com.together.learning.spring.propertyeditor.step2_property_editor_registrar;

/**
 * @author jiangjian
 */
public class A {
    private String content;

    public A(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "A{" +
                "content='" + content + '\'' +
                '}';
    }
}
