* Create a Spring Boot application __my-secured-app__ by selecting Spring Web and Spring security templates
* Start the application
* default username is __user__ and password is in the console, generated for you.
* For example console shows __Using generated security password: 5fd13e36-d18f-4e48-befd-ea73e2556559__
* Access the application __http://localhost:8080__ and enter the credentials
* You can customize the credentials

``` yml

spring:
  security:
    user:
      name: sam
      password: sam123

```

* Try running the application now.

* Create a Sample Controller 

``` java

@RestController
public class SampleController {

	@GetMapping("/home/{name}")
	public String home(@PathVariable String name) {
		return "Welcome home " + name;
	}
	
	@GetMapping("/hi/{name}")
	public String hi(@PathVariable String name) {
		return "Hi " + name;
	}
}
```

* Let's secure __/home/{name}__ 

* Create the following class and configure settings by overriding __configure(HttpSecurity http)__ 

``` java

@Configuration
@EnableWebSecurity
public class MyConfiguration extends WebSecurityConfigurerAdapter {

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.antMatchers("/home/**")
			.authenticated()
			.and().formLogin();
		
		http
		.authorizeRequests()
		.antMatchers("/hi/**")
		.permitAll();
	}
	
}

```

* Try accessing __/hi/sam__ and __/home/sam__ and observe the difference

* Now let's replace our default credentials in yml and add the following 

``` java

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("joe").password("{noop}joe123").roles("admin");
	}

```

* Try accessing __/hi/sam__ and __/home/sam__ and observe the difference

* Let's replace the in memory authentication with database authentication provider. __Discussed in the class__

