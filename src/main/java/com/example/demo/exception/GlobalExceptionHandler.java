package com.example.demo.exception;


import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeDetailsEmptyException.class)
    public EmployeeDetailsEmptyException getExceptionDetails(){


        return null;
    }
}
