package com.together.learning.spring.sourcecode.core;

import org.springframework.asm.ClassReader;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import javax.persistence.Entity;

/**
 * @author jiangjian
 */
public class AnnotationTypeFilterSample {
    public static void main(String[] args) {
        AnnotationTypeFilter filter = new AnnotationTypeFilter(Entity.class);
//        ClassReader classReader = new ClassReader();
//        filter.match()
    }
}
