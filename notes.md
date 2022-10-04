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
* All the beans are in __singleton scope__ by default
* Active Container; It instantiates all the beans during startup
* Components are instantiated using default no-args constructor
* You have to specify the values explicitly if a paremeterized constructor is found

## Day 01 (Recap)

* Dependency injection
* ApplicationContext that acts as a container
* Container instantiates all the beans on startup
* Singleton scope by default
* Create Java beans
* @Component, @Autowired, @Value, @Scope, @Lazy
* Spring starter/Spring Initialzr
* Configuring key=value pairs in application.properties
* You can refer to the property using __${xyz}__


## Day 02 (Recap)

* configuring properties in .properties or .yml files
* @ConfigurationProperties(prefix="parentProperty")
* Class marked with __@Configuration__
* You can configure __@Bean__ 
* You can differentiate using __@Qualifier__
* Spring boot with Web
* Embedded Tomcat container
* Create @RestController and map the methods using @Get/Post/Put Mapping
* @PathVariable, @RequestParam
* Heart of a Spring boot web application is __DispatcherServlet__
* The response is automatically serialized into JSON (Jackson)
* __@RequestBody__
* RestTemplate and HttpClient



## Controller vs RestController

* RestController returns data (Json or text or xml)
* Controller returns view(or page) information
* View has to be resolved to a physical page


## Day 03 (Recap)

* __@Controller__ that's used to create traditional web applications
* JdbcTemplate to perform CRUD operations in DB
* JPA 
* Create a table; Create an Entity class; Map the table and the class; Map the columns with the properties
* Define a Repository by specifying the Entity class and the Primary key type



* java -jar -Dserver.port=8083 day04-jpa-web-0.0.1-SNAPSHOT.jar


## Day 04 (Recap)

* Spring Data REST
* custom methods in JPA
* findBy, findAllBy,
* JPA QL, Native query
* Deployed as jar files
* Package it as a jar using maven (__mvn build package__)
* Dynamically change the properties using __-Dkey=<value>__ option
	
## Spring Cloud tools

* Spring Cloud
* __Eureka__ (discovery) service
* Gateway service (Zuul)
* A service that wants to talk to another service uses the Gateway service
* __Gateway__ service will get the details of the service from Eureka and route the request
* __Client load balancer__ (Ribbon)
* __Hystrix__ (Circuit Breaker; Deprecated; In the latest version we use Resilience4j)
* __Actuator__ to get the metrics of a running Spring boot application


## Spring Security

* Add Spring Security
* User/Password is generated for you
* Customize user/password through yml file
* Customize the endpoints that need authentication by creating a configuration class
* Provide InMemory Authentication by supplying the credentials in the configuration class
* Provide DaoAuthentication
* Use __UserDetails__ and __UserDetailsService__ to read the credentials from a DB
* Use OAuth and plugin github/FB/Gmail authentication

* -Dspring.profiles.active=<profileName>











