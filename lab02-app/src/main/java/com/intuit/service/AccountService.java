package com.intuit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intuit.entity.Account;
import com.intuit.exception.AccountNotFoundException;
import com.intuit.repo.AccountRepository;

//Same as @Component, just gives a different conceptual meaning
@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public void deposit(int accountNumber, int amount) {
		Account account = getAccount(accountNumber);
		account.setBalance(account.getBalance() + amount);
		accountRepository.save(account);
	}
	
	public void withdraw(int accountNumber, int amount) {
		Account account = getAccount(accountNumber);
		//balance > amount is left out intentionally for the sake of simplicity
		account.setBalance(account.getBalance() - amount);
		accountRepository.save(account);
	}
	
	public Account getAccount(int accountNumber) {
		Optional<Account> optAccount = accountRepository.findById(accountNumber);
		if(optAccount.isPresent()) {
			Account account = optAccount.get();
			return account;
		} else {
			throw new AccountNotFoundException(accountNumber);
		}
	}

	public List<Account> getAllAccounts() {
		return accountRepository.findAll();
	}


	public String deleteAccount(int accountNumber) {
		Account account = getAccount(accountNumber);
		accountRepository.delete(account);
		return "Deleted " + accountNumber;
	}

	public String updateBalance(int accountNumber, int balance) {
		Account account = getAccount(accountNumber);
		account.setBalance(balance);
		accountRepository.save(account);
		return "Updated balance";
	}

	public String createAccount(Account account) {
		accountRepository.save(account);
		return "Created " + account.getAccountNumber();
	}

}
