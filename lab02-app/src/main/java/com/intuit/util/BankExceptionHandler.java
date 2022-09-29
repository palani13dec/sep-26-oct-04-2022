package com.intuit.util;

import java.time.LocalTime;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.intuit.dto.AccountErrorDto;
import com.intuit.exception.AccountNotFoundException;

@RestControllerAdvice
public class BankExceptionHandler {
	
	@ExceptionHandler(AccountNotFoundException.class)
	public HttpEntity<AccountErrorDto> handleException(AccountNotFoundException ex, WebRequest req) {
		
		AccountErrorDto dto = new AccountErrorDto();
		dto.setMessage("Account " + ex.getMessage() + " is not found");
		dto.setTimestamp(LocalTime.now().toString());
		dto.setPath(req.getDescription(false));
		
		ResponseEntity<AccountErrorDto> responseEntity = 
				new ResponseEntity<>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
		return responseEntity;
	}

}
