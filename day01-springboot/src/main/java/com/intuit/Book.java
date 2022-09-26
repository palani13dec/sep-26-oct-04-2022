package com.intuit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

	private String title;
	private double price;
	private String author;
	private String publisher;
	
	public Book(@Value("Hacks") String title, 
			@Value("23.34") double price) {
		this.title = title;
		this.price = price;
	}
	
	
}
