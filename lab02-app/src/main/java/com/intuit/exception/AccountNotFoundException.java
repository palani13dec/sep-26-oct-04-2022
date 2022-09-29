package com.intuit.exception;

public class AccountNotFoundException extends RuntimeException {
	public AccountNotFoundException(int accountNumber) {
		super(accountNumber + "");
	}

}
