package com.together.learning.spring.dataaccess.jdbc.step17_spring_jdbc_with_transaction;

/**
 * @author jiangjian
 */
public class Address {
    private Long id;//和Use的id保持一致
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
