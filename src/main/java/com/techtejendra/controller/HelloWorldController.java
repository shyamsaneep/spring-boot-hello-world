package com.techtejendra.controller;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

@RestController  
public class HelloWorldController   
{  
	@RequestMapping("/")  
	public String hello()   
	{  
		java.util.Date date=new java.util.Date(); 
		return "<center><H1>Greetings for the day</H1></br><h2 style=\"color:red;\">"+date+"</h2><center>";  
	}  
}