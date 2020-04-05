package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.controller.advice.ApiError;

@ControllerAdvice
public class AccountControllerAdvice {

	@ExceptionHandler({Exception.class})
	public ResponseEntity<?> handleException(Exception e) {
		ApiError apiError = new ApiError();
		apiError.setCode("500");
		apiError.setError(e.getMessage());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(apiError);
	}
	
}
