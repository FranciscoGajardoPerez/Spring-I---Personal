package com.example.be_java_hisp_w19_g2.handlers;

public class UserNotSeller extends RuntimeException {
    public String message;

    public UserNotSeller(){};

    public UserNotSeller(String message) {
        super(message);
    }
}
