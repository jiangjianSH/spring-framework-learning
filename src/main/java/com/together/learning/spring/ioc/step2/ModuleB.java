package com.together.learning.spring.ioc.step2;

public class ModuleB {
    private DataSource moduleBDataSource;

    public DataSource getModuleBDataSource() {
        return moduleBDataSource;
    }

    public void setModuleBDataSource(DataSource moduleBDataSource) {
        this.moduleBDataSource = moduleBDataSource;
    }
}
