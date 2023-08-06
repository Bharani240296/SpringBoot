package com.boot.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.boot.Spring.HelloComponent.HelloCompo;

@SpringBootApplication
public class SpringannoApplication {

	public static void main(String[] args) {
		var context=SpringApplication.run(SpringannoApplication.class, args);
		HelloCompo hello=context.getBean(HelloCompo.class);
		System.out.println(hello.getHello());
	}

}
