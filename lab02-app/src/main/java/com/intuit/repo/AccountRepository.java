package com.intuit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intuit.entity.Account;

public interface AccountRepository extends  JpaRepository<Account, Integer> {

}
