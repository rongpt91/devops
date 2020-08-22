package com.sample.devops.service;

import org.springframework.stereotype.Service;

/**
 * Service for hello world
 * @author rohangupta
 *
 */
@Service("helloWorldService")
public class HelloWorldService {
 
	private String name;
 
	public void setName(String name) {
		this.name = name;
	}
 
	public String sayHello() {
		return "Hello! " + name;
	}
}