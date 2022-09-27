package com.intuit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my-company")
public class Company {

	private String name;
	private long employees;
	private String ceo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getEmployees() {
		return employees;
	}
	public void setEmployees(long employees) {
		this.employees = employees;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	@Override
	public String toString() {
		return name + ", " + employees + ", " + ceo;
	}
	
	
	
}
