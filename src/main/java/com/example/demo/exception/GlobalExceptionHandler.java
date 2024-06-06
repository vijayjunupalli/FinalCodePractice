package com.example.demo.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    // Individual exception handler
    /*@ExceptionHandler(EmployeeDetailsEmptyException.class)
    public ErrorDto empDetailsEmptyException(EmployeeDetailsEmptyException employeeDetailsEmptyException) {

        return ErrorDto.builder().status("fail")
                .errorMessage(employeeDetailsEmptyException.getMessage())
                .statusCode(HttpStatus.INTERNAL_SERVER_ERROR).build();

    }*/


    /**
     * Centralized exception method which handles all exceptions
     * and thus eliminates the need of individual exception handlers
     */
    @ExceptionHandler(CentralException.class)
    public ErrorDto centralException(CentralException ex) {

        return ErrorDto.builder().status("second failure")
                .errorMessage(ex.getMessage())
                .statusCode(HttpStatus.BAD_REQUEST).build();


    }
}
