package com.app.springbootmongoDb.springbootMongoDb.controller;

import java.util.*;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/app")
public class RestTemplateController {

	
	@Autowired 
	public RestTemplate restTemplate;
	
	
	@GetMapping("/booklist")
	public List<Object> getListofBooks(){
		String url = "http://localhost:8088/getAllbooks";
		Object[] obj = restTemplate.getForObject(url, Object[].class);
		System.out.println("Object >>>  with external api gateway >>> " + obj.toString());
		
		return Arrays.asList(obj);
		
	}
	
	
	
}
