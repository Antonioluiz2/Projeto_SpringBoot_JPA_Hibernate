package com.antonioluiz.portifolio.resource.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.antonioluiz.portifolio.service.exceptions.DatabaseException;
import com.antonioluiz.portifolio.service.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	 public ResponseEntity<StandardError> se(ResourceNotFoundException e,
			 HttpServletRequest request){
		String error="Resource not Found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err=new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
		 
	 }
	
	@ExceptionHandler(DatabaseException.class)
	 public ResponseEntity<StandardError> se(DatabaseException e,
			 HttpServletRequest request){
		String error="Database erro";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError err=new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
		 
}
}

