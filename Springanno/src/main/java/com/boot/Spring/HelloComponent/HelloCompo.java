package com.boot.Spring.HelloComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boot.Spring.Helloworld.HelloAuto;

@Component
public class HelloCompo {
	
	// Field Based
	@Autowired
	private HelloAuto Hello;
	
	/* constructor Based
	 
	@Autowired
	public HelloCompo(HelloAuto hello)
	{
		this.Hello=hello;
	}
	
	*/
	
	/*  Setter Based
	@Autowired
	public void setHello(HelloAuto hello) {
	
		Hello = hello;
	}
	
	*/
	public String getHello()
	{
		return Hello.getHello();
	}
}
