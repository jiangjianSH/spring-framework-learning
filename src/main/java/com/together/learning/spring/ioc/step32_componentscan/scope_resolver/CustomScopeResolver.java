package com.together.learning.spring.ioc.step32_componentscan.scope_resolver;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ScopeMetadata;
import org.springframework.context.annotation.ScopeMetadataResolver;
import org.springframework.context.annotation.ScopedProxyMode;

public class CustomScopeResolver implements ScopeMetadataResolver {
    @Override
    public ScopeMetadata resolveScopeMetadata(BeanDefinition definition) {
        ScopeMetadata scopeMetadata = new ScopeMetadata();
        scopeMetadata.setScopedProxyMode(ScopedProxyMode.TARGET_CLASS);
        scopeMetadata.setScopeName(BeanDefinition.SCOPE_PROTOTYPE);
        return scopeMetadata;
    }
}
