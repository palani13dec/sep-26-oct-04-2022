* Technically is a collection of jars or libraries

``` java
class Account {
	accountNumber, balance;
	deposit(amount) {
		
	}
	withdraw(amount) {
		
	}
	transferFund(to, amount) {
		// deduct balance from my account
		// modify balance in 'to' account
	}
}
```

## Enterprise services

* Pool of Account objects
* transferFund method, you need to a __transaction__ service
* withdraw, transferFund need additional security service

* EJB (Enterprise Java Beans)
* EJB is a heavyweight solution; You have to make a lot of changes to the design of your code so that your code can get the enterprise services

## Enter spring framework

* Spring framework is a lightweight framework that provides your code with the enterprise services like txn, object pooling, messaging, security etc
* POJO framework
* _
* Latest version of Spring is 5.x
```
* Create a Maven/Gradle project 
* Add the spring dependencies
* Create Ordinary Java classes (Java beans)
* Configure the java beans and specify what services they need
* Load the container provided by spring
* Access the beans and their methods
```

## Enter spring boot

* Bootstrap application development with Spring

```
* Create a spring boot project
* Create Ordinary Java classes (Java beans)
* Access the beans and their methods
```

* An abstraction of spring framework

## ApplicationContext

* Container that manages the lifecycle of the beans







