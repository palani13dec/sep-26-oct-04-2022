package com.intuit;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Training {

	@Value("${course}")
	private String name;
	
	@Value("${topics}")
	private List<String> topics;
	
	public String getName() {
		return name;
	}
	public List<String> getTopics() {
		return topics;
	}
	
	
}
