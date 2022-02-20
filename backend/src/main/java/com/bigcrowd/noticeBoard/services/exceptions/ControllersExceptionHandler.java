package com.bigcrowd.noticeBoard.services.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bigcrowd.noticeBoard.controllers.exceptions.StandardError;

@ControllerAdvice
public class ControllersExceptionHandler {

	@ExceptionHandler(ControllerNotFoundException.class)
	public ResponseEntity<StandardError> entityNotFound(ControllerNotFoundException e, HttpServletRequest request){
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError();
		err.setTimestamp(Instant.now());
		err.setStatus(status.value());
		err.setError("Entity not fount");
		err.setMessage(e.getMessage());
		err.setPath(request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
}
