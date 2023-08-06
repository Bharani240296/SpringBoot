package com.example.demo.Controller;

import org.springframework.stereotype.Component;

@Component("hello")
public class HelloController {
	
	public String getHello()
	{
		return "HelloWorld";
	}

}
