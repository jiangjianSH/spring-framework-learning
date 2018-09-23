package com.together.learning.spring.step9;

public class Inner {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Inner{" +
                "message='" + message + '\'' +
                '}';
    }
}
