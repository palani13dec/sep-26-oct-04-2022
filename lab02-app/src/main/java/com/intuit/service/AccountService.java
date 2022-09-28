package com.intuit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intuit.repo.AccountRepository;

//Same as @Component, just gives a different conceptual meaning
@Service 
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
}
