package com.together.learning.spring.ioc.step8;

public class ClientBean {
    private TargetBean targetBean;

    public TargetBean getTargetBean() {
        return targetBean;
    }

    public void setTargetBean(TargetBean targetBean) {
        this.targetBean = targetBean;
    }
}
