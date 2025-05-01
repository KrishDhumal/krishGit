package com.zs.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.zs.excep.InvalidUserException;

@ControllerAdvice
public class GlobalHandler {

	@ExceptionHandler(InvalidUserException.class)
	public ResponseEntity<String> handleUserException(InvalidUserException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	
}
