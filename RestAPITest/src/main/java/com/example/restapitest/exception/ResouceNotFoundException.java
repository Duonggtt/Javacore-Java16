package com.example.restapitest.exception;

public class ResouceNotFoundException extends RuntimeException{
    public ResouceNotFoundException(String message) {
        super(message);
    }
}
