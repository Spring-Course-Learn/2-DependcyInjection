package com.jdc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jdc.di.MyClient;
import com.jdc.di.MyService;



@Configuration
public class ApplicationConfig {
	@Bean(name="service")
	MyService service()
	{
		return new MyService();
	}
	@Bean(name="client1")
	MyClient client1()
	{
		var bean=  new MyClient(service());
		bean.setName("Client 1");
		return bean;
	}
	
	@Bean(name="client2")
	MyClient client2()
	{
		var bean=  new MyClient(service());
		bean.setName("Client 2");
		return bean;
	}
}
