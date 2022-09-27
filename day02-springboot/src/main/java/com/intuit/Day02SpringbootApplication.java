package com.intuit;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Day02SpringbootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Day02SpringbootApplication.class, args);
	}

	@Autowired
	private Car car1;
	
	@Autowired
	private Company company;
	
	@Autowired
	private Person person;

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(car1.getModel() + ", " + car1.getYear());
//		System.out.println(company);
//		System.out.println(person.getHobbies());
		
		
		String url = "http://localhost:8081/calc/add/12/12";
		
		//RestTemplate
		//RestTemplate restTemplate = new RestTemplate();
		//restTemplate.setMessageConverters(null);
		//ResponseEntity<Integer> responseEntity = restTemplate.getForEntity(url, Integer.class);
		//System.out.println("Result: " + responseEntity.getBody());
		
		
		HttpClient httpClient = HttpClient.newBuilder()
	            .version(HttpClient.Version.HTTP_1_1)
	            .build();
		
		HttpRequest request = HttpRequest.newBuilder()
				  .uri(new URI(url))
				  .version(HttpClient.Version.HTTP_1_1)
				  .GET()
				  .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
		
		
	}
}
