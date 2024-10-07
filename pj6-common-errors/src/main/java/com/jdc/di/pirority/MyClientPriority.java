package com.jdc.di.pirority;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyClientPriority {
	@Autowired
	private MyService myService;
	
	public void showMessage()
	{
		System.out.println(myService.getMessage());
	}
}
