* Create a new Spring Boot project **lab02-app** and add web, jpa and mysql templates
* Create a database **training** in MySQL, if you don't have it already. 
* Copy the following SQL queries in MySQL query window to create a table **accounts** 
```sql
create table `training`.`accounts` ( `account_number` int (4) NOT NULL AUTO_INCREMENT , `owner` varchar (40) NULL , `balance` int (7) NULL , PRIMARY KEY ( `account_number` ) );

INSERT INTO accounts(owner,balance) VALUES('John',2000);
```

* Given below is the skeleton of __AccountService__ class you need to implement
```java

public class AccountService {
 public void deposit(int accountNumber, int amount) {
	// update balance in accounts table
 }

 public void withdraw(int accountNumber, int amount) {
	// update balance in accounts table
 }
}
```

* Inject **AccountService** in your **BankController** class
* **BankController** is given below

```java
@RestController
@RequestMapping("/bank")
public class BankController {
 @PutMapping("/deposit")
 public String deposit(@RequestParam("accountnumber") int accountNumber, @RequestParam int amount) {
 }
 @PutMapping("/withdraw")
 public String withdraw(@RequestParam("accountnumber") int accountNumber, @RequestParam int amount) {
 }
}
```

* Create the Entities, Repositories and modify the controller and service classes appropriately

