package com.together.learning.spring.ioc.step36_environment.property_placeholder_helper;

import org.springframework.util.PropertyPlaceholderHelper;
import org.springframework.util.SystemPropertyUtils;

import java.util.Properties;

/**
 * @author jiangjian
 */
public class PropertyPlaceHolderHelperSample {
    public static void main(String[] args) {
        PropertyPlaceholderHelper propertyPlaceholderHelper = new PropertyPlaceholderHelper(SystemPropertyUtils.PLACEHOLDER_PREFIX,
                SystemPropertyUtils.PLACEHOLDER_SUFFIX);
        Properties properties = new Properties();
        properties.put("name", "jiangjian");
        properties.put("secret", "gift");
        properties.put("gift", "gold");
        System.out.println(propertyPlaceholderHelper.replacePlaceholders("I am ${name} ${${secret}}", properties));
    }
}
