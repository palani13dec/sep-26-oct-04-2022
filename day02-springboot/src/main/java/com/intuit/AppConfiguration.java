package com.intuit;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//similar to creating beans.xml file in core spring
@Configuration
public class AppConfiguration {
	
	//<bean class="java.util.List"></bean>
	@Bean
	public List<String> simpleHobbies() {
		return Arrays.asList("Eating", "Sleeping", "Watching TV");
	}
	
	@Bean
	public List<String> complexHobbies() {
		return Arrays.asList("Visit Heritage monuments", "MMA");
	}

}
