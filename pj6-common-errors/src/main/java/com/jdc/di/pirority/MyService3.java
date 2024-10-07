package com.jdc.di.pirority;

import org.springframework.stereotype.Component;

import jakarta.annotation.Priority;

@Component
@Priority(3)
public class MyService3 implements MyService{
	private String name;
	
	public MyService3()
	{
		name = "Service 3";
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello Spring from %s".formatted(name);
	}
}
