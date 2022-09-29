* Continue with __lab02-app__
* In this lab you will learn about the REST style mapping conventions for entities
* Create an __AccountController__ class with the following end points

```
POST /accounts
GET /accounts/{accountNumber}
GET /accounts
PUT /accounts/{accountNumber}/balance/{balance}
DELETE /accounts/{accountNumber}  
```



* POST method will take an __Account__ as __@RequestBody__ for creating a new account

* Modify the __AccountService__ class to include the appropriate implementations