package com.trainingapps.saleapp.productms.controller;

import com.trainingapps.saleapp.productms.exceptions.InvalidProductIdException;
import com.trainingapps.saleapp.productms.exceptions.InvalidProductNameException;
import com.trainingapps.saleapp.productms.exceptions.InvalidProductPriceException;
import com.trainingapps.saleapp.productms.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class CentralizedExceptionHandler {


    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ProductNotFoundException.class)
    public String handleProductNotFound(ProductNotFoundException e) {
        String msg = e.getMessage();
        return msg;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(
            {
                    InvalidProductPriceException.class,
                    InvalidProductNameException.class,
                    InvalidProductIdException.class,
                    MethodArgumentNotValidException.class,
                    ConstraintViolationException.class
            })
    public String handleInvalidInput(Exception e){
        String msg = e.getMessage();
        return msg;
    }




}
