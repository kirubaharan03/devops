package com.oasys.HelloWorld.controller;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloWorldController {
	RestTemplate rest=new RestTemplate();
	@GetMapping(value="getHiviaHello")
	public String getHiviaHello() {
		String url="http://localhost:8080/getHiWorld";
		ResponseEntity<String>r=rest.exchange(url, HttpMethod.GET,null,String.class);
		String val=r.getBody();
		return val;
	}
}
