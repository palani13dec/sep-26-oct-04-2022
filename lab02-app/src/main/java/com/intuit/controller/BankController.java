package com.intuit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.service.AccountService;

@RestController
@RequestMapping("/bank")

public class BankController {

	@Autowired
	private AccountService accountService;

	@PutMapping("/deposit")
	public String deposit(@RequestParam("accountnumber") int accountNumber, @RequestParam int amount) {
		accountService.deposit(accountNumber, amount);
		return "Deposit success";
	}

	@PutMapping("/withdraw")
	public String withdraw(@RequestParam("accountnumber") int accountNumber, @RequestParam int amount) {
		accountService.withdraw(accountNumber, amount);
		return "Withdraw success";
	}
}
