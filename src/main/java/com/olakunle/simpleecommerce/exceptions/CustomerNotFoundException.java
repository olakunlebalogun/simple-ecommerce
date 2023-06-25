package com.olakunle.simpleecommerce.exceptions;

import org.springframework.http.HttpStatus;

public class CustomerNotFoundException extends RuntimeException{

    private HttpStatus status;
    public CustomerNotFoundException(String message, HttpStatus statusCode) {
        super(message);
        this.status = statusCode;
    }

    public CustomerNotFoundException(String message){
        super(message);
    }

    public CustomerNotFoundException(String message, Throwable cause, HttpStatus statusCode) {
        super(message, cause);
        this.status = statusCode;
    }
}
