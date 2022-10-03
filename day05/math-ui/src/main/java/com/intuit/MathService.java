package com.intuit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MathService {

	private RestTemplate restTemplate = new RestTemplate();
	
	@Value("${math.service.base.url}")
	private String mathServiceBaseUrl;
	
	public int getSquare(int num) {
		String url = mathServiceBaseUrl + "/square/" + num;
		ResponseEntity<Integer> responseEntity = restTemplate.getForEntity(url, Integer.class);
		return responseEntity.getBody();
	}

}
