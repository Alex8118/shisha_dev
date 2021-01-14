package com.tobacco.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandling {

    @ExceptionHandler()
    public ResponseEntity<Object> apiException(HttpClientErrorException ex) {
        ApiError apiError = ApiError.builder()
                .timestamp(new Date())
                .error("Integration's error")
                .details(ex.getMessage())
                .build();
        return new ResponseEntity<Object>(apiError, HttpStatus.NOT_FOUND);
    }
}
