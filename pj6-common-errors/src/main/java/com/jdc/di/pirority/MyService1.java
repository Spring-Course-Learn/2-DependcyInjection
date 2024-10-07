package com.jdc.di.pirority;

import org.springframework.stereotype.Component;

import jakarta.annotation.Priority;

@Component
@Priority(1)
public class MyService1 implements MyService {
			private String name;
			
			public MyService1()
			{
				name = "Service 1";
			}

			@Override
			public String getMessage() {
				// TODO Auto-generated method stub
				return "Hello Spring from %s".formatted(name);
			}
}
