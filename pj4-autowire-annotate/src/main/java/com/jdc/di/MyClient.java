package com.jdc.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyClient {
	@Autowired
	private MyService myService;
	


	public void showMesage()
	{
		System.out.println(myService.message());
		
	}
}
