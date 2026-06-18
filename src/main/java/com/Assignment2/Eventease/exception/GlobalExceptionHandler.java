package com.Assignment2.Eventease.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    // Handles custom exceptions
    @ExceptionHandler(ResourceNotFoundException.class)

    public ResponseEntity<String>
    handleResourceNotFound(
            ResourceNotFoundException ex){

        return new ResponseEntity<>(
                ex.getMessage(),
                HttpStatus.NOT_FOUND);

    }


    // Handles validation errors
    @ExceptionHandler(
            MethodArgumentNotValidException.class)

    public ResponseEntity<Map<String,String>>
    handleValidationException(
            MethodArgumentNotValidException ex){

        Map<String,String> errors =
                new HashMap<>();

        ex.getBindingResult()
                .getFieldErrors()
                .forEach(error -> {

                    errors.put(
                            error.getField(),
                            error.getDefaultMessage());

                });

        return new ResponseEntity<>(
                errors,
                HttpStatus.BAD_REQUEST);

    }


    // Handles all other exceptions
    @ExceptionHandler(Exception.class)

    public ResponseEntity<String>
    handleGeneralException(
            Exception ex){

        return new ResponseEntity<>(

                ex.getMessage(),

                HttpStatus.INTERNAL_SERVER_ERROR
        );

    }

}