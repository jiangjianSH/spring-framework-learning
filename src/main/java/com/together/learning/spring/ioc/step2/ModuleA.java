package com.together.learning.spring.ioc.step2;

public class ModuleA {
    private DataSource moduleADataSource;

    public DataSource getModuleADataSource() {
        return moduleADataSource;
    }

    public void setModuleADataSource(DataSource moduleADataSource) {
        this.moduleADataSource = moduleADataSource;
    }
}
