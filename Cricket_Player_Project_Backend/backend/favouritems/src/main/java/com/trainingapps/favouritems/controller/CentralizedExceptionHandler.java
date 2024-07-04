package com.trainingapps.favouritems.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.trainingapps.favouritems.exceptions.PlayerAlreadyExistException;
import com.trainingapps.favouritems.exceptions.PlayerNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class CentralizedExceptionHandler {
	private static final Logger log = LoggerFactory.getLogger(CentralizedExceptionHandler.class);
	
	 	@ResponseStatus(HttpStatus.NOT_FOUND)
	    @ExceptionHandler(PlayerNotFoundException.class)
	    public String handleProductNotFound(PlayerNotFoundException e) {
	        log.info("PLayer Not found",e);
	 		String msg = e.getMessage();
	        
	        return msg;
	    }

	 	@ResponseStatus(HttpStatus.BAD_REQUEST)
	    @ExceptionHandler(PlayerAlreadyExistException.class)
	    public String handAlreadyExistInWatchListException(PlayerAlreadyExistException e)
	    {
	 		log.info("Player Already Exist");
	        String msg=e.getMessage();
	        return msg;
	    }
}
