package com.intuit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intuit.entity.Account;
import com.intuit.service.AccountService;

//Spring Data REST

@RestController
@RequestMapping("/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping
	public String createAccount(@RequestBody Account account) {
		return accountService.createAccount(account);
	}
	
	@GetMapping
	public List<Account> getAllAccounts() {
		return accountService.getAllAccounts();
	}
	
	@GetMapping("/{accountNumber}")
	public Account getAccount(@PathVariable int accountNumber) {
		return accountService.getAccount(accountNumber);
	}
	
	@DeleteMapping("/{accountNumber}")
	public String deleteAccount(@PathVariable int accountNumber) {
		return accountService.deleteAccount(accountNumber);
	}
	
	@PatchMapping("/{accountNumber}/balance/{balance}") 
	public String updateBalance(@PathVariable int accountNumber, @PathVariable int balance) {
		return accountService.updateBalance(accountNumber, balance);
	}
	
}
