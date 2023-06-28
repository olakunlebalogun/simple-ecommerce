package com.olakunle.simpleecommerce.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends RuntimeException{
    private HttpStatus status;
    public ProductNotFoundException(String message, HttpStatus statusCode) {
        super(message);
        this.status = statusCode;
    }

    public ProductNotFoundException(String message){
        super(message);
    }

    public ProductNotFoundException(String message, Throwable cause, HttpStatus statusCode) {
        super(message, cause);
        this.status = statusCode;
    }
}
