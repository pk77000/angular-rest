package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class HelloController2 {
	
	@RequestMapping(value="hi",method=RequestMethod.GET)
	String sayHello(){
		return "Hello, World!";
	}
}
