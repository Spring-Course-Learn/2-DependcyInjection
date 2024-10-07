package com.jdc.di.pirority;

import org.springframework.stereotype.Component;

import jakarta.annotation.Priority;

@Component
@Priority(2)
public class MyService2 implements MyService{
	private String name;
	
	public MyService2()
	{
		name = "Service 2";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello Spring from %s".formatted(name);
	}
}
