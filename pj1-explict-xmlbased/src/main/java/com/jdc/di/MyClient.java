package com.jdc.di;

public class MyClient {
	
	public MyService service;
	public String name;
	public MyClient() {
		
	}
	
	public MyClient(MyService service)
	{
		super();
		this.service = service;
		this.name = "Default Name";
	}
	
	public void setMyService(MyService service)
	{
		this.service = service;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void showMessage()
	{
		System.out.printf("%s -> %s %n",name, service.message());
	}
}
