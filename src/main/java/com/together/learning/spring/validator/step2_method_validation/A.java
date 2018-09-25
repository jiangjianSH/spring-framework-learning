package com.together.learning.spring.validator.step2_method_validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author jiangjian
 */
@Component
@Validated
public class A {
    public void echo(@NotNull @Size(min = 3, max = 10) String content) {
        System.out.println(content);
    }
}
