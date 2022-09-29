package com.intuit;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "myaccounts")
public interface AccountRepository extends  JpaRepository<Account, Integer> {
	//finder methods
	//findBy or findAllBy
	
	Account findByAccountNumber(int accountNumber);
	Account findByAccountNumberAndOwner(int accountNumber, String owner);
	Account findByOwnerAndAccountNumber(String owner, int accountNumber);
	Account findByOwnerAndBalance(String owner, int balance);
	Account findByAccountNumberAndOwnerAndBalance(int accountNumber, String owner, int balance);
	Account findByBalanceAndAccountNumberAndOwner(int balance, int accountNumber, String owner);
	
	List<Account> findAllByAccountNumber(int accountNumber);
	List<Account> findAllByBalance(int balance);
	List<Account> findAllByAccountNumberAndOwner(int accountNumber, String owner);
	List<Account> findAllByOwnerAndAccountNumber(String owner, int accountNumber);
	List<Account> findAllByOwnerAndBalance(String owner, int balance);
	List<Account> findAllByAccountNumberAndOwnerAndBalance(int accountNumber, String owner, int balance);
	List<Account> findAllByBalanceAndAccountNumberAndOwner(int balance, int accountNumber, String owner);
	
	List<Account> findAllByBalanceGreaterThan(int balance);
	
	@Query(value = "select a from Account a where a.balance > :p1")
	List<Account> fetchAllWithBalanceGt(@Param("p1") int balance);
	
	
	@Query(value = "select * from accounts a where a.balance > :p1", nativeQuery = true)
	List<Account> fetchAllWithBalanceGreaterThan(@Param("p1") int balance);
	
	@RestResource(exported = false)
	@Modifying
	@Query("update Account a set a.balance = :bal where a.accountNumber = :accNum")
	void updateBalance(@Param("accNum") int accountNumber, @Param("bal") int balance);
	
}
