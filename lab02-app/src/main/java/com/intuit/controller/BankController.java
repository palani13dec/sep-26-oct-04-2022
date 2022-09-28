package com.intuit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.service.AccountService;

@RestController
public class BankController {

	@Autowired
	private AccountService accountService;
}
