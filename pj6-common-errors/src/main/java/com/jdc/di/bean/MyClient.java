package com.jdc.di.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class MyClient {
	@Autowired
	@Qualifier("s1")
	private MyService myService;
	
	public void showMessage()
	{
		System.out.println(myService.getMessage());
	}
}
