package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.Controller.HelloController;
@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
	var context=SpringApplication.run(DemoApplication.class, args);
	HelloController hello=(HelloController) context.getBean("hello");
	System.out.println(hello.getHello());
	
	}

}
