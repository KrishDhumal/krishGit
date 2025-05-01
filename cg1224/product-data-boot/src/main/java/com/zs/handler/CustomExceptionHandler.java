package com.zs.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.zs.service.InvalidProductException;

@ControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
	
		return new ResponseEntity<>( ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(InvalidProductException.class)
	public ResponseEntity<Object> handleInvalidProductException(InvalidProductException ex) {
	
		return new ResponseEntity<>( ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
