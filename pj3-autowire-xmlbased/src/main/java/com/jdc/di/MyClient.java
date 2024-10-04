package com.jdc.di;

public class MyClient {
	
	private MyService myService;
	
	public MyClient(MyService myService)
	{
		this.myService = myService;
	}
	public void showMesage()
	{
		System.out.println(myService.message());
		
	}
}
